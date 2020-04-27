

class Zar
{
	
	static int zarAt()
	{
		return 1+(int)(Math.random()*6);
	}
	
	static int[] multiZarSonuc(int zarAtmaSayısı)
	{
		int sncary[] = new int[zarAtmaSayısı];
		
		for(int i=0; i<zarAtmaSayısı; i++)
		{
			sncary[i]=zarAt();
		}
		return sncary;
	}
	

}

public class Ornek04_01
{
	public static void main(String[] args)
	{
		
		int zarsnc[] = Zar.multiZarSonuc(1000);
		
		int hesaplama=0;	
		for(int i=0;i<zarsnc.length; i++)
		{
			if(zarsnc[i]==1)
			{
				hesaplama++;
			}
			
		} 
		
		System.out.println(zarsnc.length +" tane atıştan 1 gelen sayısı= " + hesaplama);
		
		double yuzde = ((double) hesaplama / (double)zarsnc.length)*100;
		
		System.out.println("yüzde " + yuzde + " olasılıkla 1 gelmiştir" );
		
		
		// 1 gelme olasılığını hesaplamak istersek zarın kac defa 1 geldiğinin sayınsını toplam zar atma sayısına bölerek elde ederiz. 
		
		
				
	}
}
