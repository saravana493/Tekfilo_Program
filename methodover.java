class demo
{
public void getdata()
{
System.out.println("Method Overloading");
}
public void getdata(int x,float y)
{
System.out.println("Value of x is "+x);
System.out.println("Value of y is "+y);
}
public void getdata(String s, int age)
{
System.out.println("Your name is "+s);
System.out.println("Your age is "+age);
}
}
class methodover
{
public static void main(String []args)
{
demo ob= new demo();
ob.getdata();
ob.getdata("Saravana",19);
ob.getdata(10,15);
}
}
