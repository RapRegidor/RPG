package QuestLine;

import java.util.ArrayList;

public class AvailableQuests {
    private static final Quest peskyRats = new Quest("Pesky Rats", 1,10, "Giant Rat", 20);
    private static final Quest slimeBalls = new Quest("Slime Balls", 1,10, "Slime", 15);
    private static final Quest goblinHerd = new Quest("Goblin Herd", 14,7, "Goblin", 45);
    private static final Quest bigDogs = new Quest("Big Dogs", 18,5, "Kobold", 75);
    private static final Quest lifeDeath = new Quest("Life 'n Death", 10000,1, "Death", 500);

    private static ArrayList<Quest> quests;

    public static void questSetUp(){
        quests = new ArrayList<Quest>(5);
        quests.add(peskyRats);
        quests.add(slimeBalls);
        quests.add(goblinHerd);
        quests.add(bigDogs);
        quests.add(lifeDeath);
    }
    public static ArrayList<Quest> getQuests(){
        return quests;
    }
}
