class demo
{
 String s="Saravana";
 demo()
{
System.out.println(s);
}
}
class demo2 extends demo
{
demo2()
{
super();
}
}
class privt
{
public static void main(String args[])
{
demo o= new demo();
}
}