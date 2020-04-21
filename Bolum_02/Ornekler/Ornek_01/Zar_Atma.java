
//Notasyon 1
class Zar_Atma
{

	public int zarAt()
	{
		int snc=-1;
		while(true)
		{
			if(snc>0 && snc <7)
			{return snc;}
			
			else 
			{ snc=(int)(Math.random()*10.0);
			 
			}
			
		}
		
		//return 1+(int)(Math.random()*6); Bu satır hakkımda kendime soru? Math.random max 1 dönderir bunu 6 ile çarparsam sonuç 6 eder buna birde 1 eklersem sonuç 7 eder. Ama hiç bir denemede 7 gelmemiştir.
			
	}
	
	public static void main (String[] args)
	{
		Zar_Atma deneme1 = new Zar_Atma();
		Zar_Atma deneme2 = new Zar_Atma();
		int sayac=1;
		while(true)
		{	
			int zar1=deneme1.zarAt();
			int zar2=deneme2.zarAt();
			
			System.out.println("1. zar = " +zar1);
			System.out.println("2. zar = " +zar2);
			if( zar1==zar2)
			{System.out.println("Sonunda zarlar eşit geldi");
			break;
			}
			else
			{System.out.println("devamkeeee " + sayac);
			sayac++;
			}
		}
		
	}
	
}
