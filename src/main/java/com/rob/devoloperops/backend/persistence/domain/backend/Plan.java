package com.rob.devoloperops.backend.persistence.domain.backend;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plan {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static final long serialVersionUID = 1L;


    @Id
    private int id;

    private String name;

    public Plan(){}


}
