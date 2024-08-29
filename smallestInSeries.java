package practice_programs_java.bin;
import java.util.Scanner;

public class smallestInSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//Find and print the smallest digit in the number
		int k=num;
		int smallest=9;
		
		while(num>0) {	
			int digit =num%10;
			if(digit<smallest) {
				smallest = digit;
			}
				
			num/=10;	
		}
			System.out.println("The smallest digit in "+k+" is"+smallest+".");
		

	}

}
