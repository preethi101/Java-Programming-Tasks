package Mycaptain;
import java.util.Scanner;

//Task3 Display the product of the digits of a given integer

public class Task3 {
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter a number");
		
		int mynum;
		mynum=in.nextInt();
		int no_digits = 0;
		in.close();
		int temp_mynum=mynum;
        while(temp_mynum != 0)
        {
            
            temp_mynum /= 10;
            ++no_digits;
        }
        
        int div=10;
        int temp_sum=0;
        int answer=1;
        
        for(int i=0; i<no_digits; i++)
        {
        	int dig;
        	dig=(mynum%div)-temp_sum;
        	temp_sum=mynum%div;
        	answer*=(dig*10)/div;
        	
        	div*=10;
        }
        System.out.print("The product of the digits is: "+answer+"\n");
	}

}
