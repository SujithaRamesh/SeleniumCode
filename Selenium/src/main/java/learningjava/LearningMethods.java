package learningjava;

public class LearningMethods {

	public static void main(String[] args) {
		int sum = add(13,15);
		System.out.println(sum);
		int minus = sub(10,5);
		System.out.println(minus);
		int multiply = mul(10,10);
		System.out.println(multiply);
		int quotient = div(10,2);
		System.out.println(quotient);

	}

	public static int add(int number1, int number2)
	{
		return(number1 + number2);
	}
	public static int sub(int number1, int number2)
	{
		return(number1 - number2);
	}
	public static int mul(int number1, int number2)
	{
		return(number1 * number2);
	}
	public static int div(int number1, int number2)
	{
		return(number1 / number2);
	}
}
