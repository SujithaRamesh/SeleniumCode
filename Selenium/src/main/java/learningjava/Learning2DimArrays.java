package learningjava;

import java.util.Scanner;

public class Learning2DimArrays {

	public static void main(String[] args) {
		int intArr[][] = {{1,2,3,4},{4,5,6,7},{7,8,9,1}};
		/*int [][]intArr = new int[3][4];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values:");
		for(int i=0; i<intArr.length; i++)
		{
			for(int j=0; j<intArr[i].length; j++)
			{
				intArr[i][j] = scan.nextInt();
			}
		}
		scan.close();*/
		for(int i=0; i<intArr.length; i++)
		{
			System.out.println("\n");
			for(int j=0; j<intArr[i].length; j++)
			{
				System.out.print(intArr[i][j]);
				System.out.print(" ");
			}
			
		}
	}
}