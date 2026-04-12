public class Arena {
    public static void Arena(){
        Character p1;
        Character p2;
        boolean fightOver = false;
        Weapon sword = new Weapon(5, 0);
        Weapon axe = new Weapon (3, 0);
        Armor basicArmor = new Armor(3, 2);
        Character contender1 = new SampleCharacter(sword, basicArmor, "John");
        Character contender2 = new SampleCharacter(axe, basicArmor, "Bob");

        if(contender1.getSpeed() >= contender2.getSpeed()){
            p1 = contender1;
            p2 = contender2;
        }else{
            p1 = contender2;
            p2 = contender1;
        }

        int hp1;
        int hp2;

        while (!fightOver){
            p2.takeDamage(p1.dealDamage());
            p1.takeDamage(p2.dealDamage());
            hp1 = p1.getHP();
            hp2 = p2.getHP();
            if (hp1 <= 0 || hp2 <= 0){
                fightOver = true;
            }
        }
        if (p1.getHP() <= 0){
            System.out.println(p2.getName() + " has won the battle!");
        }
        if (p2.getHP() <= 0){
            System.out.println(p1.getName() + " has won the battle!");
        }
    }
}
