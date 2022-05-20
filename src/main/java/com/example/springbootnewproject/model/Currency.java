package com.example.springbootnewproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Currency {

    @Id
    @GeneratedValue
    int id;
    String name;
    String nation;

    public Currency() {
    }

    public Currency(int id, String name, String nation) {
        this.id = id;
        this.name = name;
        this.nation = nation;
    }

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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
