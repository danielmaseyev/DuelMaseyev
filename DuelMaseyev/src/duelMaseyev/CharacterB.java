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
		if(isStartGame==false) {
			this.life = hp;
			isStartGame=true;
		}
	}
	public int getHP() {
		return this.life;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP()==hp) {
			return true;
		}
		else{
			return false;
		}
		
	}
	public int getAction(Object caller) {
		if(caller instanceof Duel) {
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
					return Duel.GUARDING;
				}
				else {
					isLoaded=false;
					return Duel.SHOOTING;
				}
			}
		}
		else {
			return Duel.YEAH_RIGHT;
			}
			
		}
	public void hit(Object caller) {
		if(caller instanceof Dueler) 
		{
			this.life = this.life-20;
		}
	}



}	