package com.example.demo.model;

import javax.sound.midi.MidiMessage;

public class Account {

    public Account(Integer id, String owner) {
        this.id = id;
        this.owner = owner;
    }

    private Integer id;
    private String owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
