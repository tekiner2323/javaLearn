

class Sezar
{	
	//-----Constructor-----------------------------------
	Sezar(String mesaj)
	{
	 	this.mesaj=mesaj;
	 	System.out.println("Constructor devrede MESAJINIZ = " + mesaj + " \n \n \n");
	}
	
	//---------------------------------------------------
	
	//***************************************************
	
	//-----Değişkenler-----------------------------------
	String mesaj="";
	String sifreliMetin="";
	
	//---------------------------------------------------
	
	//***************************************************
	
	//----Metotlar
	
	String sifrele()
	{
	
		int mesajUzunluk=this.mesaj.length();
		int matrisUzunkluk=-1;
		
		
		System.out.println("Mesaj = " + mesaj);
		//System.out.println("Mesaj Uzunluğu = " + mesajUzunluk);
		
		if(mesajUzunluk<1)
		{	
			//System.out.println("MESAJ BELİRTİLMEDEN İŞLEM YAPILAMAZ");
			return "HATALI KULLANIM";
		}	
		else
		{			
			for (int i = 1; i<mesajUzunluk; i++)
			{
				if(Math.pow(i-1,2)<mesajUzunluk && Math.pow(i,2)>=mesajUzunluk)
				{
					matrisUzunkluk=i;
					//System.out.println("MATRİS Uzunluğu = " + matrisUzunkluk);
					//Matris Uzunluğu hesaplandı.
					
					char sifreMatris[][] = new char [matrisUzunkluk][matrisUzunkluk];
					int mesajImlec=0;
					for(int satir=0; satir<matrisUzunkluk;satir++)
					{
						for(int stun=0; stun<matrisUzunkluk;stun++)
						{
							if(mesajImlec<mesajUzunluk)
							{
							char mChar=mesaj.charAt(mesajImlec);
							//System.out.println("SEÇİLEN KARAKTER = " + mChar);
							sifreMatris[satir][stun]=mChar;
							mesajImlec++;
							}
							else
							{
							char mChar=' ';
							//System.out.println("SEÇİLEN KARAKTER = " + mChar);
							sifreMatris[satir][stun]=mChar;
							mesajImlec++;
							}
							
						}
					}
					
					//System.out.println("**Matrisleme İşlemi Bitti*****");
					//System.out.println("**--------------------------**");
					//System.out.println("**Metineleme işlemine Başlandı");
					
					
					for(int stun=0; stun<matrisUzunkluk;stun++)
					{
						for(int satir=0; satir<matrisUzunkluk;satir++)
						{
							
							this.sifreliMetin+=sifreMatris[satir][stun];
						}
					}
					//System.out.println("**Metineleme işlemine Bitti");
					break;
					
				}
		
			}
		}
		return this.sifreliMetin;
	}
	
	
}

class Program04_02
{
	public static void main(String[] args)
	{
		
		Sezar metin=new Sezar("Arkerler şafaktan önce 8 km doğuya, okcular mevzi başına, 13 numaralı hucum suru ile okcu atışları başlayacak.");
		
		System.out.println("\n \n \n Şifrelenmiş Metin = "+metin.sifrele());
				
		
	}
}
