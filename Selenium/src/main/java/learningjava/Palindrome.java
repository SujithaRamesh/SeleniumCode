package learningjava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		scan.close();
		int originalNumber = inputNumber;

		// Initialize reverseNumber = 0
		int reverseNumber = 0;
		int number, reminder;

		// Get each digit using while loop and reverse it.
		while(inputNumber!=0)
		{
			number = inputNumber/10;
			reminder = inputNumber%10;
			reverseNumber = (reverseNumber*10) + reminder;
			inputNumber = number;
		}

		// Compare original number and reversed number using if else condition.
		if(originalNumber == reverseNumber)
		{
			System.out.println("Given number "+originalNumber+" is a palindrome");
		}
		else
			System.out.println("Given number "+originalNumber+" is not a palindrome");
	}
}
