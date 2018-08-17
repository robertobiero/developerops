package com.rob.devoloperops.binarysearch;

public class Motion {


    final String name;
    private int yesvotes;
    private int novotes;

    public Motion(String name){
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }

    public void addyesVote(){
        this.yesvotes++;
    }

    public int countyesVotes(){
        return this.yesvotes;
    }

    public void addNoVotes(){
        this.novotes++;
    }

    public int countNoVotes(){
        return this.novotes;
    }
}
