import java.util.Random;

public class Weapon{
    private int damage;
    private int manaConsumed;

    public Weapon (int dmg, int mpUsed){
        this.damage = dmg;
        this.manaConsumed = mpUsed;
    }
    public int getDamage(){
        Random rng = new Random();
        if((int) (Math.random() * 10) == 9)
        {
            return damage * 2; // Critical hit every 1/10 times.
        }
        return damage;
    }
    public int getMana(){
        return manaConsumed;
    }
}
