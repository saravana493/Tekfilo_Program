import java.util.*;
class demo
{int tot;
	Scanner s=new Scanner(System.in);
	
	demo()
{
	System.out.println("Enter the English Mark");
	int eng=s.nextInt();
	System.out.println("Enter the Computer Mark");
	int cs=s.nextInt();
	System.out.println("Enter the Science Mark");
	int sci=s.nextInt();
	System.out.println("Enter the Maths Mark");
	int mat=s.nextInt();
	System.out.println("Enter the Tamil Mark");
	int tam=s.nextInt();
	tot=eng+sci+cs+mat+tam;
	
		if(eng<40||tam<40||mat<40||sci<40||cs<40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
		System.out.println("Your the English Mark"+eng);

		System.out.println("Your the Computer Mark"+cs);

		System.out.println("Your the Science Mark"+sci);

		System.out.println("Your the Maths Mark"+mat);

		System.out.println("Your the Tamil Mark"+tam);

		System.out.println("Your the Total Mark"+tot);
	}
}
class sub5pass
{
public static void main(String args[])
{
	demo n=new demo();
}
}