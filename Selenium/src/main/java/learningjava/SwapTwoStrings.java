package learningjava;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) 
	{
		String str1, str2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two strings to swap:");
		str1 = in.nextLine();
		str2 = in.nextLine();
		in.close();
		System.out.println("Before swapping: str1: "+str1+" and str2: "+str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("After swapping: str1: "+str1+" and str2: "+str2);
	}
}