package Mycaptain;
import java.util.Scanner;


//Task8 write a Java method to count the number of vowels in a string

public class Task8 {
	
	public static void vowelCounter(String mystr)
	{
		int counter=0;
		mystr=mystr.toLowerCase();

		int len=mystr.length();
		for(int i=0; i<len;i++)
		{
			
			if(mystr.charAt(i)=='a'||mystr.charAt(i)=='e'||mystr.charAt(i)=='i'||mystr.charAt(i)=='o'||mystr.charAt(i)=='u')
			{
				counter+=1;
			}
		}
		System.out.print("The number of vowels in "+mystr+" is "+counter);
		
	}
			
		public static void main(String[] args) {
		
		String mystr;
		System.out.print("Please enter a word");
		Scanner in=new Scanner(System.in);
		mystr=in.next();
		in.close();
		
		vowelCounter(mystr);
		
	}
}
