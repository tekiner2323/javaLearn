

class OverloadingOrnek
{
	public static int usAl (int taban)
	{
		return taban*taban;
	}
	public static int usAl (int taban, int kuvvet)
	{
		if (kuvvet>1)
		{
			return taban*usAl(taban,kuvvet-1);
		}
		else
		{
			return taban;
		}
	}
	public static double usAl (double taban,int kuvvet)
	{
		if (kuvvet>1)
		{
			return taban*usAl(taban,kuvvet-1);
		}
		else
		{
			return taban;
		}
	}
	
}

public class program02_05
{
	public static void main (String[] args)
	{
		int a = OverloadingOrnek.usAl(5);
		int b = OverloadingOrnek.usAl(5,3);
		double c = OverloadingOrnek.usAl(5.5,3);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
