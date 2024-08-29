package practice_programs_java.bin;
import java.util.Scanner;
public class UserInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your User ID(byte):");
		byte userID = sc.nextByte();
		
		System.out.println("Enter your age(short):");
		short age = sc.nextShort();
		
		System.out.println("Enter your Phone Number(int):");
		int phoneNo = sc.nextInt();
		
		System.out.println("Enter your National ID(long):");
		long nationalID = sc.nextLong();
		
		System.out.println("Enter your height in meters(float):");
		float height = sc.nextFloat();
		
		System.out.println("Enter your Weight in kg(double):");
		double weight = sc.nextDouble();
		
		sc.nextLine();
		
		
		System.out.println("Enter your Gender(char): ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("Are you married?(true/false):");
		boolean married = sc.nextBoolean();
		
		sc.nextLine();
		
		System.out.println("Enter your Name(String):");
		String name = sc.nextLine();
		
		
		
		System.out.println("User Information:");
		System.out.println("User ID:"+userID);
		System.out.println("Age:"+age);
		System.out.println("Phone Number:"+phoneNo);
		System.out.println("National ID:"+nationalID);
		System.out.println("Height:"+height);
		System.out.println("Weight:"+weight);
		System.out.println("Gender:"+gender);
		System.out.println("Married:"+married);
		System.out.println("Name:"+name);
		
		
	
		

	}

}
