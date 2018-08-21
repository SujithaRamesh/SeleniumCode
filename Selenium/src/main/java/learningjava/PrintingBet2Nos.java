package learningjava;

import java.util.Scanner;

public class PrintingBet2Nos {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Output:");
		for(int i=a; i<=b; i++)
		{
			if(i%3 ==0 && i%5 == 0)
			{
				System.out.print("FIZZBUZZ");
				System.out.print("\t");
			}
			else if(i%3 == 0)
			{
				System.out.print("FIZZ");
				System.out.print("\t");
			}
			else if(i%5 == 0)
			{
				System.out.print("BUZZ");
				System.out.print("\t");
			}
			else
			{
				System.out.print(i);
				System.out.print("\t");
			}
		}
	}
}
