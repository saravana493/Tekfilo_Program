class demo
{int x=10,y=12;
	demo()
	{
		if(x<y)
		{
			System.out.println("x is less than y");
		}
		else if(x>y)
		{
			System.out.println("x is more than y");
		}
		else if(x==y)
		{
			System.out.println("x is equal to y");
		}
	}	
}
class iels
{
public static void main(String []args)
{
	demo n= new demo();
}
}