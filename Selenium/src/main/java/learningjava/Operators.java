package learningjava;

public class Operators {

	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 3;
		boolean flag = true;
		System.out.println(number1++);
		System.out.println(number1);
		System.out.println(++number1);
		System.out.println(number1);
		System.out.println(number2--);
		System.out.println(number2);
		System.out.println(--number2);
		System.out.println(number2);
		System.out.println(flag);
		System.out.println(!flag);
		if(number1 == 7 && number2 == 1)
		System.out.println(flag);
		else
			System.out.println(!flag);
		if(number1 == 8 || flag)
			System.out.println(flag);
		else
			System.out.println(!flag);
	}

}
