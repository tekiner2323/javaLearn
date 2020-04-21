import java.io.*;

public class TemelYapilar3
{
	public static void main (String[] args)
	{
		long sistemZamani=System.currentTimeMillis(); //sistemin saatini milisaniye olarak aldık.
		long süre=sistemZamani+30*1000; //30 saniyeyi milisaniyeye çevirip sisteme ekledik.
		
		while (sistemZamani<=süre)
		{
			sistemZamani=System.currentTimeMillis();
			System.out.println("Arabayı süremeye devam et kalan zaman= " + (süre-sistemZamani)/1000 + " Saniye");
		}
		
		
		System.out.println("Arabadan inme zamanı");
		
	}

}


/* Javada bu iş için özel yazılmış TimerTask Metoduna bakabilirsiniz. Metotları işlemeidğimiz onunla yapmak istemedim.
link ölmez ise 
https://www.kodlamamerkezi.com/java/java-timer-zamanlayici-kullanimi/


