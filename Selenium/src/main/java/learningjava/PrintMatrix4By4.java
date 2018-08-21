package learningjava;

import java.util.Scanner;

public class PrintMatrix4By4 {

	public static void main(String[] args) {
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

		System.out.println("The Matrix is:");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}
		int rowStart=0;
		int rowLength=matrix.length-1;
		int colStart=0;
		int colLength = matrix[0].length-1;
		while(rowStart <= rowLength && colStart <= colLength){
			for (int i = rowStart; i <= colLength; i++) {
				System.out.print(matrix[rowStart][i] + " ");
			}
			for (int j = rowStart+1; j <= rowLength; j++) {
				System.out.print(matrix[j][colLength] + " ");
			}
			if(rowStart+1 <= rowLength){
				for (int k = colLength-1; k >= colStart; k--) {
					System.out.print(matrix[rowLength][k] + " ");
				}
			}
			if(colStart+1 <= colLength){
				for (int k = rowLength-1; k > rowStart; k--) {
					System.out.print(matrix[k][colStart] + " ");
				}
			}
			rowStart++;
			rowLength--;
			colStart++;
			colLength--;
		}
	}
}
