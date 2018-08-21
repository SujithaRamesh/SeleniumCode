package learningjava;

import java.util.Scanner;

public class SumOfMultipliesOf3Or5 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = 0;
		System.out.println("Multiplies of 3 or 5 less than "+number+" are: ");
		for(int i=1; i<number; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("Sum is: "+sum);
	}
}