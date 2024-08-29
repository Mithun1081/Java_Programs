package practice_programs_java.bin;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = false;
		if(n<=1) {
			System.out.println(n+" is not a prime number");
			
		}
		
			for(int i=2;i<=(n/2);i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
		}if(isPrime==true) {
			System.out.println(n+" is a prime number");
			
		}
		else {
			System.out.println(n+" is a not a prime number");
	
		}		

	}


