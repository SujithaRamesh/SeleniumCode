package learningjava;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		int rows, number = 1, i, j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd's triangle:");
		rows = in.nextInt();
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(number+"\t");
				number++;
			}
			System.out.println();
		}
	}
}