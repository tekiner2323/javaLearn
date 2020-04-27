
//Notasyon 1
class fibonacci
{
	
	
	
	public static long fibonacciHes(long sayi)
	{
		if (sayi<=0) return 0;
		else if (sayi==1) return 1;
		else return fibonacciHes(sayi-1) + fibonacciHes(sayi -2);
	
	}
	
	public static void fibonacciyaz(long sayi)
	{		
		for(long i = 0; i<=sayi; i++)
		{
			System.out.println("Fibonacci("+i+") = " + fibonacciHes(i));
		}
		
		
	}
	
	public static void fibonacciFastHes(long sayi)
	{
		
		fibonacciFastHes(sayi, 0,1,0);
	}
	
	static void fibonacciFastHes(long sayi, long onceki2, long onceki1, int konum)
	{
		long onc1=onceki1;
		long onc2=onceki2;
		int knm=konum;
		long sy=sayi;	
			
		if (sy==knm)
		{
			long snc = onceki1+onceki2;
			System.out.println("FibonacciFast("+konum+")= "+snc);
			
		}
		else if (knm==0)
		{
			
			long snc = 0;
			onc1=1;
			onc2=0;
			knm++;
			System.out.println("FibonacciFast("+konum+")= "+snc);
			fibonacciFastHes(sayi,onc2,onc1,knm);
		}
		else if (knm==1)
		{
			
			long snc = 1;
			onc1=1;
			onc2=0;
			knm++;
			System.out.println("FibonacciFast("+konum+")= "+snc);
			fibonacciFastHes(sayi,onc2,onc1,knm);
		}
		else
		{
			long snc = onc2+onc1;
			System.out.println("FibonacciFast("+konum+")= "+snc);
			onc2=onc1;
			onc1=snc;
			knm++;
			fibonacciFastHes(sayi,onc2,onc1,knm);
		}
		
	}
	
	
	
		
	public static void main (String[] args)
	{
		fibonacciyaz(45);
		fibonacciFastHes(45);
		
		
		// Bu algoritmanın bir bir hatası var. Her seferince bir önceki değeri unuttuğu için defalarca özyinelemeli bir metot ile yeniden hesaplıyor buda çok yüksek miktarda bir işlemciye yük bindiriyor. Bu algoritmayı hızlandırmak için fibonaccinin n. elemanını hesaplamak istiyorsak n-1. değerini hafızada tutarak işlemi çok daha hızlandırmak mümkün. 
		
		// fibonacciyaz ile fiboonacciFasthes'in arasında ki farkı detaylıca
	}
	
}
