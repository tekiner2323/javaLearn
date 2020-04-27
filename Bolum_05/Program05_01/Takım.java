public abstract class Takım
{
	String teknikDirektor;
	int oyuncuSayisi=0;
	String[] oyuncuIsim;
	
	private int sayac=0;
	private boolean arrDurum=false;
	
	
	public abstract void setTeknikDirektor(String isim);
	public abstract void setTeknikDirektor(int oyuncuSayisi);
	
	public void setOyuncuIsim(String Isim)
	{
		addArrIsim(Isim);
	}
	
	private void addArrIsim(String Isim)
	{	
		if(arrDurum==false)
		{
			if (oyuncuSayisi==0)
			{
				System.out.println("Oyuncu Sayısını güncelleyiniz");
			}
			else
			{
				oyuncuIsim=new String[oyuncuSayisi];
				oyuncuIsim[sayac]=Isim;
				sayac++;
				arrDurum=true;
				System.out.println("Oyuncu İsmi Eklendi");
			}
		}
		else
		{
			oyuncuIsim[sayac]=Isim;
			sayac++;
			System.out.println("Oyuncu İsmi Eklendi");
		}
	}
	


}
