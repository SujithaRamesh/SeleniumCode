package learningjava;

import java.util.Scanner;

public class FindingLeapYear {

	public static void main(String[] args) {
		int year;
		boolean leap = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year to find whether it is a leap year or not: ");
		year = in.nextInt();
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
					leap = true;
				else
					leap = false;
			}
			else
				leap = true;
		}
		else
			leap = false;
		if(leap == true)
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+ " is not a leap year");
	}
}
