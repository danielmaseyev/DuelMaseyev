package duelMaseyev;

public class CharacterB implements Dueler{
	
	int life;
	public class CharacterB {

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
	




}	