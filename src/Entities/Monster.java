package Entities;

import GUI.Run;
import Stuff.Item;

import java.util.ArrayList;

public class Monster extends Entity{
    private ArrayList<Item> drops;
    private int expDrop; // this is going to depend on the level
    private int level;

    public Monster(String name, int level, int maxHealth, int strength, int defense, ArrayList<Item> drops, int expDrop){
        super(name, maxHealth, strength, defense);
        this.drops = drops;
        this.level = level;
        this.expDrop = expDrop;

    }
    public ArrayList<Item> getDrops(){
        return drops;
    }
    public String toString(){
        return "Name: " + getName() + "\nLevel: " + level + "\nHealth: " + getHealth() + "/" + getMaxHealth() + "\nStrength: " + getStrength() + "\nDefense: " + getDefense();
    }

    public int inflictDamage(){
        return getStrength()*3/2 + (int)(Math.random()*5) + 1;
    }

    public int receiveDamage(int dmg){
        int receive = dmg * (1 - getDefense()/100);
        subtractDmg(receive);
        return receive;
    }

    public int getExpDrop() {
        return expDrop;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getDefense() {
        return super.getDefense();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public int getMaxHealth() {
        return super.getMaxHealth();
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }
}
