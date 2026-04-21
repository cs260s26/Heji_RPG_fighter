public class Arena {

    private Character p1;
    private Character p2;

    public Arena(Character c1, Character c2) {
        if (c1.getSpeed() >= c2.getSpeed()) {
            p1 = c1;
            p2 = c2;
        } else {
            p1 = c2;
            p2 = c1;
        }
    }

    public void startFight() {
        boolean fightOver = false;

        while (!fightOver) {
            p2.takeDamage(p1.dealDamage());
            if (p2.getHP() <= 0) break;

            p1.takeDamage(p2.dealDamage());
            if (p1.getHP() <= 0) break;
        }

        if (p1.getHP() <= 0) {
            System.out.println(p2.getName() + " has won the battle!");
        } else {
            System.out.println(p1.getName() + " has won the battle!");
        }
    }
}