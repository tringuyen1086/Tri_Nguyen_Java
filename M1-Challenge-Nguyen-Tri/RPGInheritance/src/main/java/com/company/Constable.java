package com.company;

public class Constable extends BaseCharacterProperties{
    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String greeting(){
        return "Hello, my name is " + getName() + ". I am a constable.";
    }

    public String arrest(String name){
        return "I am about to arrest " + name + "!";
    }

    public String jurisdiction(String name){
        return "I have jurisdiction over " + name + "!";
    }
    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
