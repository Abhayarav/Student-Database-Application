package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args)
	{
		
		
		System.out.println("Enter number of students you want to add");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for(int n=0;n < numOfStudents; n++)
		{
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
			System.out.println(students[n].toString());
		}
		
		
		
		
		
		
	}

}
