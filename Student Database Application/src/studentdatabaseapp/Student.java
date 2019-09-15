package studentdatabaseapp;
import java.util.*;

public class Student
{
	private String firstName,lastName,courses,studentID;
	private int tutionBalance,gradeYear;
	private static int costOfCourse = 600,id = 1000;

	//constructor
	public Student() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student firstname");
		this.firstName= sc.nextLine();  
		System.out.println("Enter Student lastname");
		this.lastName= sc.nextLine();
		System.out.println("Enter the Student class level\n1. Freshmen\n2. Sophmore\n3. Junior\n4. Senior");
		this.gradeYear= sc.nextInt();
		
		setStudentID();
		
	}
	
	//Generate an id
	private void setStudentID()
	{
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	public void enroll()
	{
		do{
			System.out.println("Enter the course to enroll ,press 'Q' to exit");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
		
			if(!course.equals("Q"))
			{
					courses =courses + "\n " +course;
					tutionBalance = tutionBalance +costOfCourse;
			}
			else{
			break;	
			}
		 } while (1!=0);
		
	
	}
	
	public void viewBalance()
	{
		System.out.println("Your balance is: $" +tutionBalance);
	}
	
	public void payTution()
	{
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your payment :$");
		int payment = sc.nextInt();
		tutionBalance = tutionBalance-payment;
		System.out.println("Thankyou for payment of $" +payment);
		viewBalance();
	}
	
	public String toString()
	{
		return "Name: "+firstName + " " +lastName+
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" +tutionBalance;
	}
	
}
