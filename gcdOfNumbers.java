package practice_programs_java.bin;

import java.util.Scanner;

public class gcdOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int gcd = findGCD(num1,num2);
		
		System.out.println("The GCD of "+num1+" and "+num2+" is: "+gcd);
		scanner.close();
	}
	
	public static int findGCD(int a, int b)
	{
		while((b%a)!=0) {
			int rem=b%a;
			b=a;
			a=rem;
		}
		return a;
	}
	
		
	
}