package learningjava;

public class ReverseMultiplicationTable {

	public static void main(String[] args) {
		int number = 0, multiple=2;
		System.out.println("Reverse Multiplication Table:");
		for (int i=10; i>=1; i--)
		{
			number = i*multiple;
			System.out.println(i+ " * " +multiple+ " = " +number);
		}

	}

}
