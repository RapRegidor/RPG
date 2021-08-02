package Stuff;

public class Weapon extends Item{
    private int damage;
    public Weapon(String file, String name, String type, int damage, boolean sellable, int dropRate, int cost){
        super(file, name, type, sellable, dropRate, cost);
        this.damage = damage;
    }
    public int getDamage(){
        return damage;
    }
    public String toString(){
        return "Name: " + super.getName() + "\nDamage: " + damage + "\n" + super.toString();
    }
}
