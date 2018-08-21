package learningjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestSumAcrossDiagonal {

	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the number of rows:");
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		System.out.println("Enter the number of columns:");
		int columns = in.nextInt();
		int matrix[][] = new int[rows][columns];
		System.out.println("Enter the data for matrix:");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				matrix[i][j] = in.nextInt();
			}
		}
		int l = columns-1;
		for(int i=0; i<=rows-2; i++)
		{
			for(int j=0; j<l; j++)
			{
				list1.add(matrix[i][j]);
				sum1 = sum1 + matrix[i][j];
			}
			l = l-1;
		}
		int m = 1;
		for(int i=rows-1; i>0 ; i--)
		{
			for(int j=m; j<columns; j++)
			{
				list2.add(matrix[i][j]);
				sum2 = sum2 + matrix[i][j];
			}
			m = m+1;
		}
		if(sum1>sum2)
		{
			System.out.println(list1);
		}
		else
			System.out.println(list2);
	}
}