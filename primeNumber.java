package practice_programs_java.bin;
import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		int fact=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				fact++;
			}
		}
		if(fact==2) {
			System.out.println(number+" is a prime number");
		}
		else {
			System.out.println(number+" is not a prime number");
		}
	

	}

}
