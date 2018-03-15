package com.rob.devoloperops.backend.persistence.domain.backend;


import com.rob.devoloperops.enums.PlansEnum;
import com.sun.org.apache.xml.internal.utils.SerializableLocatorImpl;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Plan implements Serializable {




    public long getId() {
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



    public Plan(PlansEnum plansEnum) {
        this.id = plansEnum.getId();
        this.name = plansEnum.getPlanName();
    }


}
