package Battle;

import Entities.Monster;
import Foundation.Monsters;
import GUI.Run;

public class Fight {
    private static Monster challenge;
    private static boolean encounter;
    private static int run;
    public static void versus(){
        run = (int)(Math.random()*10) + 1;
        //monster appear chance
        int randomFight= (int)(Math.random()*100) + 1;
        int chance = 20;

        if(Run.getPlayer().getPLevel() > 10){
            chance = 50;
        }

        // which monster chance
        int randomChance = (int)(Math.random()*100) + 1;

        if(randomFight <= chance)
        {
            if(randomChance <= 75){
                randomChance = (int)(Math.random()*100) + 1;
                if(randomChance <= 50){
                    Monsters.setUpSlimes();
                    challenge = Monsters.getSlime();
                }else{
                    Monsters.setUpGiantRat();
                    challenge = Monsters.getGiantRat();
                }
                encounter = true;
            }else if(randomChance <= 90 && Run.getPlayer().getPLevel() > 12){
                Monsters.setUpGoblins();
                challenge = Monsters.getGoblin();
                encounter = true;
            }else if(randomChance <= 100 && Run.getPlayer().getPLevel() > 18){
                Monsters.setUpKobolds();
                challenge = Monsters.getKobold();
                encounter = true;
            }
        }
    }
    public static boolean isEncounter(){
        return encounter;
    }
    public static void stopEncounter(){
        encounter = false;
    }
    public static Monster getChallenge(){
        return challenge;
    }
    public static int getRun()
    {
        return run;
    }

}
