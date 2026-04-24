public class BeastTamer extends Character{

    private int BeastType;
    private String[] beasts;
    private String beastUsed;
    private boolean IsMeatEater;
    public BeastTamer(Weapon weapon, Armor armor, String name, int max, int initiative) {
        super(50, 0, weapon, armor, name, max, initiative);
        BeastType=(int)(Math.random()*(3-0+1)+0);
        beasts=new String[]{"Rats","Dinosaur","Pandas","Fish"};
        beastUsed=beasts[BeastType];
        if(BeastType==1){
            int flip=(int)(Math.random()*(1-0+1)+0);
            if (flip==1){
                IsMeatEater=false;
            }else{
                IsMeatEater=true;
            }
        }
    }
    @Override
    public int dealDamage(){
       int damage;
       if (beastUsed.equals("Rats")){
           damage=10;
        } else if (beastUsed.equals("Dinosaur")) {
           if(IsMeatEater==true){
              damage=30;
               meteorShowerChance();
           }else {
               damage = 10;
               meteorShowerChance();
           }
       } else if (beastUsed.equals("Panda")) {
           damage=20;
       } else{
           //Fish can't do damage on land silly people
           //great game balance
           damage=0;
       }
        return damage;
    }

    @Override
    public void heal(int health){
        if (beastUsed.equals("Rats")){
            health=health+10;
            System.out.println("Rats need snacks");
        } else if (beastUsed.equals("Dinosaur")) {
            if(IsMeatEater==true){
                health=health+10-(((int)(Math.random()*(5-0+1)+0)));
                System.out.println("Dino wanted a nibble of you");
            }else{
              health=health+10;
            }
        } else if (beastUsed.equals("Panda")) {
            health=health+15;
            System.out.println("Panda was hungry and took part of the snack");
            //It is one panda it eats less
        } else{
            health=health-1;
            System.out.println("Don't eat raw fish it is bad for you, life lessons kids");
        }
    }
    public void meteorShowerChance(){
        int dice=(int)(Math.random()*(100-0+1)+0);
        if(dice==50){
          meteorShower();
        }
    }
    public void meteorShower(){
        System.out.print("Oh snap there is a meteor shower and all the Dinosaurs died.");
        BeastType=(int)(Math.random()*(3-0+1)+0);
        while (BeastType==1){
            BeastType=(int)(Math.random()*(3-0+1)+0);
        }
        beastUsed=beasts[BeastType];
    }
}
