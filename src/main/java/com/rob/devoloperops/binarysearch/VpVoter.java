package com.rob.devoloperops.binarysearch;

public class VpVoter extends Voter {


    private final String name;
    private boolean hasVoted;


     public VpVoter(String name){
         this.name = name;
         this.hasVoted = false;
     }


    @Override
    public String getName(){
        return this.name;
    }


    @Override
    public void voted(){
        this.hasVoted = true;
    }

    @Override
    public boolean allreadyVoted() {
        return this.hasVoted;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getName() == ((VpVoter) obj).getName();

    }

}
