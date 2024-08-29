package practice_programs_java.bin;

import java.util.Scanner;

public class Fresher{
	int id;
	String name;
	String degree;
	String stream;
	int yop;
	
	public void giveIntro() {
		System.out.println("ID:");
		System.out.println("Name:");
		System.out.println("Degree:");
		System.out.println("Stream:");
		System.out.println("YOP:");
	}
}

public class ThisExample {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter name:");
		String name = sc.nextLine();
		System.out.println("Please enter degree:");
		String degree = sc.nextLine();
		System.out.println("Please enter stream:");
		String stream = sc.nextLine();
		System.out.println("Please enter yop:");
		int yop = sc.nextInt();
		
		Fresher f = new Fresher(int Id,String  Name, String Degree, String Stream, int Yop);
		f.giveIntro();
				
	}

}
