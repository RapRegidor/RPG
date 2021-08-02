package Entities;

import Foundation.*;
import QuestLine.Quest;
import Stuff.Item;
import Maps.Floor;

import static Foundation.Mapping.*;

public class Player extends Entity{
    private int pLevel;
    private int exp;
    private int expReq;
    private int money;
    private Item[] inventory = new Item[12];
    private Item[] equipped = new Item[4];

    private Floor location;
    private Floor prevLoc;

    private int xStart;
    private int yStart;
    private String dir;
    private boolean openInv;
    private int helm;
    private int chest;
    private int boots;
    private boolean lvlUp;
    private Quest pQuest;

    private int goblin;
    private int slime;
    private int kobold;
    private int death;
    private int giantRat;
    private int questNum;

    public Player(int xStart, int yStart){
        super("Jimmy", 50, 10, 0);
        //Location stuff
        location = OUTSIDE_CASTLE;
        prevLoc = OUTSIDE_CASTLE;
        this.xStart = xStart;
        this.yStart = yStart;
        dir = "Down";

        //inventory & equipments starter
        openInv = false;
        inventory[0] = Items.getWeapons().get(0);
        inventory[1] = Items.getArmors().get(0);
        inventory[2] = Items.getArmors().get(1);
        inventory[3] = Items.getPotions().get(0);

        //some stats
        pLevel = 1;
        exp = 0;
        expReq = 100;
        money = 100;
        pQuest = null;

        //monster kills
        goblin = 0;
        slime = 0;
        kobold = 0;
        death = 0;
        giantRat = 0;
        questNum = -1;

    }
    //questLine commands
    public int getKobold(){
        return kobold;
    }
    public int getSlime(){
        return slime;
    }
    public int getGiantRat(){
        return giantRat;
    }
    public int getDeath(){
        return death;
    }
    public int getGoblin(){
        return goblin;
    }
    public void setQuestNum(int num){
        questNum = num;
    }
    public void increaseGoblin(){
        goblin++;
    }
    public void increaseSlime(){
        slime++;
    }
    public void increaseGiantRat(){
        giantRat++;
    }
    public void increaseDeath(){
        death++;
    }
    public void increaseKobold(){
        kobold++;
    }
    public void resetKill(){
        goblin = 0;
        slime = 0;
        giantRat = 0;
        death = 0;
        kobold = 0;
    }

    //if quest is not null and its equal to the monster name
    public Quest getPQuest(){
        return pQuest;
    }
    public void setPQuest(Quest q){
        pQuest = q;
    }
    public void removePQuest(){
        pQuest = null;
    }


    //combat stuff
    public int inflictDamage(){
        int weaponDmg = 0;
        if(equipped[0] != null){
            weaponDmg = equipped[0].getDamage();
        }else{
            weaponDmg = -4;
        }
        return weaponDmg + (int)(getStrength() * 0.4) + (int)(Math.random()*10) + 1;
    }
    public int receiveDamage(int dmg){
        int receive = dmg * (1 - getDefense()/100);
        subtractDmg(receive);
        return receive;
    }

    public void setHelm(int helm){
        this.helm = helm;
    }
    public void setChest(int chest){
        this.chest = chest;
    }
    public void setBoots(int boots){
        this.boots = boots;
    }
    public void updateDefense(){
        super.setDefense(helm + boots + chest);
    }

    public int getPLevel(){
        return pLevel;
    }

    //gives exp
    public void giveExp(int exp){
        this.exp = exp + this.exp;
        while(this.exp >= expReq){
            lvlUp();
            this.exp = this.exp - expReq;
            expReq = changeExpReq(pLevel);
        }
    }
    public void lvlUp(){
        pLevel++;
        super.setStrength(super.getStrength() + (int)(Math.random() * 5) + 1);
        super.setMaxHealth(super.getMaxHealth() + (int)(Math.random() * 20) + 11);
        replenishHp();
        lvlUp = true;
    }
    public boolean isLvlUp(){
        return lvlUp;
    }
    public void setLvlUp(){
        lvlUp = false;
    }

    //set up the expReq - recursion
    private int changeExpReq(int level){
        if(level == 1){
            return 75;
        }
        if(level == 30){
            return 30000;
        }
        return (int)(1.25 * changeExpReq(level - 1));
    }


    //receive money
    public void giveMoney(int money){
        this.money += money;
    }
    //get money
    public int getMoney(){
        return money;
    }
    //reduce money
    public void reduceMoney(int money){
        this.money -= money;
    }

    //equipped
    public Item[] getEquipped(){
        return equipped;
    }
    public boolean availableEquipmentSlot(int index){
        if(equipped[index] == null){
            return true;
        }
        return false;
    }
    public void setWeapon(Item weapon){
        equipped[0] = weapon;
    }

    public void setHelmet(Item armor){
        equipped[1] = armor;
    }

    public void setBreastplate(Item armor){
        equipped[2] = armor;
    }

    public void setBoots(Item armor){
        equipped[3] = armor;
    }


    //Place item in inventory
    public void addSlot(int index, Item item){
        inventory[index] = item;
    }
    //See if inventory has an open Slot
    public boolean availableSlot(int index){
        if(inventory[index] == null){
            return true;
        }
        return false;
    }
    public boolean isAvailableSlot(){
        for(int x = 0; x < inventory.length; x++) {
            if (inventory[x] == null) {
                return true;
            }
        }
        return false;
    }
    public void giveItem(Item item){
        for(int x = 0; x < inventory.length; x++) {
            if (inventory[x] == null) {
                inventory[x] = item;
                return;
            }
        }
    }

    public Item[] getInventory(){
        return inventory;
    }
    //remove item from the inventory
    public void removeSlot(int index){
        inventory[index] = null;
    }

    public boolean getOpenInv(){

        return openInv;
    }
    public void setOpenInv(boolean open){

        openInv = open;
    }

    public boolean availablePot(){
        for(int slot = 0; slot < inventory.length; slot++){
            if(inventory[slot] != null && inventory[slot].getType().equals("Potion")){
                return true;
            }
        }
        return false;
    }

    public void removePot(){
        for(int slot = 0; slot < inventory.length; slot++){
            if(inventory[slot] != null && inventory[slot].getType().equals("Potion")){
                inventory[slot] = null;
                return;
            }
        }
    }

    //Location
    public Floor getLocation(){

        return location;
    }

    public void setLocation(Floor loc){

        location = loc;
    }

    public void setPrevLocation(Floor loc){
        prevLoc = loc;
    }

    public Floor getPrevLocation(){
        return prevLoc;
    }

    public int getXStart(){

        return xStart;
    }

    public int getYStart(){
        return yStart;
    }

    public void addCoord(int x, int y){
        xStart += x;
        yStart += y;
    }

    public void setCoord(int x, int y){
        xStart = x;
        yStart = y;
    }

    public void setDir(String dir){
        this.dir = dir;
    }

    public String getDir(){
        return dir;
    }

    @Override
    public String toString(){
        return "Name: Jimmy \nLevel: " + pLevel + " (" + exp + "/" + expReq + ")\nHealth: " + getHealth() + "/" + getMaxHealth() + "\nStrength: " + getStrength() + "\nDefense: " + getDefense() + "\nCurrent money: " + money + " Gold";
    }
}
