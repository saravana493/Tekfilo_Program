class demo
{
demo(int x,int y)
{
System.out.println(x*y);
}
}
class demo2 extends demo
{
demo2(int x,int y)
{
super(20,2);
System.out.println(x/y);
}
}
class superclass
{
public static void main(String []args)
{
demo2 ob= new demo2(10,2);

}
}