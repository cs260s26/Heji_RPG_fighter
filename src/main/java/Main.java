public class Main {
    public static void main(String[] args){
        Character Mage = new Character(10, 10, new Weapon(2,1),new Armor(2,2),"Joseph",1,2);
        BallerBrawler e = new BallerBrawler("joe");

        System.out.println("Program started");

        Weapon sword = new Weapon(5, 0);
        Armor armor = new Armor(3, 2);

        Character c1 = new SampleCharacter(sword, armor, "John");
        Character c2 = new SampleCharacter(sword, armor, "Bob");

        Arena arena = new Arena(c1, c2);
        arena.startFight();
    }
}
