

class kare_alma_nesnesi
{
	public double kare3(double sayi)		//dinamik metot
	{
		return sayi*sayi;
	}
	
	public static double kare4(double sayi)	//statik metot
	{
		return sayi*sayi;
	}
}

public class program02_03
{
	public double kare(double sayi)			//dinamik metot
	{
		return sayi*sayi;
	}
	
	public static double kare2(double sayi)	//statik metot
	{
		return sayi*sayi;
	}
	
	public static void main (String[] args)
	{
		program02_03 kareal = new program02_03();
		double snc = kareal.kare(8.4);
		
		double snc2 = kare2(8.3);
		
		kare_alma_nesnesi kareal2 = new kare_alma_nesnesi();
		double snc3 = kareal2.kare3(8.2);
		
		double snc4 = kare_alma_nesnesi.kare4(8.1);
		
		
		System.out.println("Sonuç= " + snc);
		System.out.println("Sonuç2= " + snc2);
		System.out.println("Sonuç3= " + snc3);
		System.out.println("Sonuç4= " + snc4);
	}
	
}


