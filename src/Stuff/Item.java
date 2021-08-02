package Stuff;

import Foundation.Items;
import GUI.ImagePaint;

public class Item {
    private String file;
    private String name;
    private String type;
    private boolean sellable;
    private int dropRate;
    private int cost;

    public Item(String file, String name, String type, boolean sellable, int dropRate, int cost){
        this.file = file;
        this.name = name;
        this.type = type;
        this.sellable = sellable;
        this.dropRate = dropRate;
        this.cost = cost;
    }
    public String getName(){
        return name;
    }
    public String getFile(){
        return file;
    }
    public String getType(){ return type; };
    public boolean isSellable(){
        return sellable;
    }
    public int getCost(){
        return cost;
    }
    public String toString(){
        if(ImagePaint.getOpenShop() && ImagePaint.getBuy()) {
            return "Cost: " + cost;
        }
        return "";
    }

    public String getBody() {
        return this.getBody();
    }
    public int getDefense() {
        return this.getDefense();
    }
    public int getDamage(){return this.getDamage();}
    public int getDropRate(){
        return dropRate;
    }
}
