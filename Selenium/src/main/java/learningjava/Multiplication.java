package learningjava;

public class Multiplication {

	public static void main(String[] args) {
		int number = 0, multiple=2;
		System.out.println("Multiplication Table:");
		for (int i=1; i<=10;i++)
		{
			number = i*multiple;
			System.out.println(i+ " * " +multiple+ " = " +number);
		}

	}

}
