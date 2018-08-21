package learningjava;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=1;
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
System.out.println("Factorial value is:"+factorial);
	}

}
