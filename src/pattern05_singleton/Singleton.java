package pattern05_singleton;

public class Singleton
{
	private static Singleton instance;
	
	
	private Singleton()
	{
		
	}
	
	public Singleton getInstance()
	{
		if (instance == null )
		{
			instance = new Singleton();
		}
		
		return instance;
	}
	
	/* 
    three ways to solve singleton multi-threading issues
	   	1) initialize instance outside getInstance (private static Singleton instance = new Singleton();) 
	disadvantage initialization happens whether or not singleton is used
	   	2) synchronize getInstance() - big performance hit
	   	3) synchronize block inside getInstance & make instance volatile
	   	 public Singleton getInstance()
	   	 {
	   	 	if (instance == null)
	   	 	synchronize(Singleton.class)
	   	 	{
	   	 		if (instance == null)
	   	 		   instance == new Singleton();
	   	 		   
	   	 	}
	   	 	return instance;
	   	 }
		
	*/
	 
	

}
