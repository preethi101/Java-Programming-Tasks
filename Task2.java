package Mycaptain;
import java.util.Scanner;

//Task2 Find the sum of two given binary numbers

public class Task2 {

	public static void main(String[] args)
	   {
		
		long num1, num2;
		int i = 0;
		

		int[] sum = new int[10];

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first binary number ");
		num1 = in.nextLong();
		System.out.print("Enter the second binary number ");
		num2 = in.nextLong();

		in.close();
		
		int carry=0;
		
		while (num1 != 0 || num2 != 0) 
		{
			sum[i++] = (int)((num1 % 10 + num2 % 10 + carry) % 2);
			carry = (int)((num1 % 10 + num2 % 10 + carry) / 2);
			num1 /= 10;
			num2 /= 10;
		}
		
		if (carry != 0) {
			sum[i++] = carry;
		}
		--i;
		
		System.out.print("The sum of the binary numbers is ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		System.out.print("\n");  
	   }
}
