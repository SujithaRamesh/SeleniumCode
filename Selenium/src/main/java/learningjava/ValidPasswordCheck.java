package learningjava;

import java.util.Scanner;

public class ValidPasswordCheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a valid password:");
		String password = in.nextLine();
		if(isValid(password))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static boolean isValid(String password)
	{
		if(password.length()<10)
			return false;
		else
		{
			char c;
			int charCount = 0;
			int numCount = 0;
			int uppercaseCount = 0;
			for(int i=0; i<password.length()-1; i++)
			{
				c = password.charAt(i);
				if(Character.isLetterOrDigit(c))
				{
					if(Character.isLetter(c))
						charCount++;
					if(Character.isDigit(c))
						numCount++;
					if(Character.isUpperCase(c))
						uppercaseCount++;
				}
				if(charCount>=2 && numCount>=2 && uppercaseCount>0)
					return true;
			}
		}
		return false;
	}
}
