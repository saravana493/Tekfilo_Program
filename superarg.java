class demo
{int x,y;
demo(int x , int y)
{
this.x=x;
this.y=y;
}
public void display()
{
System.out.println("This is Parent Class");
System.out.println(x);
System.out.println(y);
}
}
class demo2 extends demo
{int x,y;
demo2(int x,int y)
{
super(20,30);
super.display();
this.x=x;
this.y=y;
this.display();
}
public void display()
{
System.out.println("This is Child Class");
System.out.println(x);
System.out.println(y);
}
}
class superarg
{
public static void main(String []args)
{
demo2 ob=new demo2(10,2);
}
}