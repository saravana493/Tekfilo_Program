import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Student Fees ");
		int fees=s.nextInt();
		System.out.println("Enter the no of students in your class");
		int student=s.nextInt();
		System.out.println("Enter the no of staffs ");
		int staff=s.nextInt();
		System.out.println("Enter the no of A categery staffs ");
		int a=s.nextInt();
		System.out.println("Enter the no of B categery staffs ");
		int b=s.nextInt();
		System.out.println("Enter the no of C categery staffs ");
		int c=s.nextInt();
		int salary=(a*50000*12)+(b*35000*12)+(c*20000*12);
		int tot=(fees*student)-salary;
		System.out.println("The no of Students  "+student);
		System.out.println("The no of Staffs   "+staff);
		System.out.println("The Salary for the Staffs   "+salary);
		System.out.println("The Profit for College   "+tot);
		
	}
}
class collegeprofit
{
public static void main(String []args)
{
	demo n=new demo();
}
}