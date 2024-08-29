package practice_programs_java.bin;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Enter city");
		String city=sc.next();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);

	}

}
