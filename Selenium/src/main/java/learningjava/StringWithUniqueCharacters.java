package learningjava;

import java.util.Scanner;

public class StringWithUniqueCharacters {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String temp = "";
		for(int i=0; i<input.length(); i++)
		{
			char current = input.charAt(i);
			if(temp.indexOf(current) == -1)
			{
				temp = temp + current;
			}
		}
		System.out.println("Unique string is:"+temp);
	}
}