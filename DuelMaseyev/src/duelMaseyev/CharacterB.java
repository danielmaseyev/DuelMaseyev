package duelMaseyev;

public class CharacterB implements Dueler{
	
	int life;
	public CharacterB() {

	}
	public void taunt() {
		System.out.println("Go now");	
	}
	public String getName() {
		return "Daniel Eisen";
	}

	public void setStartingHP(int hp) {
		this.life = hp;
	}
	public int getHp() {
		return this.life;
	}
	
	//START WORK HERE
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d=hp) {
			return true;
		}
	}
	public int getAction(Object caller) {
		return caller instanceof a ;
	}
	public void hit(Object caller) {
		return true;
	}



}	