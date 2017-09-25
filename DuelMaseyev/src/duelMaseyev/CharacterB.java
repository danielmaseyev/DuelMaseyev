package duelMaseyev;

public class CharacterB implements Dueler{
	
	private int life;
	private boolean isStartGame;
	private boolean isLoaded;
	public CharacterB() {
		isStartGame=false;
		isLoaded=false;
	}
	public void taunt() {
		System.out.println("Go now!!!!!!");	
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
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP()==hp) {
			return true;
		}
		return false;
	}
	public int getAction(Object caller) {
		if(caller instanceof Dueler) {
			if(isLoaded==false)
			{
				if(Math.random()>0.5) {
					return Duel.GUARDING;
				}
				else {
					isLoaded=true;
					return Duel.LOADING;
				}
			}
			else {
				if(Math.random()>0.5) {
					return Duel.GUARDING
				}
				else {
					return Duel.SHOOTING;
					isLoading=false;
				}
			}
		}
		return Duel.YEAH_RIGHT;
			
		}
	public void hit(Object caller) {
		this.life = this.life-20;
	}



}	