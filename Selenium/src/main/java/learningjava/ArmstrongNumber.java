package learningjava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int i, number, remainder, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the limit to print Armstrong numbers:");
		int limit = in.nextInt();
		in.close();
		System.out.println("Armstrong numbers from 100 to "+limit+" are:");
		for(i=100; i<=limit;i++)
		{
			number = i;
			while (number>0)
			{
				remainder = number%10;
				sum = sum + (remainder*remainder*remainder);
				number = number/10;
			}
			if(sum == i)
				System.out.print(i+"\t");
			sum = 0;
		}
	}
}
