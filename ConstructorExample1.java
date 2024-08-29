package practice_programs_java.bin;

/*class Student{
	String name;
	int age;
	String grade;
	String school;
}
public class ConstructorExample1 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Elisa";
		student1.age = 15;
		student1.grade = "9th";
		student1.school="Greenwood High";
		
		System.out.println("Name : " + student1.name);
		System.out.println("Age : " + student1.age);
		System.out.println("Grade : " + student1.grade);
		System.out.println("School: " + student1.school);
		System.out.println();
		
		Student student2 = new Student();
		student2.name = "Alex";
		student2.age = 16;
		student2.grade = "10th";
		student2.school="Greenwood High";
		
		System.out.println("Name : " + student2.name);
		System.out.println("Age : " + student2.age);
		System.out.println("Grade : " + student2.grade);
		System.out.println("School: " + student2.school);
		System.out.println();
		
		Student student3 = new Student();
		student3.name = "Peter";
		student3.age = 14;
		student3.grade = "8th";
		student3.school="Greenwood High";
		
		System.out.println("Name : " + student3.name);
		System.out.println("Age : " + student3.age);
		System.out.println("Grade : " + student3.grade);
		System.out.println("School: " + student3.school);
		
		
		
	}

}*/

class Student{
	String name;
	int age;
	String grade;
	String school;
	
	public Student(String n, int a, String g, String s) {
		System.out.println("name = " + n);
		System.out.println("age = " + a);
		System.out.println("grade = " + g);
		System.out.println("school = " + s);
		System.out.println();
	}
}

public class ConstructorExample1 {
	public static void main(String[] args) {
		Student student1 = new Student("Alice", 14, "8th", "Greenwood High");
		Student student2 = new Student("Elisa", 15, "9th", "Greenwood High");
		Student student3 = new Student("Jack", 16, "10th", "Greenwood High");
		
	}
}


