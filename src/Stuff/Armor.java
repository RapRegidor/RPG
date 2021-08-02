package Stuff;

public class Armor extends Item{
    private String body;
    private int defense;
    public Armor(String file, String name, String type, String body, int defense, boolean sellable, int dropRate, int cost){
        super(file, name, type, sellable, dropRate, cost);
        this.body = body;
        this.defense = defense;
    }
    public String toString(){
        return "Name: " + super.getName() + "\nDefense:" + defense + "\n" + super.toString();
    }
    public String getBody(){
        return body;
    }
    public int getDefense(){
        return defense;
    }
}
