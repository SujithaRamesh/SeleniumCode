package learningjava;

import java.util.Scanner;

public class LargestNumber {
	static int getLessThanN(int number, int digit)
	{
		char c = Integer.toString(digit).charAt(0);
		for(int i=number; i>0; --i)
		{
			if(Integer.toString(i).indexOf(c)== -1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println("Enter the digit:");
		int digit = in.nextInt();
		System.out.println(getLessThanN(number, digit));
	}
}