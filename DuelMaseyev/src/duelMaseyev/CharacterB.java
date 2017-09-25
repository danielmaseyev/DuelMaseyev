package duelMaseyev;

public class CharacterB implements Dueler{
	
	int life;
	boolean isStartGame = true;
	public CharacterB() {

	}
	public void taunt() {
		System.out.println("Go now");	
	}
	public String getName() {
		return "Daniel Eisen";
	}

	public void setStartingHP(int hp) {
		if(isStartGame==true) {
			this.life = hp;
			isStartGame=false;
		}
	}
	public int getHP() {
		return this.life;
	}
	
	//START WORK HERE
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP()==hp) {
			return true;
		}
		return false;
	}
	public int getAction(Object caller) {
		return caller instanceof a ;
	}
	public void hit(Object caller) {
		this.life = this.life-20;
	}



}	