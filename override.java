class demo
{
public void getdata(int x ,int y)
{
System.out.println(x*y);
}
}
class demo2 extends demo
{
@Override
public void getdata(int x,int y)
{
System.out.println(x+y);
}
}
class override
{
public static void main(String args[])
{
demo2 obj=new demo2();
obj.getdata(5,10);
demo obj1=new demo();
obj1.getdata(10,5);
}
}