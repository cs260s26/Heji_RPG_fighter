import java.util.Scanner;



public class Character{
    private int hp;
    private int mp;
    private Weapon weapon;
    private Armor armor;
    private String name;
    private String [] inventory;

    public Character(int health, int magic, Weapon weapon, Armor armor, String Name, int max){
        this.hp = health;
        this.mp = magic;
        this.weapon = weapon;
        this.armor = armor;
        this.name = name;
        inventory = new String [max];
    }
}