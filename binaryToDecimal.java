package practice_programs_java.bin;

import java.util.Scanner;

public class binaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int k=dec;
		String bin="";
		
		while(dec>0)
		{
			int rem=dec%2;
			bin=rem+bin;
			dec=dec/2;
		}
		System.out.println("The binary equivalent of "+k+" is "+bin+".");
		
		
		
		

	}

}
