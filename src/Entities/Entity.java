package Entities;

public class Entity {
    private String name;
    private int maxHealth;
    private int health;
    private int strength;
    private int defense;

    public Entity(String name, int maxHealth, int strength, int defense){
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.strength = strength;
        this.defense = defense;
    }

    public void subtractDmg(int decrease){
        health -= decrease;
        if(health < 0){
            health = 0;
        }
    }
    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void addHealth(){
        health += 25;
        if(health > maxHealth){
            health = maxHealth;
        }
    }

    public void replenishHp(){
        health = maxHealth;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth){
        this.maxHealth = maxHealth;
    }

    public int getStrength(){
        return strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getDefense(){
        return defense;
    }

    public void setDefense(int def){
        this.defense = def;
    }

    public String toString(){
        return "";
    }
}
