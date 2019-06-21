package Mycaptain;
import java.util.Scanner;

//Task7 to add two matrices of the same dimensions

public class Task7 {

	public static void main(String[] args)
	{
		int rows,cols;
		
		System.out.print("Please enter the number of rows in your matrix");
		Scanner in=new Scanner(System.in);
		rows=in.nextInt();
		System.out.print("Please enter the number of columns in your matrix");
		cols=in.nextInt();
		int i,j;
		
		int first[][]=new int[rows][cols];
		int second[][]=new int[rows][cols];
		
		int sum[][]=new int[rows][cols];
		System.out.print("Please enter the elements of the first matrix: ");
		
		for(i=0; i<rows; i++)
		{
			for(j=0; j<cols; j++)
			{
				first[i][j]=in.nextInt();
			}
		}
		
		System.out.print("Please enter the elements of the second matrix: ");
		for(i=0; i<rows; i++)
		{
			for(j=0; j<cols; j++)
			{
				second[i][j]=in.nextInt();
			}
		}
		in.close();
		for(i=0; i<rows; i++)
		{
			for(j=0; j<cols; j++)
			{
				sum[i][j]=first[i][j]+second[i][j];
			}
		}
		
		System.out.print("The sum of the matrices is: \n");
		
		for(i=0; i<rows; i++)
		{
			for(j=0; j<cols; j++)
			{
				
				System.out.print(sum[i][j]+"\t");
				
			}
			System.out.print("\n");
		}
	}
}
