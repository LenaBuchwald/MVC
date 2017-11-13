package Observer;
import java.util.*; 

public class Subject 
{
	private ArrayList <Observer> observer_liste= new ArrayList<>();
	
	public void attach (Observer o1)
	{
		observer_liste.add(o1);
	}
	
	public void detach (Observer o1)
	{
		observer_liste.remove(o1);
	}
	
	public void notifyObserver()
	{
		for (Observer observer : observer_liste) 
		{ 
			observer.mitteilen(); 
		}

	}
}
