

public class program02_06
{
	static double x;
	static int y;
	
	
	static void metot1()
	{
		double x=5.5;
		int y=6;
		System.out.println("Bu print metot1'in içinde çalışıyor. x= " + x + " y= " + y);
		
	
	}
	
	public static void main (String[] args)
	{
		x=2.5;
		y=15;
		System.out.println("Main fonk print'i x= " + x + " y= " + y);
		
		metot1();
		
		System.out.println("Main fonk print'i x= " + x + " y= " + y);
	}

}
