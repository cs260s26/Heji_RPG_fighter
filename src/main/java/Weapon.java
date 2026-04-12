public class Weapon{
    private int damage;
    private int manaConsumed;

    public Weapon (int dmg, int mpUsed){
        this.damage = dmg;
        this.manaConsumed = mpUsed;
    }
    public int getDamage(){
        return damage;
    }
    public int getMana(){
        return manaConsumed;
    }
}