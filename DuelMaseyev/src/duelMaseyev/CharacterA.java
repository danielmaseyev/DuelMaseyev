package duelMaseyev;

public class CharacterA implements Dueler
{
	int life;
public CharacterA() 
	{

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
		this.life = hp;
	}
	public int getHP() 
	{
		return this.life;
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
		return caller instanceof a ;
	}
	public void hit(Object caller) 
	{
		this.life = this.life - 20;
	}
}