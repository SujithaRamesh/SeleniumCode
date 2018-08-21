package learningjava;

import java.text.DecimalFormat;

public class CharacterPercentageInString {

	public static void main(String[] args) {
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
	}
	public static void characterPercentage(String inputString)
	{
		int totalCharacters = inputString.length();
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int digitsCount = 0;
		int othersCount = 0;
		for(int i=0; i<totalCharacters; i++)
		{
			char ch = inputString.charAt(i);
			if(Character.isUpperCase(ch))
				uppercaseCount++;
			else if(Character.isLowerCase(ch))
				lowercaseCount++;
			else if(Character.isDigit(ch))
				digitsCount++;
			else
				othersCount++;
		}
		double uppercasePercentage = (uppercaseCount*100.0)/totalCharacters;
		double lowercasePercentage = (lowercaseCount*100.0)/totalCharacters;
		double digitsPercentage = (digitsCount*100.0)/totalCharacters;
		double othersPercentage = (othersCount*100.0)/totalCharacters;

		DecimalFormat formatter = new DecimalFormat("##.##");
		System.out.println("In '"+inputString+"' :");
		System.out.println("Number of uppercase letters is "+uppercaseCount+". So Percentage is "+formatter.format(uppercasePercentage)+"%");
		System.out.println("Number of lowercase letters is "+lowercaseCount+". So Percentage is "+formatter.format(lowercasePercentage)+"%");
		System.out.println("Number of digits is "+digitsCount+". So Percentage is "+formatter.format(digitsPercentage)+"%");
		System.out.println("Number of uppercase letters is "+othersCount+". So Percentage is "+formatter.format(othersPercentage)+"%");
	}
}