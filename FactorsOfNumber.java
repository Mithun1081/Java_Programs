package practice_programs_java.bin;
import java.util.*;
public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("Factors of "+num+" are:");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {
				System.out.println(i);
			}
		}

	}

}
