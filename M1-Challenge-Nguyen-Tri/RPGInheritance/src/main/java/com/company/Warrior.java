package com.company;

public class Warrior extends BaseCharacterProperties {
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.shieldStrength = shieldStrength;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public String greeting(){
        return "Hello, my name is " + getName() + ". I am a warrior.";
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
}
