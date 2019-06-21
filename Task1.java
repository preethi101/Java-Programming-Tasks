package Mycaptain;
import java.util.Scanner;

public class Task1 {

		
		public static void main(String[] args)
		{
			float radius;
			System.out.print("Please enter the radius of your circle");
			Scanner in=new Scanner(System.in);
			
			radius=in.nextFloat();
			in.close();
			float area,perimeter;
			area=(radius*radius*22)/7;
			perimeter=(2*22*radius)/7;
			System.out.print("The area of the circle is "+area);
			System.out.print("\nThe perimeter of the circle is "+perimeter);
		}


}
