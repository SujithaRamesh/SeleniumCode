package learningjava;

import java.util.Scanner;

public class ReplaceSpacesInAString
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replaceAll("( )+", " ");
		System.out.println("Output string is: "+str);
	}
}