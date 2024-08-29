package practice_programs_java.bin;
import java.util.Scanner;

public class PrimeNoInARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end=sc.nextInt();
		
		for(int num=start;num<=end;num++)
		{
			int fact=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					fact++;
				}
			}
		
		if(fact==2)
		{
			System.out.println(num);
		}
	   }

	}

}
