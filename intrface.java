interface demo
{
public void getdata();
}

interface demo2
{
public void getdata2();
}

class demo3
{
String name;
demo3()
{
name="Saravana";
}
}

class demo4 extends demo3 implements demo,demo2
{ 
demo4()
{
this.getdata();
this.getdata2();
}
public void getdata()
{
System.out.println("Your name is "+name);
}
public void getdata2()
{
System.out.println(name+"@"+"gmail.com");
}
}
class intrface
{
public static void main(String []args)
{
demo3 o=new demo3();
demo4 o1=new demo4();

}
}