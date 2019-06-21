package Mycaptain;
import java.util.Scanner;

//Task9 Write a java method to find the smallest of 3 integers

public class Task9 {
	
	public static void myFunction()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter the three integers");
		int num1,num2,num3;
		
		num1=in.nextInt();
		num2=in.nextInt();
		num3=in.nextInt();
		
		in.close();
		int min=num1;
		
		if(num2<min)
		{
			min=num2;
		}
		
		if(num3<min)
		{
			min=num3;
		}
		
		System.out.print("\nThe smallest integer is "+min);
	}

	public static void main(String[] args)
	{
		myFunction();
	}
}
