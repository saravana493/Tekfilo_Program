import packs.demo_pack;
class packclass extends demo_pack
{String tname;
int tage;
	packclass(String name,int age,int mark,String tname,int tage)
		{
			super(name,age,mark);
			this.tname=tname;
			this.tage=tage;
		}
	public void display1()
		{
			System.out.println("Teacher name="+tname);
			System.out.println("Teacher age="+tage);
		}

}
class demopack
{
	public static void main(String []args)
		{
			packclass o= new packclass("Saravana",19,490,"Sathish sivam",45);
			o.display();
			o.display1();
		}
}