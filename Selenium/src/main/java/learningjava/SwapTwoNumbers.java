package learningjava;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{
	int a, b;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter two numbers to swap:");
	a = in.nextInt();
	b = in.nextInt();
	System.out.println("Before swapping: "+a+"\t"+b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("After swapping: "+a+"\t"+b);

	}

}
