package DSA;

import java.util.Scanner;

public class CodeConverters {

	public static void main(String[] args) {
		//CodeConverters c=new CodeConverters();
		Scanner s=new Scanner(System.in);
		int a=63,b=1111101;
		decToBin(a);
		binToDec(b);

	}
	static void decToBin(int n)
	{
		int bi=0;
		while(n>0){bi=bi*10+n%2;n/=2;}
		System.out.println("DEC to Bin is :"+bi);
	}
	static void binToDec(int n)
	{
		int dec=0,i=0;
		while (n>0){dec+=n%10*Math.pow(2, i);n/=10;i++; }

		System.out.println("Bin To DEC is :"+dec);
	}

}
