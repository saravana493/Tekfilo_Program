class demo 
{	int adhr,mob;
	demo(int adhr, int  mob)
		{
			this.adhr=adhr;
			this.mob=mob;
		}
}
class demo2
{
	int mark,age;
	String name;
	demo d;
	demo2(String name,int age,int mark,demo d)
	{
		this.mark=mark;
		this.age=age;
		this.name=name;
		this.d=d;
		System.out.println("Adhar number="+d.adhr);
		System.out.println("Mobile number="+d.mob);
		System.out.println("Student name="+name);
		System.out.println("Student age="+age);
		System.out.println("Student mark="+mark);

	}
}
class entity
{
	public static void main(String args[])
	{
		demo o=new demo(1002020022,1234567890);
		demo2 o1=new demo2("Saravana",19,450,o);
	}
}