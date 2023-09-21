class parameter
{
public void para(int x, double y)
{
System.out.println(x%y);
}
parameter(String s)
{
System.out.println(s);
}
}
class parameter2
{
public static void main(String args[])
{
parameter ob= new parameter("Saravana");
ob.para(5,2.1);
}
}