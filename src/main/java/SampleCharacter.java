public class SampleCharacter extends Character {
    public SampleCharacter(Weapon weapons, Armor armors, String names) {
        super((int) (Math.random() * 11) + 20,   // 20–30 health
                (int) (Math.random() * 6) + 5,     // 5–10 mana
                weapons, armors, names, //supers these
                1, //1 inventory
                (int) (Math.random() * 10) + 1); // 1-10 speed
    }
}