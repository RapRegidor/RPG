package Stuff;

public class Potion extends Item{
    public Potion(String file, String name, String type, boolean sellable, int dropRate, int cost){
        super(file, name, type, sellable, dropRate, cost);
    }
    public String toString(){
        return "Name: " + super.getName() + "\nIncreases health by 25\n" + super.toString();
    }
}
