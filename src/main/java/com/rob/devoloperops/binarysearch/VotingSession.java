package com.rob.devoloperops.binarysearch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class VotingSession {


    Motion motion;

    Set<Voter> voters = new HashSet<>();

    Map<String, Integer> votermap = new HashMap<>();

    private static final int MAX_VOTES = 100;

    private static final long VOTING_TIME = 15 * 60 * 1000;  // set up 15 minutes or more  voting time

    public boolean isVotingOpen;

    public String votingStatus;

    public String passorfail;

    long votingStart;

    long votingEnd;


    public VotingSession(Motion motion) {

        this.motion = motion;

    }



    public boolean openVote() {
        votingStart = Calendar.getInstance().getTimeInMillis();
        this.isVotingOpen = true;
        votingStatus = "open";

        return isVotingOpen;
    }




    public void vote( String yesOrNo,Voter voter) throws ExcessVotersException {
        if(!(voter instanceof VpVoter)){
        if (isVotingOpen) {
            voters.add(voter);
            if (voters.size() <= MAX_VOTES ) {
                if (yesOrNo.toLowerCase() == "yes") {
                    this.motion.addyesVote();
                } else if (yesOrNo.toLowerCase() == "no") {
                    this.motion.addNoVotes();
                }
            } else {
                throw new ExcessVotersException("More Than expected amount of voters!");
            }
        }
    }


    }



    public void closeVote() throws TimeNotElapsedException {
        votingEnd = Calendar.getInstance().getTimeInMillis();

        if ((votingEnd - votingStart) < VOTING_TIME) {

            throw new TimeNotElapsedException("Time to close voting session  not elapsed!");
        }
        Map<String, Integer> votemap = countVotingResults();
        Integer noVotes = votemap.get("no");
        Integer yesVotes = votemap.get("yes");
        if (noVotes == yesVotes) {
            votingStatus = "tied";
        } else {
            votingStatus = "closed";
            isVotingOpen = false;

        }


    }




    public void tiedMotion( String yesOrNo,Voter voter) throws ExcessVotersException {

        if(voter instanceof VpVoter){
        voters.add(voter);
        if (voters.size() <= MAX_VOTES + 1) {
            if (yesOrNo.toLowerCase() == "yes") {
                this.motion.addyesVote();
            } else if (yesOrNo.toLowerCase() == "no") {
                this.motion.addNoVotes();
            }
            votingStatus = "closed";

        } else {
            throw new ExcessVotersException("More Than expected amount of voters!");
        }
    }

    }



    public String getVotingStatus() {   // query to discover current state of a motion

        return votingStatus;
    }



    public String passorFail() {
        StringBuilder build = new StringBuilder();
        Map<String, Integer> votemap = countVotingResults();
        Integer noVotes = votemap.get("no");
        Integer yesVotes = votemap.get("yes");
        if (yesVotes > noVotes) {
            build.append("motion passed with");
            build.append(yesVotes.toString());
        } else {
            build.append("motion failed with");
            build.append(noVotes.toString());

        }

        return build.toString();
    }


    public String motionDates() {
        StringBuilder buildr = new StringBuilder();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        String votingstartDate = df.format(votingStart);
        buildr.append("voting start").append(votingstartDate);
        String votingendDate = df.format(votingEnd);
        buildr.append("voting end").append(votingendDate);

        return buildr.toString();

    }

    public Map<String, Integer> countVotingResults() {
        int noVotes = this.motion.countNoVotes();
        int yesVotes = this.motion.countyesVotes();
        votermap.put("no", noVotes);
        votermap.put("yes", yesVotes);
        return votermap;
    }


    public static void main(String[] args) {
     // simulate a client
        Motion motion = new Motion("roadtax");
        VotingSession votesession = new VotingSession(motion);
        Voter senate = new SenateVoter("david stalk");
        Voter senate1 = new SenateVoter("john smith");
        Voter vicepresident = new VpVoter("mike pence");
        votesession.openVote();

        try {
            votesession.vote("yes", senate);
            votesession.vote("no", senate1);
        } catch (ExcessVotersException e) {
            e.printStackTrace();
        }



        try {
            votesession.closeVote();
        } catch (TimeNotElapsedException e) {
            e.printStackTrace();
        }

        if (votesession.getVotingStatus().toLowerCase() == "tied") {

            try {
                votesession.tiedMotion("yes", vicepresident);
            } catch (ExcessVotersException e) {
                e.printStackTrace();
            }
        }

        String passfail = votesession.passorFail();
        String votetimes = votesession.motionDates();


    }


}
