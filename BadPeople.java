package humans;

import java.util.Random;

 public class BadPeople extends Humans implements Villain {
    String[] evilPowers = {"quake", "laser", "telekinetics", "ice"};
    int evilPowerChoice = new Random().nextInt(evilPowers.length);
    String randomEvilPower = evilPowers[evilPowerChoice];
    
    String[] evilCostumes = {"black hood, cape, and boots", "red helmet, black suit, and green boots",
            "blue cape, orange boots", "yellow hood, cape, and purple boots"};
    int evilCostumeChoice = new Random().nextInt(evilCostumes.length);
    String randomEvilCostume = evilCostumes[evilCostumeChoice];
    
    public void destruction(){
        System.out.println("What kind of crime can I commit today?");
    }
    
    public void fight(String name){
        System.out.println("I'm going to crush you, " + name + "!");
    }
    
    public void defeat(String name){
        System.out.println("You cannot defeat me, " + name + ". I'm invincible!");
    }
    
    @Override
    public String iPower(){
        return randomEvilPower;
    }
    
    @Override
    public String iCostume(){
        return randomEvilCostume;
    }
    
}
