package Foundation;

import Entities.Monster;
import Stuff.Item;

import java.util.ArrayList;

public class Monsters {
    private static Monster slime;
    private static Monster giantRat;
    private static Monster goblin;
    private static Monster kobold;

    //I have to add exp drops
    public static void setUpSlimes(){
        int level = (int)(Math.random() * 5) + 1;
        int hp = (int)(Math.random() * 25) + 2*level + 10;
        int str = (int)(Math.random() * 3) + 2 * level;
        int def = (int)(Math.random() * 7) + 2 * level;

        int expDrop = (int)(Math.random() * 10) + 6 * level + 20;

        ArrayList<Item> drops = new ArrayList<Item>();
        drops.add(Items.getPotions().get(0));
        drops.add(Items.getArmors().get(1));
        slime = new Monster("Slime", level, hp, str, def, drops, expDrop);
    }
    public static void setUpGiantRat(){
        int level = (int)(Math.random() * 6) + 1;
        int hp = (int)(Math.random() * 30) + 2*level+ 10;
        int str = (int)(Math.random() * 7) + 2 * level;
        int def = (int)(Math.random() * 10) + 2 * level;

        int expDrop = (int)(Math.random() * 15) + 6 * level + 20;

        ArrayList<Item> drops = new ArrayList<Item>();
        drops.add(Items.getPotions().get(0));
        drops.add(Items.getWeapons().get(1));
        giantRat = new Monster("Giant Rat", level, hp, str, def, drops, expDrop);
    }
    public static void setUpGoblins(){
        int level = (int)(Math.random() * 7) + 10;
        int hp = (int)(Math.random() * 25) + 4 * level + 10;
        int str = (int)(Math.random() * 5) + 3 * level;
        int def = (int)(Math.random() * 10) + level;

        int expDrop = (int)(Math.random() * 50) + 6 * level + 20;

        ArrayList<Item> drops = new ArrayList<Item>();
        drops.add(Items.getWeapons().get(1));
        drops.add(Items.getArmors().get(0));
        drops.add(Items.getArmors().get(2));
        goblin = new Monster("Goblin", hp, hp, str, def, drops, expDrop);
    }
    public static void setUpKobolds(){
        int level = (int)(Math.random() * 5) + 20;
        int hp = (int)(Math.random() * 30) + 5 * level+ 10;
        int str = (int)(Math.random() * 14) + 2 * level;
        int def = (int)(Math.random() * 10) + 2 * level;

        int expDrop = (int)(Math.random() * 50) + 7 * level + 20;

        ArrayList<Item> drops = new ArrayList<Item>();
        drops.add(Items.getWeapons().get(1));
        drops.add(Items.getWeapons().get(2));
        drops.add(Items.getArmors().get(3));
        drops.add(Items.getArmors().get(4));
        kobold = new Monster("Kobold", hp, hp, str, def, drops, expDrop);
    }

    public static Monster getSlime(){
        return slime;
    }

    public static Monster getGiantRat(){
        return giantRat;
    }

    public static Monster getGoblin(){
        return goblin;
    }

    public static Monster getKobold(){
        return kobold;
    }
}
