class constractover
{int z;
constractover(int x , int y)
{
z=x+y-y;
System.out.println(z);
}
constractover(float x, int y)
{
System.out.println(x/y);
}
constractover(String s)
{
System.out.println(s);
}
public static void main(String []args)
{
constractover ob= new constractover(50,6);
constractover ob1= new constractover(50.1f,6);
constractover ob2= new constractover("Saravana");
}
}