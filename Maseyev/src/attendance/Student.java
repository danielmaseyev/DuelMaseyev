package attendance;

public class Student implements Attendee
{
	private String first;
	private String last;
	private boolean present;
	public Student(String firstName, String lastName)
	{
		this.first = firstName;
		this.last = lastName;
				
	}
	public boolean isPresent()
	{
		if (present)
		{
			return true;
		}
		return false;
	}
	public void setPresent(boolean present)
	{
		this.present = isPresent();
	}
	public String getFirstName()
	{
		return first; 
	}
	public String getLastName()
	{
		return last;
	}
	public boolean matches(String first, String last)
	{
		if(this.first.equals(first) && this.last.equals(last)) 
		{	
			return true;	
		}
		return false;
	}	

	public boolean matches(String last)
	{
		return last.toLowerCase().equals(last.toLowerCase());
	}
	public String getReportString()
	{
		String t = last;
		while(t.length()<20)
		{
			t+=" ";
		}
		t+= first;
		while(t.length()<40)
		{
			t+=" ";
		}
		if(present=true)
		{
			t+= "PRESENT";
		}
		t+= "ABSENT";
		return t;
	}
	
}