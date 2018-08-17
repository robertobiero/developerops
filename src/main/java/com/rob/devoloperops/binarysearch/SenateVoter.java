package com.rob.devoloperops.binarysearch;

public class SenateVoter extends Voter {


    private final String name;
    private boolean hasVoted;
    int a = 111;

    public SenateVoter(String name){
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
    public int hashCode() {
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getName() == ((SenateVoter) obj).getName();

    }



}
