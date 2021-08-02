package GUI;

import Battle.Fight;
import Entities.Player;
import Foundation.*;
import QuestLine.AvailableQuests;

import static Foundation.Mapping.*;
import static Loader.ImageLoader.load;

public class Run {
    private static Player player;

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame(){
        System.out.println("Most of these images are NOT mine. These include the trees, ships, and monsters.");
        load();
        Items.setWeapons();
        Items.setArmors();
        Items.setPotions();
        Items.setArmorShop();
        Items.setWeaponShop();
        AvailableQuests.questSetUp();

        player = new Player(50, 13);
        new Window();
    }

    public static Player getPlayer(){
        return player;
    }
    public static void moveMap(int x, int y){
        if(canMove(x,y) && !player.getOpenInv() && !ImagePaint.getOpenTxt() && !ImagePaint.getOpenShop() && !Fight.isEncounter()){
            player.addCoord(x, y);
            if(player.getLocation().getTileAt(player.getXStart(), player.getYStart()).getName().equals("grass_patch") && player.getLocation().getName().equals("OUTSIDE_CASTLE")){
                Fight.versus();
            }
        }
    }
    public static boolean canMove(int x, int y){
        boolean check = false;
        switch(player.getLocation().getTileAt(player.getXStart() + x, player.getYStart() + y).getName()){
            case "wooden_floor":
            case "stone_road":
            case "ground_1":
            case "ground_2":
            case "ground_3":
            case "ground_4":
            case "ground_5":
            case "ground_6":
            case "ground_7":
            case "ground_8":
            case "ground_9":
            case "ground_10":
            case "ground_11":
            case "ground_12":
            case "grass_patch":
                check = true;
                break;
            case "castle_gate":
                player.setPrevLocation(player.getLocation());
                player.setCoord(INSIDE_CASTLE.getEntPosX1(), INSIDE_CASTLE.getEntPosY1());//Change These to INSIDE_CASTLE.getPosX1(), INSIDE_CASTLE.getPosY1()
                player.setLocation(INSIDE_CASTLE);
                break;
            case "castle_gate1":
                player.setPrevLocation(player.getLocation());
                player.setCoord(OUTSIDE_CASTLE.getEntPosX1(), OUTSIDE_CASTLE.getEntPosY1());
                player.setLocation(OUTSIDE_CASTLE);
                break;
            case "portal1":
            case "portal2":
            case "portal3":
            case "portal4":
                if(player.getPLevel() >= 15) {
                    player.setPrevLocation(player.getLocation());
                    player.setCoord(BOSS_ROOM.getEntPosX1(), BOSS_ROOM.getEntPosY1());
                    player.setLocation(BOSS_ROOM);
                }
                break;
            case "row-5-col-5":
                player.setPrevLocation(player.getLocation());
                player.setCoord(GUILD.getEntPosX1(), GUILD.getEntPosY1());
                player.setLocation(GUILD);
                break;
            case "guild_exit":
                player.setPrevLocation(player.getLocation());
                player.setCoord(INSIDE_CASTLE.getEntPosX2(), INSIDE_CASTLE.getEntPosY2());
                player.setLocation(INSIDE_CASTLE);
                break;
            case "blacksmith_door":
                player.setPrevLocation(player.getLocation());
                player.setCoord(BLACKSMITH.getEntPosX1(), BLACKSMITH.getEntPosY1());
                player.setLocation(BLACKSMITH);
                break;
            case "blacksmith_exit":
                player.setPrevLocation(player.getLocation());
                player.setCoord(INSIDE_CASTLE.getEntPosX3(), INSIDE_CASTLE.getEntPosY3());
                player.setLocation(INSIDE_CASTLE);
                break;
        }
        return check;
    }
}
