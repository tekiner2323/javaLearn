import java.util.Scanner;
import java.io.*;

public class degisken_tanimlama
{

	public final double pi = 3.1415946846;
	public static void main (String[] args)
	{
	System.out.println("Bu belgede değişken tanımlamaları için örnekler olacaktır. Dikkatlice inceleyiniz");
	
	int mInt1 = 5; //temel değişken türü 
	Integer mInt2 = new Integer(5);
	
	double mdouble=50.01;
	Double mdouble2= new Double(50.01);
	
	char mchr = 'A';
	char mchr2 = '\u2310';
	
	short msh = 125;
	//Short msh2 = new Short(12);
		
	long mlg = 123;
	Long mlg2 = new Long(123);
	
	float mflt = 789.987f;
	Float mflt2 = new Float(789.987f);
		
	boolean esitlik = (mInt1==mInt2);
	boolean esitlik2 =(mInt2.equals(mInt2));
	
	String mStr = "Bu bir metinsel değişkendir";
	
	//---------------String to int
	String mStr2="20";
	int mInt3 = Integer.parseInt(mStr2);
	
	//--------------------Integer to String in Java
	int mInt4 = 8;
	String mStr3 = Integer.toString(mInt4);
	String mStr4 = String.valueOf(mInt4);
	
	//pi değişkenini değiştiremezsin
	//pi=4;
	// "non-static variable pi cannot be referenced from a static context " Hatası alınır. 

	
	
	System.out.println("esitlik= " + (mdouble==mdouble2));
	System.out.println("esitlik2= " + esitlik2);
	
	
	//Temel aritmetik işlemler
 	double toplam, fark, carpim, bolum, modon;
 	toplam =(double)mflt+mdouble2+(double)mInt1;	
	fark =(double)mflt-mdouble2-(double)mInt1;
	carpim =(double)mflt*mdouble2*(double)mInt1;
	bolum =(double)mflt/mdouble2/(double)mInt1;
	
	System.out.println(toplam);
	System.out.println(fark);
	System.out.println(carpim);
	System.out.println(bolum);
	
	
	
	}
	
	
	
}
