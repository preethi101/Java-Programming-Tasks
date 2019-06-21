package Mycaptain;
import java.util.Scanner;

//Task5 Write a java program to convert minutes to years and days
public class Task5 {
	public static void main(String[] args)
	{
		long minutes;
		int years,days;
		System.out.print("Please enter the number of minutes");
		Scanner in = new Scanner(System.in);
		minutes=in.nextLong();
		in.close();
		int constant=60*24*365;
		long temp_years=minutes/constant;
		long temp_days=(minutes%constant);
		
		//We divide by 60*24 to convert from minutes to days
		temp_days/=(60*24);
		
		years=(int)temp_years;
		days=(int)temp_days;
		
		System.out.print(minutes+ " is approximately "+years + " years and "+days +" days");

	}

}
