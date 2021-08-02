package Entities;

import GUI.ImagePaint;
import GUI.Panel;
import GUI.Run;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static Foundation.Mapping.OUTSIDE_CASTLE;

public class Interactions {
    //add a Clicker to go to the next dialogue
    //private static String txt = "";
    private static String npc;
    private static ArrayList<String> txt = new ArrayList<String>(1);
    //Put an if statement inside for each. so if contained and click it will move on to the next txt.
    //Then if clicked again, closes it by putting txt = "";
    public static void checkSurrounding(){
        int randomGold = (int)(Math.random() * 10) + 6;

        String right = Run.getPlayer().getLocation().getTileAt(Run.getPlayer().getXStart() + 1, Run.getPlayer().getYStart()).getName();
        String left = Run.getPlayer().getLocation().getTileAt(Run.getPlayer().getXStart() - 1, Run.getPlayer().getYStart()).getName();
        String up = Run.getPlayer().getLocation().getTileAt(Run.getPlayer().getXStart(), Run.getPlayer().getYStart() - 1).getName();
        String down = Run.getPlayer().getLocation().getTileAt(Run.getPlayer().getXStart(), Run.getPlayer().getYStart() + 1).getName();
        if(!Run.getPlayer().getOpenInv() && !ImagePaint.getOpenShop() && !ImagePaint.getOpenTxt()) {
            if (right.equals("guard") || left.equals("guard") || up.equals("guard") || down.equals("guard")) {
                txt.add("Guard: \nWelcome to the Tintin checkpoint adventurer. People are always welcomed here. Come right in!");
                txt.add("Guard: \n*This armor is too heavy, I want to go home...*");
                npc = "guard";
            }
            if (right.equals("receptionist") || left.equals("receptionist") || up.equals("receptionist") || down.equals("receptionist")) {
                txt.add("Receptionist: \nHello there adventurer.");
                npc = "receptionist";
            }
            if (right.equals("blacksmith") || left.equals("blacksmith") || up.equals("blacksmith") || down.equals("blacksmith")) {
                txt.add("Blacksmith: \nGAHAHAHAHAHAHAHAHAHA \nWelcome to my humble abode human.");
                npc = "blacksmith";
            }
            if (right.equals("wizard") || left.equals("wizard") || up.equals("wizard") || down.equals("wizard")) {
                txt.add("Witch: \nDo you want to buy some health potions? It's just 25 gold each hehehe.");
                npc = "wizard";
            }
            if (right.equals("money") || left.equals("money") || up.equals("money") || down.equals("money")) {
                Run.getPlayer().giveMoney(randomGold);
                txt.add("You received " + randomGold + " Gold.");
                npc = "money";
            }
            if(Run.getPlayer().getPLevel() < 20 && (right.equals("portal1") || left.equals("portal1") || up.equals("portal1") || down.equals("portal1"))){
                txt.add("You must be at least level 20 to enter this portal");
                npc = "portal1";
            }
            if(Run.getPlayer().getPLevel() < 20 && (right.equals("portal2") || left.equals("portal2") || up.equals("portal2") || down.equals("portal2"))){
                txt.add("You must be at least level 20 to enter this portal");
                npc = "portal2";
            }
            if(Run.getPlayer().getPLevel() < 20 && (right.equals("portal3") || left.equals("portal3") || up.equals("portal3") || down.equals("portal3"))){
                txt.add("You must be at least level 20 to enter this portal");
                npc = "portal3";
            }
            if(Run.getPlayer().getPLevel() < 15 && (right.equals("portal4") || left.equals("portal4") || up.equals("portal4") || down.equals("portal4"))){
                txt.add("You must be a recognized hero to enter this portal.");
                npc = "portal4";
            }
        }
    }
    public static String getTxt(){
        if(txt.size() != 0){
            return txt.get(0);
        }
        return "";
    }
    public static void removeTxt(){
        txt.remove(0);
    }
    public static String getNpc(){
        return npc;
    }

}
