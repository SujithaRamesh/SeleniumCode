package learningjava;

import java.util.Scanner;

public class ReverseUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("Enter the number: ");
		int number = in.nextInt();
		String reversedStr = reverseString(str);
		System.out.println("The reversed string is: "+reversedStr);
		System.out.println("Reversed number is: ");
		reverseNumber(number);
	}
public static String reverseString(String str)
{
	if(str.isEmpty())
		return str;
	return(reverseString(str.substring(1)) + str.charAt(0));
}
public static void reverseNumber(int number)
{
	if(number<10)
		return;
	else
	{
		System.out.print(number%10);
		reverseNumber(number/10);
	}
}
}
