package duelMaseyev;

public class CharacterA implements Dueler
{
	int hp;
	private boolean isLoaded;

public CharacterA() 
	{
		isLoaded = false;
	}
	public void taunt() 
	{
		System.out.println("Go now");	
	}
	public String getName()
	{
		return "Daniel Maseyev";
	}

	public void setStartingHP(int hp) 
	{
		this.hp = hp;
	}
	public int getHP() 
	{
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) 
	{
		if(d.getHP()==hp) 
		{
			return true;
		}
		return false;
	}
	public int getAction(Object caller) 
	{
		if(caller instanceof Duel)
		{
			if(isLoaded==false)
			{
				if(Math.random()>0.5)
				{
					return Duel.GUARDING;
				}
				else
				{
					isLoaded = true;
					return Duel.LOADING;
				}		
			}
			else
			{
				
					isLoaded = false;
					return Duel.SHOOTING;
				
			}
		}
			
		else {
		return Duel.YEAH_RIGHT;
		}
	}
	public void hit(Object caller) 
	{
		if(caller instanceof Duel) 
			{
			hp = hp - 20;
			}
	}
}
