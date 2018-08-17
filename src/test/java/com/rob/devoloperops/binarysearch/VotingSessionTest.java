package com.rob.devoloperops.binarysearch;

import org.junit.Test;
import org.mockito.Mock;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class VotingSessionTest {


    Motion motion = new Motion("roadtax");



    VotingSession session = new VotingSession(motion);
    Voter senate = new SenateVoter("john");
    Voter vicepresident = new VpVoter("mike pence");


    @Test
    public void testopenVote() {

        boolean ans = true;
        boolean val;
        val = session.openVote();
        assertEquals(ans,val);
    }

    @Test
    public void testvote() throws ExcessVotersException {
        String yesOrNo = "yes";
        session.vote(yesOrNo,senate);
        motion.addyesVote();
        assertEquals(motion.countyesVotes(),1);


    }

    @Test(expected = TimeNotElapsedException.class)
    public void testcloseVote() throws TimeNotElapsedException {
        session.openVote();
        session.closeVote();

    }


    @Test
    public void testduplicateVoters() throws ExcessVotersException {

        String yesOrNo = "yes";
        session.openVote();
        session.vote(yesOrNo,senate);
        session.vote(yesOrNo,senate);
        int votercount = session.voters.size();

        assertEquals(votercount,1);
    }




    @Test
    public void tiedMotion() throws ExcessVotersException {

        String yesOrNo = "yes";
        session.tiedMotion(yesOrNo,vicepresident);
        int n = motion.countyesVotes();
        assertEquals(n,1);

    }


    @Test
    public void testpassorFail() throws ExcessVotersException {
        String yesOrNo = "yes";
        session.openVote();
        session.vote(yesOrNo,senate);

        assertNotNull("not null",session.passorFail());
    }

    @Test
    public void testmotionDates() throws ExcessVotersException {

        String yesOrNo = "yes";
        session.openVote();
        session.vote(yesOrNo,senate);

        assertNotNull("not null",session.motionDates());
    }

    @Test
    public void countVotingResults() throws ExcessVotersException {
        Map<String,Integer> countvote = new HashMap<>();
        countvote.put("yes",1);
        String voterName = "mike pence";
        String yesOrNo = "yes";
         session.openVote();
         session.vote(yesOrNo,senate);
         session.countVotingResults();
        assertEquals(session.countVotingResults().get("yes"),countvote.get("yes"));

    }
}