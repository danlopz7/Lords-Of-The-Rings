package com.lotr;

import com.lotr.creatures.Creature;

import java.util.ArrayList;

public class Army {
    
    private String armyName;
    ArrayList<Creature> army;

    public Army(String name, int size){
        this.armyName = name;
        this.army = new ArrayList<>(size);
    }

    public void insertIntoArmy(Creature creature){
        army.add(creature);
    }

    public ArrayList<Creature> getArmy() {
        return army;
    }

    public int getArmySize() {
        return this.army.size();
    }

    public String getArmyName() {
        return this.armyName;
    }
}