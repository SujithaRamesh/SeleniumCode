package learningjava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int inputNumber, reminder;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		inputNumber = scan.nextInt();
		scan.close();
	for(int i=2; i<=inputNumber/2; i++)
		{
			reminder = inputNumber%i;
			System.out.println(reminder);
			if(reminder == 0)
			{
				isPrime = false;
				break;
			}
		}
		/*for(int i=2; i<inputNumber; i++)
		{
			reminder = inputNumber%i;
			System.out.println(reminder);
			if(reminder == 0)
			{
				isPrime = false;
				break;
			}
		}*/
		if(isPrime == true)
			System.out.println(inputNumber+" is a Prime Number");
		else
			System.out.println(inputNumber+" is not a Prime Number");
	}
}

