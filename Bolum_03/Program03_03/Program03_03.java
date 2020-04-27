

class Araba
{
	String marka;
	String model;
	String tip; //Sedan, Hatcback, SUV, 4x4
	
	double motorHacmi;
	int motorGucu;
	int motorTorku;
	
	Araba()
	{
	
	}
	Araba(String marka, String model, String tip)
	{
		this.marka=marka;
		this.model=model;
		this.tip = tip;
	}
	
	Araba(String marka, String model, String tip, double motorHacmi,	int motorGucu, int motorTorku)
	{
		this.marka=marka;
		this.model=model;
		this.tip = tip;
		this.motorHacmi=motorHacmi;
		this.motorGucu=motorGucu;
		this.motorTorku = motorTorku;
	}
	
	double hizHesapla()
	{
		return this.motorHacmi*0.01+this.motorGucu*2+this.motorTorku*0.01;
	}
	
}


public class Program03_03
{

	public static void main (String[] args)
	{
		Araba ornek1 = new Araba();
		ornek1.marka="Ford";
		ornek1.model="Ranger";
		ornek1.tip="4x4";
		ornek1.motorHacmi=3600;
		ornek1.motorGucu=120;
		ornek1.motorTorku=100;
		
		Araba ornek2 = new Araba("Nissan","Qaskai","SUV");
		ornek2.motorHacmi=2200;
		ornek2.motorGucu=95;
		ornek2.motorTorku=80;
		
		
		System.out.println(ornek1.marka + " " + ornek1.model);
		System.out.println(ornek2.marka + " " + ornek2.model);
		
		if(ornek1.hizHesapla()<ornek2.hizHesapla())
		{
			System.out.println(ornek2.marka + " " + ornek2.model + "Aracı daha hızlıdır");
		}
		else
		{
		System.out.println(ornek1.marka + " " + ornek1.model + " Aracı daha hızlıdır");
		}
		
	}
}
