package Foundation;
import Stuff.*;

import java.util.ArrayList;

public class Items {
    private static ArrayList<Item> weapons = new ArrayList(4);
    private static ArrayList<Item> armors = new ArrayList(8);
    private static ArrayList<Item> potions = new ArrayList(1);
    private static Item[] weaponShop = new Item[5];
    private static Item[] armorShop = new Item[8];

    //weapons
    private static final Item wooden_sword = new Weapon("wooden_sword", "Wooden Sword", "Weapon",7, false,9,7);
    private static final Item sai = new Weapon("sai", "Sai", "Weapon",16, true, 5, 79);
    private static final Item katana = new Weapon("katana", "Katana", "Weapon",35, true,3,175);
    private static final Item thorn_sword = new Weapon("thorn_sword", "Thorn Sword", "Weapon",57, true,0,199);
    private static final Item great_sword = new Weapon("great_sword", "Great Sword", "Weapon",79, true, 0, 256);
    private static final Item scythe = new Weapon("scythe", "Scythe", "Weapon",134, false,1,0);

    //leather armor
    private static final Item leather_breastplate = new Armor("leather_breastplate", "Leather Breastplate", "Armor", "Chest",7,true,6, 10);
    private static final Item leather_boots = new Armor("leather_boots", "Leather Boots", "Armor","Boots",4, true,8, 6);

    //Iron armor
    private static final Item iron_helmet = new Armor("iron_helmet", "Iron Helmet", "Armor","Helmet",13, true, 4, 75);
    private static final Item iron_breastplate = new Armor("iron_breastplate", "Iron Breastplate", "Armor","Chest", 17,true,3, 90);
    private static final Item iron_boots = new Armor("iron_boots", "Iron Boots", "Armor","Boots", 10,true,5, 65);

    //Steel armor
    private static final Item steel_helmet = new Armor("steel_helmet", "Steel Helmet", "Armor","Helmet",21, true,2, 130);
    private static final Item steel_breastplate = new Armor("steel_breastplate", "Steel Breastplate", "Armor","Chest",28, true,1, 150);
    private static final Item steel_boots = new Armor("steel_boots", "Steel Boots", "Armor","Boots", 18,true,2, 115);

    //Potion
    private static final Item health_potion = new Potion("health_potion", "Health Potion", "Potion", false,8, 0);

    public static void setWeapons(){
        weapons.add(wooden_sword);
        weapons.add(sai);
        weapons.add(katana);
        weapons.add(thorn_sword);
        weapons.add(great_sword);
        weapons.add(scythe);
    }

    public static void setArmors(){
        armors.add(leather_breastplate);
        armors.add(leather_boots);
        armors.add(iron_helmet);
        armors.add(iron_breastplate);
        armors.add(iron_boots);
        armors.add(steel_helmet);
        armors.add(steel_breastplate);
        armors.add(steel_boots);
    }

    public static void setWeaponShop(){
        weaponShop[0] = sai;
        weaponShop[1] = thorn_sword;
        weaponShop[2] = great_sword;
        weaponShop[3] = katana;
        weaponShop[4] = wooden_sword;
    }

    public static void setArmorShop(){
        armorShop[0] = iron_breastplate;
        armorShop[1] = steel_helmet;
        armorShop[2] = iron_boots;
        armorShop[3] = steel_breastplate;
        armorShop[4] = leather_boots;
        armorShop[5] = iron_helmet;
        armorShop[6] = steel_boots;
        armorShop[7] = leather_breastplate;
    }

    public static void setPotions(){
        potions.add(health_potion);
    }

    public static ArrayList<Item> getWeapons(){
        return weapons;
    }

    public static ArrayList<Item> getArmors(){
        return armors;
    }

    public static ArrayList<Item> getPotions(){
        return potions;
    }

    public static Item[] getWeaponShop(){
        return weaponShop;
    }

    public static Item[] getArmorShop(){
        return armorShop;
    }
}
