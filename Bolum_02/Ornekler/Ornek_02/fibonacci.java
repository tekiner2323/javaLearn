
//Notasyon 1
class fibonacci
{
	static int fibonacci_1_onc=0;
	static int fibonacci_2_onc=1;
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
		
	public static void main (String[] args)
	{
		fibonacciyaz(55);
		
		
		// Bu algoritmanın bir bir hatası var. Her seferince bir önceki değeri unuttuğu için defalarca özyinelemeli bir metot ile yeniden hesaplıyor buda çok yüksek miktarda bir işlemciye yük bindiriyor. Bu algoritmayı hızlandırmak için fibonaccinin n. elemanını hesaplamak istiyorsak n-1. değerini hafızada tutarak işlemi çok daha hızlandırmak mümkün. 
	}
	
}
