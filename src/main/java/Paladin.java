public class Paladin extends Character {
    public Paladin(HolySword weapon, Armor armors, String names) {
        super((int) (Math.random() * 11) + 10,   // 10–20 health
                (int) (Math.random() * 6) + 20,     // 20–25 mana
                weapon, armors, names, //supers these
                1, //1 inventory
                (int) (Math.random() * 10) + 1); // 1-10 speed
    }
    @Override
    public int dealDamage(){
        if (canAttack()){
            int output = getWeapon().getDamage() + ((int)(Math.random()*7) - 3); //increase/decreases attack by 3
            System.out.println("holy damage");
            return output;
        }
        return 0;
    }
}