package Mycaptain;
import java.util.Scanner;

//Task10 Write a Java program to find the cubes upto a given number

public class Task10 {
	
	public static void main(String[] args)
	{
		int num;
		System.out.print("Please enter the input number");
		Scanner in= new Scanner(System.in);
		num=in.nextInt();
		in.close();
		
		for(int i=1;i<=num;i++)
		{
			int cube=i*i*i;
			System.out.print("Number is: "+i+" and the cube of "+i+" is "+cube+"\n");
		}
	}
	

}
