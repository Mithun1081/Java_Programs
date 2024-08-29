package practice_programs_java.bin;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int maxNumber=sc.nextInt();
		
		System.out.println("Fibonacci series up to "+maxNumber+":");
		
		int n1=0;
		int n2=1;
		
		
		
		while(n1 <= maxNumber)
		{
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			
			
		}
		
		
		
		


	}

}
