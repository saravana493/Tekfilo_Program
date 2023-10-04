import java.util.Scanner;
class demo
{
	demo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String word=sc.nextLine();
		int vowel=0;
		int alpha=0;
		String str=word.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
			vowel++;
		}
		else if(str.charAt(i)>='a' && str.charAt(i)<='z')
		{
			alpha++;
		}		
		}
		System.out.println("The Vowels are "+vowel);
		System.out.println("The Alphabets are "+alpha);
	}
}
class countalphaandvowel
{
public static void main(String []args)
{
	demo n=new demo();
}
}