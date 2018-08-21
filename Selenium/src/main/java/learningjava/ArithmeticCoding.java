package learningjava;

import java.util.Scanner;

public class ArithmeticCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first value");
		int number1=scan.nextInt();
		System.out.println("Enter the second value");
		int number2=scan.nextInt();
		String arithOp;
		System.out.println("Enter the operation to perform - Add/Subtract/Multiply/Divide");
		arithOp = scan.next();
		int result;
		if(arithOp.equalsIgnoreCase("Add"))
		{
			result = number1 + number2;
			System.out.println("Addition of 2 numbers is:"+result);
		}
		else if(arithOp.equals("Subtract"))
		{
			result = number1 - number2;
			System.out.println("Subtraction of 2 numbers is:"+result);
		}
		else if(arithOp.equals("Multiply"))
		{
			result = number1 * number2;
			System.out.println("Multiplication of 2 numbers is:"+result);
		}
		else if(arithOp.equals("Divide"))
		{
			result = number1 / number2;
			System.out.println("Division of 2 numbers is:"+result);
		}
		else
			System.out.println("Not a valid operation");

	}
}