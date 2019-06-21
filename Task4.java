package Mycaptain;
import java.util.Scanner;

//Task 4 write a java program to convert inches to meters

public class Task4 {
	
	public static void main(String[] args) {
		
		float inches;
		float meters;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the length in inches");
		inches=in.nextFloat();
		in.close();
		meters=inches*(float)0.0254;
		System.out.print("The length in meters is"+meters);
	}

}
