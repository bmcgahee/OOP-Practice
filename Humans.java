package humans;

public class Humans {
    String name;
    String height;
    String eyes;
    String power;
    String costume;
    
    int weight;
    int age;
    
    public void getName(String name){
        System.out.println("Hello, my name is " + name + ".");
    }
    
    public void getHeight(String height){
        System.out.println("My height is " + height + ".");
    }
    
    public void getEyes(String eyes){
        System.out.println("I have " + eyes + " eyes.");
    }
    
    public void getWeight(int weight){
        System.out.println("My weight is " + weight + ".");
    }
    
    public void getAge(int age){
        System.out.println("I'm " + age + " years old.");
    }
    
    public void getIPower(String power){
        System.out.println("My power is: " + power);
    }
    
    public void getICostume(String costume){
         System.out.println("My costume is: " + costume);
    }
    
    public double getPower(){
         double powerUp = Math.round(Math.random());
         return powerUp;
     }
    
    public static void main(String[] args) {
       GoodPeople gp = new GoodPeople();
       
       gp.name = "Ben";
       gp.age = 33;
       gp.height = "5'10''";
       gp.weight = 145;
       gp.eyes = "blue";
       
       gp.getName(gp.name);
       gp.getAge(gp.age);
       gp.getHeight(gp.height);
       gp.getWeight(gp.weight);
       gp.getEyes(gp.eyes);
       
       BadPeople bp = new BadPeople();
       
       bp.name = "Caleb";
       bp.age = 29;
       bp.height = "5'9''";
       bp.weight = 200;
       bp.eyes = "green";
       
       bp.getName(bp.name);
       bp.getAge(bp.age);
       bp.getHeight(bp.height);
       bp.getWeight(bp.weight);
       bp.getEyes(bp.eyes);
       
       bp.destruction();
       gp.senseDanger();
       
       gp.power = gp.iPower();
       gp.costume = gp.iCostume();
       gp.getIPower(gp.power);
       gp.getICostume(gp.costume);
       
       bp.power = bp.iPower();
       bp.costume = bp.iCostume();
       bp.getIPower(bp.power);
       bp.getICostume(bp.costume);
       
       bp.fight(gp.name);
       gp.defense(bp.name);
       
       double villainPower = bp.getPower();
       double heroPower = gp.getPower();
       
       if(heroPower > villainPower){
           System.out.println(gp.name + " wins the fight!");
           System.out.println("You will learn that crime does not pay!");
           gp.victory(bp.name);
       }
       else if(villainPower > heroPower){
           System.out.println("Unfortunately, " + bp.name + " wins the fight.");
           System.out.println("Your powers are weak!");
           bp.defeat(gp.name);
       }
       else {
           System.out.println("Our powers are equal. We fight another day.");
       }  
    }
}
