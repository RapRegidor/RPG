package GUI;

import Battle.Fight;
import Entities.Interactions;
import Entities.Player;
import Foundation.Items;
import Foundation.SortMethod;
import Loader.ImageLoader;
import Maps.*;
import QuestLine.AvailableQuests;
import QuestLine.Quest;
import Stuff.Item;

import java.awt.*;
import java.awt.image.BufferedImage;

import static Foundation.Mapping.OUTSIDE_CASTLE;

public class ImagePaint {

    //check if its open or not shops & dialogue
    private static boolean openShop;
    private static boolean openTxt;
    private static boolean check;
    private static int space;
    private static Item inv = null;
    private static Item temp = null;
    private static Item shop = null;
    private static boolean fight;
    private static boolean encounter;
    private static boolean ranAway;
    private static boolean failed;
    private static boolean gone;
    private static boolean sell;
    private static boolean buy;
    private static boolean optionBlacksmith;
    private static boolean optionBlacksmith2;
    private static boolean reception;

    private static boolean playerTurn;
    private static boolean options;
    private static boolean info;
    private static boolean attack;
    private static boolean potion;
    private static int timer;
    private static boolean used;
    private static int damage;
    private static int receive;
    private static boolean finish;
    public static boolean attacked;
    private static boolean lvledUp;
    private static int drop;
    private static boolean dead;
    private static boolean bought;
    private static boolean bought1;
    private static boolean buyPot;
    private static boolean armor;
    private static boolean weapon;
    private static boolean open;
    private static boolean choice;
    private static boolean choose;
    private static boolean done;
    private static boolean cancel;
    private static boolean deduct;
    private static boolean took;
    private static boolean submit;
    private static boolean got;
    private static int defeats;
    private static int penalty;


    private static Quest q = null;

    private static boolean openInfo;

    //buttons
    private static final Rectangle nextButton = new Rectangle(640, 390, 50,25);
    private static final Rectangle closeButton = new Rectangle(640, 15, 50,25);
    private static final Rectangle equipButton = new Rectangle(640, 315, 50,25);
    private static final Rectangle removeButton = new Rectangle(640, 350, 50,25);

    private static final Rectangle acceptButton = new Rectangle(640, 315, 50, 25);
    private static final Rectangle rejectButton = new Rectangle(640, 350, 50,25);

    private static final Rectangle usePotionButton =  new Rectangle(170, 365, 150, 25);
    private static final Rectangle attackButton =  new Rectangle(170, 320, 150, 25);
    private static final Rectangle checkInfoButton =  new Rectangle(375, 320, 150, 25);
    private static final Rectangle sortGold = new Rectangle(20, 20, 50,25);
    //inv slots
    private static final Rectangle invSlot1 = new Rectangle(40, 45, 75,75);
    private static final Rectangle invSlot2 = new Rectangle(40, 175, 75,75);
    private static final Rectangle invSlot3 = new Rectangle(40, 305, 75,75);
    private static final Rectangle invSlot4 = new Rectangle(140, 45, 75,75);
    private static final Rectangle invSlot5 = new Rectangle(140, 175, 75,75);
    private static final Rectangle invSlot6 = new Rectangle(140, 305, 75,75);
    private static final Rectangle invSlot7 = new Rectangle(240, 45, 75,75);
    private static final Rectangle invSlot8 = new Rectangle(240, 175, 75,75);
    private static final Rectangle invSlot9 = new Rectangle(240, 305, 75,75);
    private static final Rectangle invSlot10 = new Rectangle(340, 35, 75,75);
    private static final Rectangle invSlot11 = new Rectangle(340, 175, 75,75);
    private static final Rectangle invSlot12 = new Rectangle(340, 305, 75,75);

    //weapon shop
    private static final Rectangle wp1 = new Rectangle(45, 50, 75,75);
    private static final Rectangle wp2 = new Rectangle(175, 50, 75,75);
    private static final Rectangle wp3 = new Rectangle(305, 50, 75,75);
    private static final Rectangle wp4 = new Rectangle(435, 50, 75,75);
    private static final Rectangle wp5 = new Rectangle(565, 50, 75,75);

    //armor shop
    private static final Rectangle as1 = new Rectangle(110, 50, 75,75);
    private static final Rectangle as2 = new Rectangle(240, 50, 75,75);
    private static final Rectangle as3 = new Rectangle(370, 50, 75,75);
    private static final Rectangle as4 = new Rectangle(500, 50, 75,75);
    private static final Rectangle as5 = new Rectangle(110, 150, 75,75);
    private static final Rectangle as6 = new Rectangle(240, 150, 75,75);
    private static final Rectangle as7 = new Rectangle(370, 150, 75,75);
    private static final Rectangle as8 = new Rectangle(500, 150, 75,75);

    //quests
    private static final Rectangle q1 = new Rectangle(200, 20, 300,75);
    private static final Rectangle q2 = new Rectangle(200, 100, 300,75);
    private static final Rectangle q3 = new Rectangle(200, 180, 300,75);
    private static final Rectangle q4 = new Rectangle(200, 260, 300,75);
    private static final Rectangle q5 = new Rectangle(200, 340, 300,75);


