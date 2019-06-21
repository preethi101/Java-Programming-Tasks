package Mycaptain;
import java.util.Scanner;

//Task6 To read an integer and determine whether its positive, negative or 0
public class Task6 {
	
	public static void main(String[] args)
	{
		int num;
		System.out.print("Please enter an integer");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		in.close();
		if(num<0)
		{
			System.out.print(num+" is a negative integer");
		}
		else if(num==0)
		{
			System.out.print(num+" is zero");
		}
		else
		{
			System.out.print(num+" is a positive integer");
		}
	}

}
