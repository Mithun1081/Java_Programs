package practice_programs_java.bin;
import java.util.*;
public class perfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		double sqrt = Math.sqrt(number);
		System.out.println(sqrt);
		
		
		if(sqrt==Math.floor(sqrt)){
			System.out.println(number+" is a perfect square");
		}
		else {
			System.out.println(number+" is a not perfect square");
		}
		
		

	}

}
