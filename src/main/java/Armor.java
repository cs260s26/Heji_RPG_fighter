public class Armor{
    private int defense;
    private int weight;

    public Armor (int defend, int pounds){
        this.defense = defend;
        this.weight = pounds;
    }
    public int getDefense(){
        return defense;
    }
    public int getWeight(){
        return weight;
    }
}