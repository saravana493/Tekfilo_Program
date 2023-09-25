interface demo
{
public void display1();
}
abstract class ab
{
abstract public void display();
}
class demo2 extends ab
{
String name="Saravana";
int mark=450;
demo2()
{

}
public void display()
{
System.out.println("Your name is "+name);
System.out.println("Your name is "+mark);
}
}
class demo3 extends demo2 implements demo
{
demo3()
{
this.display1();
}
public void display1()
{
System.out.println(name+"@gmail.com");
}
}
class allinterandabstr
{
public static void main(String[] args)
{
demo2 o=new demo2();
o.display();
demo3 o1=new demo3();
}
}