package learningjava;

public class LearningTwoDimensionalArray {

	public static void main(String[] args) {
		String nameBlood[][] = {{"Sujitha", "O+ve"}, {"Ramesh", "O+ve"}, {"Thigalvan", "O+ve"}, {"Sindhuja", "B+ve"}};
		System.out.println("Using single for loop:");
		for(int i=0; i<nameBlood.length; i++)
		{
			System.out.println(nameBlood[i][0]+" , "+nameBlood[i][1]);
		}
		System.out.println("Using nested for loop:");
		for(int i=0; i<nameBlood.length; i++)
		{
			for(int j=0; j<=1; j++)
			{
				System.out.print(nameBlood[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Using nested foreach loop:");
		for(String[] nameBloodValue : nameBlood)
		{
		for(String nameBloodVal : nameBloodValue)
		{
			System.out.print(nameBloodVal+" ");
		}
		System.out.print("\n");
		}
	}

}
