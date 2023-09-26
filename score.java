package packs;
import java.io.*;
public class score
{public int no,run,balls,str;
public String name;

		DataInputStream o=new DataInputStream(System.in);
	public score()
		{
			try
			{
			System.out.println("Enter the batsman no ");
			no=Integer.parseInt(o.readLine());
			System.out.println("Enter the batsman name ");
			name=o.readLine();
			System.out.println("Enter the batsman run ");
			run=Integer.parseInt(o.readLine());
			System.out.println("Enter the batsman balls ");
			balls=Integer.parseInt(o.readLine());
			str=run/balls*100;
			System.out.println("Enter the batsman strike rate "+str);
	
			}
			catch(Exception s){}



			
		}
}
