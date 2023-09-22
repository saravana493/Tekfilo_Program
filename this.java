class demo
{
int age;
String name;
float mark;
demo(String name,int age,float mark)
{
this.name=name;
this.age=age;
this.mark=mark;
this.display();
}
public void display()
{
System.out.println("Your name is : "+name);

}
}
class thismethod
{
public static void main(String []args)
{
demo o= new demo();
}
}