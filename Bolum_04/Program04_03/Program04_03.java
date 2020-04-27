


class Hesaplama
{
	//-----Constructor
	
	Hesaplama(double[] Tablo)
	{
		this.Tablo = new double[Tablo.length];
		this.Tablo=Tablo;
	}
	
	Hesaplama(int[] Tablo)
	{
		double[] tmp = new double[Tablo.length];
		
		for(int i = 0; i<Tablo.length; i++)
		{
			tmp[i]=Double.valueOf(Tablo[i]);
		}
		
		this.Tablo = new double[Tablo.length];
		this.Tablo=tmp;
			
	}
	
	
	//------Değişkenler
	
	double[] Tablo;
	
	double ortHes()
	{
		double toplam=0;
		for(int i = 0 ; i<this.Tablo.length;i++)
		{
			toplam+=this.Tablo[i];
		}
		
		return toplam/this.Tablo.length;
	}
	
	double[] ustYuvarla()
	{	
	
		
		double[] tmp = new double[Tablo.length];
		
		
		for(int i = 0; i<this.Tablo.length; i++)
		{
			tmp[i]=Math.ceil(this.Tablo[i]);
			
		}
		
		return tmp;
	}
	
	
	
}

class Program04_03
{
	public static void main(String[] args)
	{
		double[] notDizi={50.850,60.755,80.132,10,85,95.0,85,100.0,12.0,5.0,40.0,50.0,100,100,100,100};
		
		Hesaplama dizi = new Hesaplama(notDizi);
		
		System.out.println("Ortalama Sonucu= " + dizi.ortHes()); 
		
		double[] returnDizi = dizi.ustYuvarla();
		
		for(int i = 0; i<returnDizi.length; i++)
		{
			System.out.println("Yucarlama Sonucu= " + returnDizi[i] );
		}
		
		
		
	}
}


