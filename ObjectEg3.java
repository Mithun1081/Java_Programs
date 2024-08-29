package practice_programs_java.bin;

class Person1{
int id;
String name;
String department;
int yearsOfExperience;

public void work()
{
	System.out.println("Person1 is working");
}
public void attendMeeting()
{
	System.out.println("Person1 is attending the meeting");
}
}

class Person2{
int id;
String name;
String department;
int yearsOfExperience;

public void work()
{
	System.out.println("Person2 is working");
}
public void attendMeeting()
{
	System.out.println("Person2 is attending the meeting");
}
}


public class ObjectEg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 pt =new Person1();
		pt.id=101;
		pt.name="Ramesh";
		pt.department="development";
		pt.yearsOfExperience=5;
		System.out.println("Details of person1:");
		System.out.println("id= "+pt.id);
		System.out.println("Name= "+pt.name);
		System.out.println("Department= "+pt.department);
		System.out.println("YearsOfExperience= "+pt.yearsOfExperience);
		pt.work();
		pt.attendMeeting();
		
		
		
		Person2 pr =new Person2();
		pr.id=102;
		pr.name="Suresh";
		pr.department="Testing";
		pr.yearsOfExperience=6;
		System.out.println("Details of person2:");
		System.out.println("id= "+pr.id);
		System.out.println("Name= "+pr.name);
		System.out.println("Department= "+pr.department);
		System.out.println("YearsOfExperience= "+pr.yearsOfExperience);
		pr.work();
		pr.attendMeeting();



		

		

	}

}
