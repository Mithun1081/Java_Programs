package practice_programs_java.bin;

import java.util.Scanner;

public class print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the name of subject 1:");
		String sub1 = sc.nextLine();
		System.out.println("Please enter the marks of "+sub1+" : ");
		int marks1= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please enter the name of subject 2:");
		String sub2 = sc.nextLine();
		System.out.println("Please enter the marks of "+sub2+" : ");
		int marks2= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please enter the name of subject 3:");
		String sub3 = sc.nextLine();
		System.out.println("Please enter the marks of "+sub3+" : ");
		int marks3= sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Subject 1:"+sub1);
		System.out.println(sub1+" marks = "+marks1);
		
		System.out.println("Subject 2:"+sub2);
		System.out.println(sub2+" marks = "+marks2);
		
		System.out.println("Subject 3:"+sub3);
		System.out.println(sub3+" marks = "+marks3);
		
		

	}

}

