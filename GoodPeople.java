package humans;

import java.util.Random;

public class GoodPeople extends Humans implements Hero {
    String[] powers = {"fire", "wind", "water", "lightning"};
    int powerChoice = new Random().nextInt(powers.length);
    String randomPower = powers[powerChoice];
    
    String[] costumes = {"green cape and red boots", "red cape and yellow boots",
    "blue suit, orange helmet, and black boots", "purple suit, black sunglasses, and white boots"};
    int costumeChoice = new Random().nextInt(costumes.length);
    String randomCostume = costumes[costumeChoice];
    
     public void senseDanger(){
        System.out.println("I sense danger ahead.  Time to save the day!");
     }
     
     public void defense(String name){
        System.out.println("Bring it on, " + name + "...");
     }
     
     public void victory(String name){
         System.out.println(name + ", your days of destruction are over.  Good always prevails over evil!");
     }
    
    @Override
    public String iPower(){
        return randomPower;
    }
    
    @Override
    public String iCostume(){
        return randomCostume;
    }
}
