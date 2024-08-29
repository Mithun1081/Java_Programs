package practice_programs_java.bin;
import java.util.Scanner;
public class NTermOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
			
			int sum=(num*(num+1))/2;
			System.out.println("The sum of "+num+" is "+sum);
		

	}

}
