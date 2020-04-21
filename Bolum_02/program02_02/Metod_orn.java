

public class Metod_orn
{
	public static int faktoriel(int sayi)
	{
		int snc=1;
		for (int i = sayi; i > 1; i--)
		{
		snc*=i;
		}
		return snc;
	}
	public static void faktoriel1 (int sayi)
	{
		int snc=1;
		
		for (int i = sayi; i > 1; i--)
		{
		snc*=i;
		}
		System.out.println("Geri dönüşsüz metod sonucu = " + snc);
		
		
	}	
	
	public static void main (String[] args)
	{
		
	
		System.out.println("Geri Dönüşlü metod sonucu = " +faktoriel(6));
		faktoriel1(5);
		
	}
	
}
