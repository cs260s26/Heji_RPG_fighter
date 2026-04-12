public class Character {
    private int hp;
    private int mp;
    private Weapon weapon;
    private Armor armor;
    private String name;
    private String[] inventory;
    private int speed;

    public Character(int health, int magic, Weapon weapon, Armor armor, String name, int max, int initiative) {
        this.hp = health;
        this.mp = magic;
        this.weapon = weapon;
        this.armor = armor;
        this.name = name;
        inventory = new String[max];
        this.speed = initiative;
    }

    public void heal(int health) {
        hp = hp + health;
        System.out.println(this.name + " healed to" + health + " hp.");
    }

    public void takeDamage(int amount) {
        hp = hp - amount + armor.getDefense();
        System.out.println(this.name + " took " + amount + " damage.");
    }

    public boolean canAttack(){
        if (mp >= weapon.getMana()){
            return true;
        }
        return false;
    }
    public int dealDamage(){
        if (canAttack()){
            mp = mp - weapon.getMana();
            return weapon.getDamage();
        }
        return 0;
    }

    public void useMana(int amount) {
        mp = mp - amount;
    }

    public int getHP() {
        return hp;
    }

    public int getMP() {
        return mp;
    }

    public int getSpeed() {
        return speed + armor.getWeight();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public String getName(){
        return name;
    }
}