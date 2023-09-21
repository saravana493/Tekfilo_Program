class inheritances
{int z;
public void demo(int x, int y)
{
z=x+y;
System.out.println(z);
}
}
class inheritances2 extends inheritances
{
public void demo2()
{
System.out.println("This is demo2 class");
}
public static void main(String []args)
{
inheritances2 ob=new inheritances2();
ob.demo(5,2);
ob.demo2();
}
}