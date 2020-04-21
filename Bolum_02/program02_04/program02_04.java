

public class program02_04
{
	public static void main(String[] args)
	{
		double a,b,c,d;
		
		a=metot_nesnesi.us(1.01,99);
		b=metot_nesnesi.reqüs(0.99,101);
		c=metot_nesnesi.Faktoriel(5);
		d=metot_nesnesi.reqFaktoriel(4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}



class metot_nesnesi
{	
	public static double us(double taban, int us)
	{
		double snc=1;
		for(int i = us; i>1; i--)
		{
			snc*=taban;
		}
		return snc;
	}
	
	public static double reqüs(double taban, int us)
	{	
		double snc=1;
		if (us==1)
		{
			return taban;
		}
		else
		{
			return taban*reqstatiküs(taban,us-1);
		}
	}
	public static double Faktoriel(int sayi)
	{
		int snc=1;
		for (int i = sayi; i>1; i--)
		{
			snc*=i;
		}
		return snc;
	}
	
	public static double reqFaktoriel(int sayi)
	{	
		if (sayi ==1)
		return sayi;
		else		
		return sayi * reqFaktoriel(sayi-1);
	}
	
}


