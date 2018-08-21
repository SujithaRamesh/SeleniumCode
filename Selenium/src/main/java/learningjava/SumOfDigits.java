package learningjava;

public class SumOfDigits {

	public static void main(String[] args) {
		int inputNumber = 432;
		int sumOfDigits = 0;
		int number = inputNumber;
		int quotient, reminder;
		while(inputNumber!=0)
		{
			quotient = inputNumber/10;
			reminder = inputNumber%10;
			sumOfDigits = sumOfDigits + reminder;
			inputNumber = quotient;
		}
System.out.println("Sum of Digits in " + number + " is " + sumOfDigits);
 	}

}