    public static void paintPlayer(Player player, Graphics g){
        BufferedImage image = ImageLoader.getObj("player");
        if(Run.getPlayer().getDir().equals("Right")){
            image = ImageLoader.getObj("playerR");
        }
        if(Run.getPlayer().getDir().equals("Left")){
            image = ImageLoader.getObj("playerL");
        }
        if(Run.getPlayer().getDir().equals("Up")){
            image = ImageLoader.getObj("playerU");
        }
        g.drawImage(image, Panel.getScreenWidth() / 2, Panel.getScreenHeight() / 2, image.getWidth(), image.getHeight(), null);

    }
    public static void paintLevel(Floor map, Graphics g){
        for(int y = 0; y < map.getSizeY(); y++) {
            for(int x = 0; x < map.getSizeX(); x++) {
                BufferedImage image;
                if(!map.getTileAt(x, y).getName().equals("blank")) {
                    image = ImageLoader.getObj(map.getTileAt(x, y).getName());
                    g.drawImage(image, map.getTileAt(x, y).getXPos()*image.getWidth() + Panel.getScreenWidth() / 2 - Run.getPlayer().getXStart() * 25, map.getTileAt(x, y).getYPos()*image.getHeight() + Panel.getScreenHeight() / 2 - Run.getPlayer().getYStart() * 25, image.getWidth(), image.getHeight(), null);
                }

            }
        }
    }
    //do a reset txt if mouse is clicked
    public static void paintTxt(Graphics g){
        if(Interactions.getTxt().equals("")){
            openTxt = false;
            return;
        }
        openTxt = true;
        //draw image
        BufferedImage image = ImageLoader.getObj(Interactions.getNpc());
        g.drawImage(image, 20, 240, 50, 50, null);
        g.setColor(Color.DARK_GRAY);
        g.drawRoundRect(20, 240, 50, 50,10,10);

        //draw msg
        g.setColor(Color.GRAY);
        g.fillRoundRect(20,300,660,110, 5, 5);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        g.setColor(Color.WHITE);
        int lineHeight = g.getFontMetrics().getHeight();
        int y = 310;
        for (String line : Interactions.getTxt().split("\n")){
            y += lineHeight;
            g.drawString(line, 40, y);
        }

        //draw "button" - uses mouse listener

        g.setColor(Color.RED);
        g.fillRoundRect(640, 390, 50,25, 5, 5);
        if(nextButton.contains(Panel.getXPos(), Panel.getYPos())){
            if(Interactions.getNpc().equals("blacksmith")) {
                openShop = true;
            }
            Interactions.removeTxt();
            Panel.resetPos();
            OUTSIDE_CASTLE.setTile(Run.getPlayer().getXStart() - 1, Run.getPlayer().getYStart());
            OUTSIDE_CASTLE.setTile(Run.getPlayer().getXStart() + 1, Run.getPlayer().getYStart());
            OUTSIDE_CASTLE.setTile(Run.getPlayer().getXStart(), Run.getPlayer().getYStart() + 1);
            OUTSIDE_CASTLE.setTile(Run.getPlayer().getXStart(), Run.getPlayer().getYStart() - 1);
        }

        if(Interactions.getNpc().equals("wizard")) {
            g.setColor(Color.GREEN);
            g.fillRoundRect(640, 315, 50, 25, 5, 5);
            if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                Panel.resetPos();
                openShop = true;
                buyPot = true;
                Interactions.removeTxt();
            }
        }else if(Interactions.getNpc().equals("receptionist")){
            g.setColor(Color.GREEN);
            g.fillRoundRect(640, 315, 50, 25, 5, 5);
            if(acceptButton.contains(Panel.getXPos(), Panel.getYPos())){
                Panel.resetPos();
                reception = true;
                Interactions.removeTxt();
            }
        }
    }

    public static void paintInventory(Graphics g){

        if(!Run.getPlayer().getOpenInv() || Fight.isEncounter()){
            return;
        }
        //backboard
        g.setColor(Color.BLACK);
        g.fillRoundRect(25,25,650,370, 15, 15);

        //draw image
        BufferedImage image = ImageLoader.getObj("player");
        g.drawImage(image, 600, 50, 50, 50, null);
        g.setColor(Color.WHITE);
        g.drawRoundRect(600, 50, 50, 50,15,15);

        //draw stats of player
        g.setColor(Color.WHITE);
        g.setFont(new Font("Dialog", Font.PLAIN, 15));
        int lineHeight = g.getFontMetrics().getHeight();
        int y = 30;
        for (String line : Run.getPlayer().toString().split("\n")){
            y += lineHeight;
            g.drawString(line, 450, y);
        }


        //grid inventory
        g.setColor(Color.WHITE);
        int index = 0;
        for ( int row = 40; row <= 340; row += 100 ){
            for ( int col = 45; col <= 305; col += 130 ){
                if(!Run.getPlayer().availableSlot(index)) {
                    image = ImageLoader.getObj(Run.getPlayer().getInventory()[index].getFile());
                    g.drawImage(image, row, col, 75,75,null);
                }
                g.drawRoundRect(row, col, 75, 75,15,15);
                index++;
            }
        }

        //grid equipped
        index = 0;
        g.setColor(Color.BLUE);
        for ( int row = 450; row <= 550; row += 100 ){
            for ( int col = 175; col <= 305; col += 130 ){
                if(!Run.getPlayer().availableEquipmentSlot(index)) {
                    image = ImageLoader.getObj(Run.getPlayer().getEquipped()[index].getFile());
                    g.drawImage(image, row, col, 75,75,null);
                }
                g.drawRoundRect(row, col, 75, 75, 15,15);
                index++;
            }
        }

        //inventory info
        if (invSlot1.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[0];
            check = true;
            space = 0;
        } else if (invSlot2.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[1];
            check = true;
            space = 1;
        } else if (invSlot3.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[2];
            check = true;
            space = 2;
        } else if (invSlot4.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[3];
            check = true;
            space = 3;
        } else if (invSlot5.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[4];
            check = true;
            space = 4;
        } else if (invSlot6.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[5];
            check = true;
            space = 5;
        } else if (invSlot7.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[6];
            check = true;
            space = 6;
        } else if (invSlot8.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[7];
            check = true;
            space = 7;
        } else if (invSlot9.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[8];
            check = true;
            space = 8;
        } else if (invSlot10.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[9];
            check = true;
            space = 9;
        } else if (invSlot11.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[10];
            check = true;
            space = 10;
        } else if (invSlot12.contains(Panel.getXPos(), Panel.getYPos())) {
            inv = Run.getPlayer().getInventory()[11];
            check = true;
            space = 11;
        }

        String None = "Inventory Slot is empty!";
        if(check) {
            g.setColor(Color.GRAY);
            g.fillRoundRect(20,300,660,110, 5, 5);
            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
            g.setColor(Color.WHITE);
            lineHeight = g.getFontMetrics().getHeight();
            y = 310;

            if (inv != null) {
                for (String line : inv.toString().split("\n")) {
                    y += lineHeight;
                    g.drawString(line, 40, y);
                }
                if(inv.getType().equals("Armor") || inv.getType().equals("Weapon")) {
                    g.setColor(Color.GREEN);
                    g.fillRoundRect(640, 315, 50, 25, 5, 5);
                    g.setColor(Color.BLUE);
                    g.fillRoundRect(640, 350, 50,25, 5, 5);
                    if (equipButton.contains(Panel.getXPos(), Panel.getYPos())) {
                        if(inv.getType().equals("Weapon")){
                            if(Run.getPlayer().getEquipped()[0] == null) {
                                Run.getPlayer().setWeapon(inv);
                                Run.getPlayer().removeSlot(space);
                            }else{
                                temp = Run.getPlayer().getEquipped()[0];
                                Run.getPlayer().setWeapon(inv);
                                Run.getPlayer().addSlot(space, temp);
                            }
                            check = false;
                            inv = null;
                            temp = null;
                        }else if(inv.getBody().equals("Helmet")){
                            if(Run.getPlayer().getEquipped()[1] == null) {
                                Run.getPlayer().setHelmet(inv);
                                Run.getPlayer().removeSlot(space);

                            }else{
                                temp = Run.getPlayer().getEquipped()[1];
                                Run.getPlayer().setHelmet(inv);
                                Run.getPlayer().addSlot(space, temp);
                            }
                            Run.getPlayer().setHelm(inv.getDefense());
                            check = false;
                            inv = null;
                            temp = null;
                        }else if(inv.getBody().equals("Chest")){
                            if(Run.getPlayer().getEquipped()[2] == null ) {
                                Run.getPlayer().setBreastplate(inv);
                                Run.getPlayer().removeSlot(space);
                            }else{
                                temp = Run.getPlayer().getEquipped()[2];
                                Run.getPlayer().setBreastplate(inv);
                                Run.getPlayer().addSlot(space, temp);
                            }
                            Run.getPlayer().setChest(inv.getDefense());
                            check = false;
                            inv = null;
                            temp = null;
                        } else if(inv.getBody().equals("Boots")){
                            if(Run.getPlayer().getEquipped()[3] == null) {
                                Run.getPlayer().setBoots(inv);
                                Run.getPlayer().removeSlot(space);
                            }else{
                                temp = Run.getPlayer().getEquipped()[3];
                                Run.getPlayer().setBoots(inv);
                                Run.getPlayer().addSlot(space, temp);
                            }
                            Run.getPlayer().setBoots(inv.getDefense());
                            check = false;
                            inv = null;
                            temp = null;
                        }
                        Run.getPlayer().updateDefense();
                    }else if(removeButton.contains(Panel.getXPos(), Panel.getYPos())){
                        Run.getPlayer().removeSlot(space);
                        check = false;
                        inv = null;
                        temp = null;
                    }
                }else if(inv.getType().equals("Potion")){
                    g.setColor(Color.GREEN);
                    g.fillRoundRect(640, 315, 50, 25, 5, 5);
                    if (equipButton.contains(Panel.getXPos(), Panel.getYPos())){
                        Run.getPlayer().removeSlot(space);
                        Run.getPlayer().addHealth();
                        check = false;
                        inv = null;
                        temp = null;
                    }
                }
            } else {
                for (String line : None.split("\n")) {
                    y += lineHeight;
                    g.drawString(line, 40, y);
                }
            }
            g.setColor(Color.RED);
            g.fillRoundRect(640, 390, 50,25, 5, 5);
            if(nextButton.contains(Panel.getXPos(), Panel.getYPos())){
                inv = null;
                check = false;
                Panel.resetPos();
            }
        }

        //draw "button" - uses mouse listener

        g.setColor(Color.RED);
        g.fillRoundRect(640, 15, 50,25, 5, 5);
        if(closeButton.contains(Panel.getXPos(), Panel.getYPos())){
            inv = null;
            check = false;
            Run.getPlayer().setOpenInv(false);
            Panel.resetPos();
        }
    }

    public static void paintBattle(Graphics g){
        if(!Fight.isEncounter()){
            encounter = true;
            ranAway = false;
            failed = false;
            fight = false;
            gone = false;
            options = true;
            potion = false;
            attack = false;
            playerTurn = true;
            timer = 0;
            damage = 0;
            receive = 0;
            finish = false;
            attacked = false;
            lvledUp = false;
            drop = 0;
            used = Run.getPlayer().availablePot();
            return;
        }
        BufferedImage image = ImageLoader.getObj(Fight.getChallenge().getName());
        g.drawImage(image, Panel.getScreenWidth()/2 - 150, 25, 300, 350, null);

        if(encounter) {

            g.setColor(Color.GRAY);
            g.fillRoundRect(20, 300, 660, 110, 5, 5);
            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
            g.setColor(Color.WHITE);
            int lineHeight = g.getFontMetrics().getHeight();
            int y = 310;
            String enemy = "You encountered a " + Fight.getChallenge().getName() + "! \nWill you run away or stay and fight? \nIf you choose to fight, you can't run away in the middle of the fight.";
            for (String line : enemy.split("\n")) {
                y += lineHeight;
                g.drawString(line, 40, y);
            }
            g.setColor(Color.GREEN);
            g.fillRoundRect(640, 315, 50, 25, 5, 5);

            if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                fight = true;
                encounter = false;
                Panel.resetPos();
            }
            g.setColor(Color.RED);
            g.fillRoundRect(640, 350, 50, 25, 5, 5);
            if (rejectButton.contains(Panel.getXPos(), Panel.getYPos())) {
                if(Fight.getRun() <= 6) {
                    ranAway = true;
                }else{
                    failed = true;
                }
                encounter = false;
                Panel.resetPos();
            }
        }
        if(ranAway) {
            g.setColor(Color.GRAY);
            g.fillRoundRect(20, 300, 660, 110, 5, 5);
            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
            g.setColor(Color.WHITE);
            int lineHeight = g.getFontMetrics().getHeight();
            int y = 310;
            String enemy = "You successfully ran away.";
            for (String line : enemy.split("\n")) {
                y += lineHeight;
                g.drawString(line, 40, y);
            }
            g.setColor(Color.RED);
            g.fillRoundRect(640, 390, 50, 25, 5, 5);
            if (nextButton.contains(Panel.getXPos(), Panel.getYPos())){
                fight = false;
                ranAway = false;
                Panel.resetPos();
                Fight.stopEncounter();
            }
        }else if(failed){
            g.setColor(Color.GRAY);
            g.fillRoundRect(20, 300, 660, 110, 5, 5);
            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
            g.setColor(Color.WHITE);
            int lineHeight = g.getFontMetrics().getHeight();
            int y = 310;
            String enemy = "You failed to run away. You must now fight with your life on the line";
            for (String line : enemy.split("\n")) {
                y += lineHeight;
                g.drawString(line, 40, y);
            }
            g.setColor(Color.RED);
            g.fillRoundRect(640, 390, 50, 25, 5, 5);
            if (nextButton.contains(Panel.getXPos(), Panel.getYPos())){
                fight = true;
                encounter = false;
                failed = false;
                Panel.resetPos();
            }
        }
        if(fight && gone){
             if((Run.getPlayer().getHealth() > 0 || Fight.getChallenge().getHealth() > 0) && fight) {

                 g.setColor(Color.WHITE);
                 g.fillRoundRect(150, 300, 400, 110, 5, 5);
                 g.setColor(Color.BLACK);
                 g.drawRoundRect(150, 300, 400, 110, 5, 5);

                 g.setColor(Color.BLACK);
                 g.setFont(new Font("Times New Roman", Font.BOLD, 15));
                 g.drawString("Your Health: " + Run.getPlayer().getHealth() + "/" + Run.getPlayer().getMaxHealth(), 390, 382);

                 if(playerTurn) {
                     if (options) {
                         g.setColor(Color.RED);
                         g.drawRoundRect(170, 320, 150, 25, 5, 5);
                         g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                         g.drawString("ATTACK", 215, 337);

                         if (attackButton.contains(Panel.getXPos(), Panel.getYPos())) {
                             options = false;
                             attack = true;
                             potion = false;
                             Panel.resetPos();
                         }

                         g.setColor(Color.BLUE);
                         g.drawRoundRect(170, 365, 150, 25, 5, 5);
                         g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                         g.drawString("USE POTION", 205, 382);

                         if (usePotionButton.contains(Panel.getXPos(), Panel.getYPos())) {
                             options = false;
                             attack = false;
                             potion = true;
                             Panel.resetPos();
                         }

                         g.setColor(Color.GREEN);
                         g.drawRoundRect(375, 320, 150, 25, 5, 5);
                         g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                         g.drawString("Monster Info", 412, 337);

                         if (checkInfoButton.contains(Panel.getXPos(), Panel.getYPos())) {
                             options = true;
                             attack = false;
                             potion = false;
                             info = true;
                             Panel.resetPos();
                         }

                         //Do a binary search for use potion in inventory
                         if (Run.getPlayer().getHealth() <= 0) {
                             Fight.stopEncounter();
                         }
                     } else if (attack) {
                         if(!attacked) {
                            damage = Run.getPlayer().inflictDamage();
                            receive = Fight.getChallenge().receiveDamage(damage);
                            attacked = true;
                         }
                         g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                         g.drawString("You dealt " + receive + " damage to the " + Fight.getChallenge().getName() + ".", 155, 320);
                         timer++;
                         if(timer == 150){
                             attack = false;
                             playerTurn = false;
                             timer = 0;
                             finish = true;
                             attacked = false;
                         }
                     } else if (potion) {
                         g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                         int lineHeight = g.getFontMetrics().getHeight();
                         int y = 300;
                         if(used) {
                             String pot = "You drank a health potion. \nYour health went up by 25 health points.";
                             for (String line : pot.split("\n")) {
                                 y += lineHeight;
                                 g.drawString(line, 155, y);
                             }
                         }else{
                             String pot = "You do not have a health potion in your inventory!";
                             for (String line : pot.split("\n")) {
                                 y += lineHeight;
                                 g.drawString(line, 155, y);
                             }
                         }
                         timer++;
                         if(timer == 150){
                             if(used){
                                 Run.getPlayer().addHealth();
                                 Run.getPlayer().removePot();
                                 used = true;
                             }
                         }
                         if(timer == 150){
                             used = Run.getPlayer().availablePot();
                             potion = false;
                             options = true;
                             timer = 0;
                         }
                     }
                 }else if(Fight.getChallenge().getHealth() > 0){ //enemy's turn
                     if(!attacked) {
                         damage = Fight.getChallenge().inflictDamage();
                         receive = Run.getPlayer().receiveDamage(damage);
                         attacked = true;
                     }
                     g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                     g.drawString("The " + Fight.getChallenge().getName() + " dealt " + receive + " damage to you.", 155, 320);
                     timer++;
                     if(timer == 150){
                         playerTurn = true;
                         finish = true;
                         options = true;
                         attacked = false;
                         timer = 0;
                     }
                 }
                 if(info){
                     g.setColor(Color.WHITE);
                     g.fillRoundRect(525, 25, 150, 110, 5, 5);
                     g.setColor(Color.BLACK);
                     g.drawRoundRect(525, 25, 150, 110, 5, 5);

                     int lineHeight = g.getFontMetrics().getHeight();
                     int y = 30;
                     for (String line : Fight.getChallenge().toString().split("\n")) {
                         y += lineHeight;
                         g.drawString(line, 530, y);
                     }

                     g.setColor(Color.RED);
                     g.fillRoundRect(640, 15, 50,25, 5, 5);
                     if(closeButton.contains(Panel.getXPos(), Panel.getYPos())){
                         info = false;
                         Panel.resetPos();
                     }
                 }
            }
        }
        if(fight){
            gone = true;
        }
        if(finish) {
            if (Run.getPlayer().getHealth() <= 0) {
                dead = true;
                Fight.stopEncounter();
            } else if (Fight.getChallenge().getHealth() <= 0) {
                g.setColor(Color.WHITE);
                g.fillRoundRect(150, 300, 400, 110, 5, 5);
                g.setColor(Color.BLACK);
                g.drawRoundRect(150, 300, 400, 110, 5, 5);
                g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                g.drawString(Fight.getChallenge().getName() + " died. You received " + Fight.getChallenge().getExpDrop() + " experience.", 155, 320);
                if(!lvledUp) {
                    Run.getPlayer().giveExp(Fight.getChallenge().getExpDrop());
                    lvledUp = true;
                }
                if(Run.getPlayer().isLvlUp()){
                    g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                    g.drawString("You leveled up from " + (Run.getPlayer().getPLevel() - 1) + " to " + Run.getPlayer().getPLevel(), 155, 340);
                }
                if(Run.getPlayer().isAvailableSlot() && drop < Fight.getChallenge().getDrops().size()){
                    if(Fight.getChallenge().getDrops().get(drop).getDropRate() >= (int)(Math.random() * 20) + 1) {
                        Run.getPlayer().giveItem(Fight.getChallenge().getDrops().get(drop));
                    }
                    drop++;
                }
                fight = false;
                timer++;
                if(timer == 150) {
                    if(Run.getPlayer().getPQuest() != null){
                        if(Run.getPlayer().getPQuest().getMonster().equals("Slime") && Fight.getChallenge().getName().equals("Slime")){
                            Run.getPlayer().increaseSlime();
                        }else if(Run.getPlayer().getPQuest().getMonster().equals("Giant Rat") && Fight.getChallenge().getName().equals("Giant Rat")){
                            Run.getPlayer().increaseGiantRat();
                        }else if(Run.getPlayer().getPQuest().getMonster().equals("Goblin") && Fight.getChallenge().getName().equals("Goblin")){
                            Run.getPlayer().increaseGoblin();
                        }else if(Run.getPlayer().getPQuest().getMonster().equals("Kobold") && Fight.getChallenge().getName().equals("Kobold")){
                            Run.getPlayer().increaseKobold();
                        }else if(Run.getPlayer().getPQuest().getMonster().equals("Death") && Fight.getChallenge().getName().equals("Death")){
                            Run.getPlayer().increaseDeath();
                        }
                    }



                    Run.getPlayer().setLvlUp();
                    timer = 0;
                    Fight.stopEncounter();
                    finish = false;
                }
            }
        }
    }

    //I have to check the NPC so if its blacksmith, draw blacksmith shop. Then for wiz the pot and health
    //For these interactive I would have to have two buttons - yes and no booleans
    //I have to check gold then do a msg for that
    //Then if its yes, open the shop then do dialogue stuff overlapping
    //ask if you want to buy or sell
    //then if sell open your inventory
    //if buy open shop
    public static void paintShop(Graphics g) {
        if (!openShop) {
            openShop = false;
            sell = false;
            buy = false;
            bought = false;
            bought1 = true;
            buyPot = false;
            optionBlacksmith = true;
            armor = false;
            weapon = false;
            optionBlacksmith2 = true;
            open = false;
            shop = null;
            return;
        }
        if (buyPot) {
            BufferedImage image = ImageLoader.getObj(Interactions.getNpc());
            g.drawImage(image, 20, 240, 50, 50, null);
            g.setColor(Color.DARK_GRAY);
            g.drawRoundRect(20, 240, 50, 50, 10, 10);
            String wiz;
            if (Run.getPlayer().getMoney() < 25 && !bought) {
                wiz = "Witch: You don't even have enough money! Get out of my face, you filthy peasant!";
            } else {
                bought = true;
                if (bought1) {
                    bought1 = false;
                    Run.getPlayer().reduceMoney(25);
                    Run.getPlayer().giveItem(Items.getPotions().get(0));
                }
                wiz = "Witch: Thank you for your patronage, good sir... hehe... he\n\n\n You bought a health potion. You now have " + Run.getPlayer().getMoney() + " gold left";
            }
            g.setColor(Color.GRAY);
            g.fillRoundRect(20, 300, 660, 110, 5, 5);
            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
            g.setColor(Color.WHITE);
            int lineHeight = g.getFontMetrics().getHeight();
            int y = 310;
            for (String line : wiz.split("\n")) {
                y += lineHeight;
                g.drawString(line, 40, y);
            }
            g.setColor(Color.RED);
            g.fillRoundRect(640, 390, 50,25, 5, 5);
            if(nextButton.contains(Panel.getXPos(), Panel.getYPos())){
                openShop = false;
                Panel.resetPos();
            }
        }

        if (Interactions.getNpc().equals("blacksmith")) {
            if(optionBlacksmith){
                BufferedImage image = ImageLoader.getObj(Interactions.getNpc());
                g.drawImage(image, 20, 240, 50, 50, null);
                g.setColor(Color.GRAY);
                g.fillRoundRect(20,300,660,110, 5, 5);

                g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                g.setColor(Color.WHITE);
                g.drawString("Blacksmith: What do you want to do my boy?", 40, 320);

                g.setColor(Color.GREEN);
                g.fillRoundRect(640, 315, 50, 25, 5, 5);
                if(acceptButton.contains(Panel.getXPos(), Panel.getYPos())){
                    optionBlacksmith = false;
                    buy = true;
                    sell = false;
                    Panel.resetPos();
                }
                g.setColor(Color.BLUE);
                g.fillRoundRect(640, 350, 50, 25, 5, 5);
                if(rejectButton.contains(Panel.getXPos(), Panel.getYPos())){
                    optionBlacksmith = false;
                    buy = false;
                    sell = true;
                    Panel.resetPos();
                }
                g.setColor(Color.RED);
                g.fillRoundRect(640, 390, 50,25, 5, 5);
                if(nextButton.contains(Panel.getXPos(), Panel.getYPos())){
                    openShop = false;
                    Panel.resetPos();
                }
            }else if(buy){
                //armor or weapons
                if(optionBlacksmith2) {
                    BufferedImage image = ImageLoader.getObj(Interactions.getNpc());
                    g.drawImage(image, 20, 240, 50, 50, null);
                    g.setColor(Color.GRAY);
                    g.fillRoundRect(20, 300, 660, 110, 5, 5);

                    g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                    g.setColor(Color.WHITE);
                    g.drawString("Blacksmith: Are you trying to look for armors or weapons?", 40, 320);

                    g.setColor(Color.GREEN);
                    g.fillRoundRect(640, 315, 50, 25, 5, 5);
                    if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                        armor = true;
                        weapon = false;
                        optionBlacksmith2 = false;
                        Panel.resetPos();
                    }
                    g.setColor(Color.BLUE);
                    g.fillRoundRect(640, 350, 50, 25, 5, 5);
                    if (rejectButton.contains(Panel.getXPos(), Panel.getYPos())) {
                        armor = false;
                        weapon = true;
                        optionBlacksmith2 = false;
                        Panel.resetPos();
                    }
                }else if(armor){
                    open = true;
                    g.setColor(Color.BLACK);
                    g.fillRoundRect(25,25,650,225, 15, 15);
                    g.setColor(Color.WHITE);
                    int index = 0;
                    for ( int row = 50; row <= 150; row += 100 ){
                        for ( int col = 110; col <= 500; col += 130 ){
                            if(index < Items.getArmorShop().length) {
                                BufferedImage image = ImageLoader.getObj(Items.getArmorShop()[index].getFile());
                                g.drawImage(image, col, row, 75,75,null);
                                index++;
                            }

                            g.drawRoundRect(col, row, 75, 75,15,15);
                        }
                    }

                    g.setColor(Color.YELLOW);
                    g.fillRoundRect(20, 20, 50,25, 5, 5);
                    if(sortGold.contains(Panel.getXPos(), Panel.getYPos())) {
                        SortMethod.mergeSort(Items.getArmorShop(), 0, Items.getArmorShop().length - 1);
                        Panel.resetPos();
                    }

                    if (as1.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[0];
                    } else if (as2.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[1];
                    } else if (as3.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[2];
                    } else if (as4.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[3];
                    } else if (as5.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[4];
                    } else if (as6.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[5];
                    } else if (as7.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[6];
                    } else if (as8.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getArmorShop()[7];
                    }

                    if (shop != null) {
                        g.setColor(Color.GRAY);
                        g.fillRoundRect(20,300,660,110, 5, 5);
                        g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                        g.setColor(Color.WHITE);
                        int lineHeight = g.getFontMetrics().getHeight();
                        int y = 310;
                        for (String line : shop.toString().split("\n")) {
                            y += lineHeight;
                            g.drawString(line, 40, y);
                        }
                        g.drawString("Current Gold: " + Run.getPlayer().getMoney(), 40, 390);


                        g.setColor(Color.GREEN);
                        g.fillRoundRect(640, 315, 50, 25, 5, 5);
                        if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                            String bm;
                            if(Run.getPlayer().getMoney() < shop.getCost() && !bought){
                                bm = "Blacksmith: You don't have enough money kiddo. Come back next time";
                            }else if(!Run.getPlayer().isAvailableSlot()) {
                                bm = "Blacksmith: You do not have enough space. Just throw em away!";
                            }else{
                                bought = true;
                                if(bought1){
                                    bought1 = false;
                                    Run.getPlayer().reduceMoney(shop.getCost());
                                    Run.getPlayer().giveItem(shop);
                                }
                                bm = "Blacksmith: Here ya go.\n\n\n You bought a " + shop.getName() + ". You now have " + Run.getPlayer().getMoney() + " gold left";
                            }

                            g.setColor(Color.GRAY);
                            g.fillRoundRect(20, 300, 660, 110, 5, 5);
                            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                            g.setColor(Color.WHITE);
                            lineHeight = g.getFontMetrics().getHeight();
                            y = 310;
                            for (String line : bm.split("\n")) {
                                y += lineHeight;
                                g.drawString(line, 40, y);
                            }

                        }
                        g.setColor(Color.RED);
                        g.fillRoundRect(640, 350, 50, 25, 5, 5);
                        if (rejectButton.contains(Panel.getXPos(), Panel.getYPos())) {
                            shop = null;
                        }
                    }


                }else if(weapon){
                    open = true;
                    g.setColor(Color.BLACK);
                    g.fillRoundRect(25,25,650,125, 15, 15);
                    g.setColor(Color.WHITE);
                    int index = 0;
                    for ( int col = 45; col <= 695; col += 130 ){
                        if(index < Items.getWeaponShop().length) {
                            BufferedImage image = ImageLoader.getObj(Items.getWeaponShop()[index].getFile());
                            g.drawImage(image, col, 50, 75,75,null);
                            index++;
                        }
                        g.drawRoundRect(col, 50, 75, 75,15,15);
                    }

                    g.setColor(Color.YELLOW);
                    g.fillRoundRect(20, 20, 50,25, 5, 5);
                    if(sortGold.contains(Panel.getXPos(), Panel.getYPos())) {
                        SortMethod.mergeSort(Items.getWeaponShop(), 0, Items.getWeaponShop().length - 1);
                        Panel.resetPos();
                    }

                    if (wp1.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getWeaponShop()[0];
                    } else if (wp2.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getWeaponShop()[1];
                    } else if (wp3.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getWeaponShop()[2];
                    } else if (wp4.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getWeaponShop()[3];
                    } else if (wp5.contains(Panel.getXPos(), Panel.getYPos())) {
                        shop = Items.getWeaponShop()[4];
                    }

                    if (shop != null) {
                        g.setColor(Color.GRAY);
                        g.fillRoundRect(20,300,660,110, 5, 5);
                        g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                        g.setColor(Color.WHITE);
                        int lineHeight = g.getFontMetrics().getHeight();
                        int y = 310;
                        for (String line : shop.toString().split("\n")) {
                            y += lineHeight;
                            g.drawString(line, 40, y);
                        }
                        g.drawString("Current Gold: " + Run.getPlayer().getMoney(), 40, 390);


                        g.setColor(Color.GREEN);
                        g.fillRoundRect(640, 315, 50, 25, 5, 5);
                        if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                            String bm;
                            if(Run.getPlayer().getMoney() < shop.getCost() && !bought){
                                bm = "Blacksmith: You don't have enough money kiddo. Come back next time";
                            }else if(!Run.getPlayer().isAvailableSlot()) {
                                bm = "Blacksmith: You do not have enough space. Just throw em away!";
                            }else{
                                bought = true;
                                if(bought1){
                                    bought1 = false;
                                    Run.getPlayer().reduceMoney(shop.getCost());
                                    Run.getPlayer().giveItem(shop);
                                }
                                bm = "Blacksmith: Here ya go.\n\n\n You bought a " + shop.getName() + ". You now have " + Run.getPlayer().getMoney() + " gold left";
                            }

                            g.setColor(Color.GRAY);
                            g.fillRoundRect(20, 300, 660, 110, 5, 5);
                            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                            g.setColor(Color.WHITE);
                            lineHeight = g.getFontMetrics().getHeight();
                            y = 310;
                            for (String line : bm.split("\n")) {
                                y += lineHeight;
                                g.drawString(line, 40, y);
                            }

                        }
                        g.setColor(Color.RED);
                        g.fillRoundRect(640, 350, 50, 25, 5, 5);
                        if (rejectButton.contains(Panel.getXPos(), Panel.getYPos())) {
                            shop = null;
                        }
                    }
                }
                if(open) {
                    g.setColor(Color.RED);
                    g.fillRoundRect(640, 15, 50, 25, 5, 5);
                    if (closeButton.contains(Panel.getXPos(), Panel.getYPos())) {
                        sell = false;
                        optionBlacksmith = true;
                        optionBlacksmith2 = true;
                        armor = false;
                        weapon = false;
                        buy = false;
                        open = false;
                        shop = null;
                        Panel.resetPos();
                    }
                }
            } else if (sell) {
                g.setColor(Color.BLACK);
                g.fillRoundRect(25,25,650,370, 15, 15);
                g.setColor(Color.WHITE);
                int index = 0;
                for ( int row = 40; row <= 340; row += 100 ){
                    for ( int col = 45; col <= 305; col += 130 ){
                        if(!Run.getPlayer().availableSlot(index)) {
                            BufferedImage image = ImageLoader.getObj(Run.getPlayer().getInventory()[index].getFile());
                            g.drawImage(image, row, col, 75,75,null);
                        }
                        g.drawRoundRect(row, col, 75, 75,15,15);
                        index++;
                    }
                }

                if (invSlot1.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[0];
                    check = true;
                    space = 0;
                } else if (invSlot2.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[1];
                    check = true;
                    space = 1;
                } else if (invSlot3.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[2];
                    check = true;
                    space = 2;
                } else if (invSlot4.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[3];
                    check = true;
                    space = 3;
                } else if (invSlot5.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[4];
                    check = true;
                    space = 4;
                } else if (invSlot6.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[5];
                    check = true;
                    space = 5;
                } else if (invSlot7.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[6];
                    check = true;
                    space = 6;
                } else if (invSlot8.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[7];
                    check = true;
                    space = 7;
                } else if (invSlot9.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[8];
                    check = true;
                    space = 8;
                } else if (invSlot10.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[9];
                    check = true;
                    space = 9;
                } else if (invSlot11.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[10];
                    check = true;
                    space = 10;
                } else if (invSlot12.contains(Panel.getXPos(), Panel.getYPos())) {
                    inv = Run.getPlayer().getInventory()[11];
                    check = true;
                    space = 11;
                }

                if(check){
                    if(inv != null){
                        g.setColor(Color.GRAY);
                        g.fillRoundRect(20,300,660,110, 5, 5);
                        g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                        g.setColor(Color.WHITE);
                        int lineHeight = g.getFontMetrics().getHeight();
                        int y = 310;
                        for (String line : inv.toString().split("\n")) {
                            y += lineHeight;
                            g.drawString(line, 40, y);
                        }
                        if(inv.isSellable()) {
                            g.drawString("Exchange for " + (int) (inv.getCost() * 0.6) + "?", 40, 370);
                        }else{
                            g.drawString("Can't be sold", 40, 370);
                        }
                        g.drawString("Current Gold: " + Run.getPlayer().getMoney(), 40, 390);


                        g.setColor(Color.GREEN);
                        g.fillRoundRect(640, 315, 50, 25, 5, 5);
                        if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {

                            String bm;
                            if(inv.isSellable()){
                                if(bought1) {
                                    bought1 = false;
                                    Run.getPlayer().giveMoney((int) (inv.getCost() * 0.6));
                                }
                                bm = "Blacksmith: What a good item you got here. \nHere's ya gold.\n\n\n You sold a " + inv.getName() + ". You now have " + Run.getPlayer().getMoney() + " gold.";
                                Run.getPlayer().removeSlot(space);
                            }else{
                                bm = "I won't accept this item. Sorry kid.";
                            }
                            g.setColor(Color.GRAY);
                            g.fillRoundRect(20, 300, 660, 110, 5, 5);
                            g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                            g.setColor(Color.WHITE);
                            lineHeight = g.getFontMetrics().getHeight();
                            y = 310;
                            for (String line : bm.split("\n")) {
                                y += lineHeight;
                                g.drawString(line, 40, y);
                            }
                        }

                        g.setColor(Color.RED);
                        g.fillRoundRect(640, 350, 50, 25, 5, 5);
                        if (rejectButton.contains(Panel.getXPos(), Panel.getYPos())) {
                            inv = null;
                            space = 0;
                            check = false;
                            bought1 = true;
                        }




                    }else{
                        g.setColor(Color.GRAY);
                        g.fillRoundRect(20,300,660,110, 5, 5);
                        g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                        g.setColor(Color.WHITE);
                        g.drawString("It is an empty slot", 40, 390);

                        g.setColor(Color.RED);
                        g.fillRoundRect(640, 390, 50,25, 5, 5);
                        if(nextButton.contains(Panel.getXPos(), Panel.getYPos())){
                            inv = null;
                            check = false;
                            space = 0;
                        }
                    }
                }


                g.setColor(Color.RED);
                g.fillRoundRect(640, 15, 50,25, 5, 5);
                if(closeButton.contains(Panel.getXPos(), Panel.getYPos())){
                    sell= false;
                    optionBlacksmith = true;
                    buy = false;
                    inv = null;
                    space = 0;
                    check = false;
                    Panel.resetPos();
                }
            }
        }
    }

    public static void paintReception(Graphics g){
        if(!reception){
            reception = false;
            choice = true;
            choose = false;
            done = false;
            cancel = false;
            deduct = true;
            took = true;
            submit = false;
            got = true;
            return;
        }
        if(Run.getPlayer().getPQuest() == null){
            done = true;
        }
        if(Run.getPlayer().getPQuest() == null || done) {
            if(choice) {
                BufferedImage image = ImageLoader.getObj(Interactions.getNpc());
                g.drawImage(image, 20, 240, 50, 50, null);
                g.setColor(Color.DARK_GRAY);
                g.drawRoundRect(20, 240, 50, 50, 10, 10);

                String rec = "Receptionist: Would you like to take on a quest?\nIf you do, you need to remember that you will be penalized if you cancel it midway.";
                g.setColor(Color.GRAY);
                g.fillRoundRect(20, 300, 660, 110, 5, 5);
                g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                g.setColor(Color.WHITE);
                int lineHeight = g.getFontMetrics().getHeight();
                int y = 310;
                for (String line : rec.split("\n")) {
                    y += lineHeight;
                    g.drawString(line, 40, y);
                }
                g.setColor(Color.GREEN);
                g.fillRoundRect(640, 315, 50, 25, 5, 5);
                if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                    choice = false;
                    choose = true;
                    Panel.resetPos();
                }
                g.setColor(Color.RED);
                g.fillRoundRect(640, 390, 50, 25, 5, 5);
                if (nextButton.contains(Panel.getXPos(), Panel.getYPos())) {
                    reception = false;
                    choice = true;
                    choose = false;
                    Panel.resetPos();
                }
            }
            if(choose){
                int index = 0;
                for ( int col = 20; col <= 340; col += 80 ){
                    g.setColor(Color.DARK_GRAY);
                    g.fillRoundRect(200, col, 300, 75,15,15);

                    if(index < AvailableQuests.getQuests().size()) {
                        g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                        g.setColor(Color.WHITE);
                        int lineHeight = g.getFontMetrics().getHeight();
                        int y = col;
                        for (String line : AvailableQuests.getQuests().get(index).toString().split("\n")) {
                            y += lineHeight;
                            g.drawString(line, 210, y);
                        }
                        index++;
                    }
                }

                g.setColor(Color.RED);
                g.fillRoundRect(640, 15, 50,25, 5, 5);
                if(closeButton.contains(Panel.getXPos(), Panel.getYPos())){
                    choose = false;
                    choice = true;
                    reception = false;
                    penalty = 0;
                    defeats = 0;
                    Panel.resetPos();
                }

                if (q1.contains(Panel.getXPos(), Panel.getYPos())) {
                    q = AvailableQuests.getQuests().get(0);
                    space = 0;
                    Panel.resetPos();
                } else if (q2.contains(Panel.getXPos(), Panel.getYPos())) {
                    q = AvailableQuests.getQuests().get(1);
                    space = 1;
                    Panel.resetPos();
                } else if (q3.contains(Panel.getXPos(), Panel.getYPos())) {
                    q = AvailableQuests.getQuests().get(2);
                    space = 2;
                    Panel.resetPos();
                } else if (q4.contains(Panel.getXPos(), Panel.getYPos())) {
                    q = AvailableQuests.getQuests().get(3);
                    space = 3;
                    Panel.resetPos();
                } else if (q5.contains(Panel.getXPos(), Panel.getYPos())) {
                    q = AvailableQuests.getQuests().get(4);
                    space = 4;
                    Panel.resetPos();
                }
                if(q != null){
                    g.setColor(Color.GRAY);
                    g.fillRoundRect(20, 300, 660, 110, 5, 5);
                    String rec = "Receptionist: This quest is too high for you to do.\nPlease choose another one.";;
                    if(Run.getPlayer().getPLevel() >= q.getLevelRecommended()){
                        if(took) {
                            Run.getPlayer().setPQuest(q);
                            Run.getPlayer().setQuestNum(space);
                            took = false;
                        }
                        rec = "Receptionist: Alright!\nDo not forget that if you cancel this midway, you are going to get penalized.";

                    }

                    g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                    g.setColor(Color.WHITE);
                    int lineHeight = g.getFontMetrics().getHeight();
                    int y = 310;
                    for (String line : rec.split("\n")) {
                        y += lineHeight;
                        g.drawString(line, 40, y);
                    }

                    g.setColor(Color.RED);
                    g.fillRoundRect(640, 390, 50,25, 5, 5);
                    if(nextButton.contains(Panel.getXPos(), Panel.getYPos())){
                        Panel.resetPos();
                        q = null;
                        space = 0;
                        if(Run.getPlayer().getPQuest() != null){
                            done = false;
                            reception = false;
                        }
                    }
                }
            }
        }else{
            if(Run.getPlayer().getPQuest().getMonster().equals("Slime")){
                defeats = Run.getPlayer().getSlime();
            }else if(Run.getPlayer().getPQuest().getMonster().equals("Giant Rat")){
                defeats = Run.getPlayer().getGiantRat();
            }else if(Run.getPlayer().getPQuest().getMonster().equals("Kobold")){
                defeats = Run.getPlayer().getKobold();
            }else if(Run.getPlayer().getPQuest().getMonster().equals("Goblin")){
                defeats = Run.getPlayer().getGoblin();
            }else if(Run.getPlayer().getPQuest().getMonster().equals("Death")){
                defeats = Run.getPlayer().getDeath();
            }
            if(Run.getPlayer().getPQuest().getRequirements() > defeats){
                BufferedImage image = ImageLoader.getObj(Interactions.getNpc());
                g.drawImage(image, 20, 240, 50, 50, null);
                g.setColor(Color.DARK_GRAY);
                g.drawRoundRect(20, 240, 50, 50, 10, 10);

                String rec = "Receptionist: Welcome back!\nYou haven't finished your quest yet. Are you going to cancel it?";
                g.setColor(Color.GRAY);
                g.fillRoundRect(20, 300, 660, 110, 5, 5);
                g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                g.setColor(Color.WHITE);
                int lineHeight = g.getFontMetrics().getHeight();
                int y = 310;
                for (String line : rec.split("\n")) {
                    y += lineHeight;
                    g.drawString(line, 40, y);
                }

                g.setColor(Color.GREEN);
                g.fillRoundRect(640, 315, 50, 25, 5, 5);
                if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                    cancel = true;
                    Panel.resetPos();
                }

                if(cancel){
                    if(Run.getPlayer().getMoney() < (int)(Run.getPlayer().getPQuest().getReward() * 0.5) && deduct) {
                        rec = "Receptionist: You don't have enough money to cancel the quest! Just finish it, adventurer.";
                    }else{
                        if(deduct){
                            Run.getPlayer().reduceMoney((int)(Run.getPlayer().getPQuest().getReward() * 0.5));
                            penalty = (int)(Run.getPlayer().getPQuest().getReward() * 0.5);
                            deduct = false;
                        }
                        rec = "Receptionist: Alright, I received exactly " + penalty + " gold.\n\n\nYou now have " + Run.getPlayer().getMoney() + " gold left.";
                    }
                    g.setColor(Color.GRAY);
                    g.fillRoundRect(20, 300, 660, 110, 5, 5);
                    g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                    g.setColor(Color.WHITE);
                    lineHeight = g.getFontMetrics().getHeight();
                    y = 310;
                    for (String line : rec.split("\n")) {
                        y += lineHeight;
                        g.drawString(line, 40, y);
                    }
                }
                g.setColor(Color.RED);
                g.fillRoundRect(640, 390, 50, 25, 5, 5);
                if (nextButton.contains(Panel.getXPos(), Panel.getYPos())) {
                    if(!deduct){
                        Run.getPlayer().removePQuest();
                        Run.getPlayer().resetKill();
                    }
                    reception = false;
                    Panel.resetPos();
                }
            }else{
                BufferedImage image = ImageLoader.getObj(Interactions.getNpc());
                g.drawImage(image, 20, 240, 50, 50, null);
                g.setColor(Color.DARK_GRAY);
                g.drawRoundRect(20, 240, 50, 50, 10, 10);

                String rec = "Receptionist: Welcome back!\nI see that you finished your quest. Would you like to submit it?";
                g.setColor(Color.GRAY);
                g.fillRoundRect(20, 300, 660, 110, 5, 5);
                g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                g.setColor(Color.WHITE);
                int lineHeight = g.getFontMetrics().getHeight();
                int y = 310;
                for (String line : rec.split("\n")) {
                    y += lineHeight;
                    g.drawString(line, 40, y);
                }
                g.setColor(Color.GREEN);
                g.fillRoundRect(640, 315, 50, 25, 5, 5);
                if (acceptButton.contains(Panel.getXPos(), Panel.getYPos())) {
                    submit = true;
                    Panel.resetPos();
                }
                if(submit){
                    if(got){
                        got = false;
                        Run.getPlayer().giveMoney(Run.getPlayer().getPQuest().getReward());
                    }
                    rec = "Receptionist: Alright, here is your reward. Thank you for your hard work! \n\n\nYou received " + Run.getPlayer().getPQuest().getReward() + " gold. You now have " + Run.getPlayer().getMoney() + " gold.";
                    g.setColor(Color.GRAY);
                    g.fillRoundRect(20, 300, 660, 110, 5, 5);
                    g.setFont(new Font("Times New Roman", Font.PLAIN, 15));
                    g.setColor(Color.WHITE);
                    lineHeight = g.getFontMetrics().getHeight();
                    y = 310;
                    for (String line : rec.split("\n")) {
                        y += lineHeight;
                        g.drawString(line, 40, y);
                    }
                }
                g.setColor(Color.RED);
                g.fillRoundRect(640, 390, 50, 25, 5, 5);
                if (nextButton.contains(Panel.getXPos(), Panel.getYPos())) {
                    if(!got){
                        submit = false;
                        got = true;
                        Run.getPlayer().removePQuest();
                        Run.getPlayer().resetKill();
                    }
                    reception = false;
                    Panel.resetPos();
                }
            }
        }
    }

    public static void paintQuest(Graphics g){
        if(!openInfo){
            openInfo = false;
            return;
        }
        g.setColor(Color.WHITE);
        g.fillRoundRect(25, 25, 275, 100, 5, 5);
        g.setColor(Color.BLACK);
        g.drawRoundRect(25, 25, 275, 100, 5, 5);
        g.setFont(new Font("Times New Roman", Font.BOLD, 15));
        int lineHeight = g.getFontMetrics().getHeight();
        int y = 30;
        for (String line : Run.getPlayer().getPQuest().toString().split("\n")) {
            y += lineHeight;
            g.drawString(line, 30, y);
        }

        if(Run.getPlayer().getPQuest().getMonster().equals("Slime")){
            defeats = Run.getPlayer().getSlime();
        }else if(Run.getPlayer().getPQuest().getMonster().equals("Giant Rat")){
            defeats = Run.getPlayer().getGiantRat();
        }else if(Run.getPlayer().getPQuest().getMonster().equals("Kobold")){
            defeats = Run.getPlayer().getKobold();
        }else if(Run.getPlayer().getPQuest().getMonster().equals("Goblin")){
            defeats = Run.getPlayer().getGoblin();
        }else if(Run.getPlayer().getPQuest().getMonster().equals("Death")){
            defeats = Run.getPlayer().getDeath();
        }

        g.drawString("Progress: " + defeats + "/" + Run.getPlayer().getPQuest().getRequirements(), 30, 110);

        g.setColor(Color.RED);
        g.fillRoundRect(640, 15, 50,25, 5, 5);
        if(closeButton.contains(Panel.getXPos(), Panel.getYPos()) || Fight.isEncounter() || ImagePaint.getOpenTxt() || ImagePaint.getOpenShop() || ImagePaint.getReception() || Run.getPlayer().getOpenInv()){
            openInfo = false;
            Panel.resetPos();
        }
    }


    public static void paintLose(Graphics g){
        if(!dead){
            return;
        }
        BufferedImage image = ImageLoader.getObj("death");
        g.drawImage(image, 0, 0, 700, 420, null);
    }

    public static void setOpenInfo(){
        openInfo = true;
    }
    public static boolean getOpenInfo(){
        return openInfo;
    }
    public static boolean getOpenShop(){
        return  openShop;
    }
    public static boolean getOpenTxt(){
        return openTxt;
    }
    public static boolean getReception(){
        return reception;
    }

    public static boolean getBuy(){
        return buy;
    }


}
