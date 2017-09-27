package duelMaseyev;
public class CharacterB implements Dueler {
	 
    private String name;
    private String taunt;
    private int hp;
    private boolean dloaded;
 
    public CharacterB () {
 
        dloaded = false;
 
    }
 
 
    public String getName() {
 
        this.name = "Daniel Eisen";
        return name;
    }
 
    public void taunt() {
 
        this.taunt = "Go now!!!";
        System.out.println(taunt);
    }
 
    public void setStartingHP(int hp) {
 
        this.hp = hp;
 
        hp = 100;
    }
 
    public int getHP(){
 
        return hp;
    }
 
    public boolean determineIfOpponentIsFair(Dueler d, int target) {
 
        if(d.getHP() == target) {
 
            return true;
        }
 
        return false;
    }
 
    public int getAction(Object caller) {  
 
        if(caller instanceof Duel ) {
 
            if(dloaded == false){
 
               
                if(Math.random() < .5) {
                    dloaded = true;
                    return Duel.LOADING;
 
                }else {
                   
                    return Duel.GUARDING;
                }
 
            }
 
            else {
               
                dloaded = false;
                return Duel.SHOOTING;
               
            }
        }
        else {
 
            return Duel.YEAH_RIGHT;
 
        }
    }
 
    public void hit(Object caller) {
 
 
        if(caller instanceof Duel ) {
 
            hp = hp - 10;
 
 
        }
 
    }
 
}