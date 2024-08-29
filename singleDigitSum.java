package practice_programs_java.bin;
import java.util.Scanner;
public class singleDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int k=number;
		//int result=0;
		while(number>10)
		{
			number=findSum(number);
			
		}
		System.out.println("The single-digit sum of digits of "+k+" is "+number+".");
		
		}

	public static int findSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;  //last digit
			sum=sum+rem;
			num=num/10;
			
			
		}
		return sum;
	}
}
