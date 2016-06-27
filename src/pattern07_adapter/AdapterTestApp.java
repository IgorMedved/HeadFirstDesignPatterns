package pattern07_adapter;

public class AdapterTestApp
{
	public static void main(String[] args)
	{
		Turkey turkey = new WildTurkey();
		DuckAdapterTurkey adapter = new DuckAdapterTurkey(turkey);
		
		System.out.println("Originally I am a turkey, but look at me impersonating a duck");
		testAdapter(adapter);
	}
	
	
	public static void testAdapter (DuckAdapterTurkey adapter)
	{
		adapter.quack();
		adapter.fly();
	}
	

}
