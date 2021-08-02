package QuestLine;

public class Quest {
    private String name;
    private int levelRecommended;
    private int requirements;
    private String monster;
    private int reward;
    public Quest(String name, int levelRecommended, int requirements, String monster, int reward){
        this.name = name;
        this.levelRecommended = levelRecommended;
        this.requirements = requirements;
        this.monster = monster;
        this.reward = reward;
    }
    public String toString(){
        return "Quest Name: " + name + " Level req: " + levelRecommended + "\nRequirements: " + requirements + " " + monster + "(s)" + "\nReward: " + reward + " gold";
    }
    public String getMonster(){
        return monster;
    }
    public int getRequirements(){
        return requirements;
    }
    public int getLevelRecommended(){
        return levelRecommended;
    }
    public int getReward(){
        return reward;
    }
}
