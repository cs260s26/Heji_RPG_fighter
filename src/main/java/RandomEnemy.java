public class RandomEnemy{
    private int characterType;
    public RandomEnemy() {
        characterType=(int)(Math.random()*(2-0+1)+0);
    }

    public int getCharacterType(){
        return characterType;
    }

    public Character makeRandomCharacter(int type){
        if(type==0){
            return new BeastTamer(new Weapon(0,0) ,new Armor(15,10) ,"Steve" ,5 ,2);
        } else if (type==1) {
            return new BallerBrawler("Steve");
        }else{
            return new Wizard(new Wand(),new Armor(5,5),"Steve");
        }
    }
}

