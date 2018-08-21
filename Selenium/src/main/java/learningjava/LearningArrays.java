package learningjava;

public class LearningArrays {
	public static void main(String[] args)
	{
		//single dimensioal array
		int scores[] = {10,20,30,35,45,56,67};
		System.out.println("The Scores are: ");
		/*for(int i=0; i<scores.length; i++)
		{
			System.out.println(scores[i]);
		}*/
		//Two dimensional array
		int scores2[][] = {{10,20}, {30,35}, {45,56}, {67,78}, {33,44}, {88,99}};
		System.out.println("The Scores are: ");
		/*//using 2 for loop
		for(int i=0; i<scores2.length; i++)
		{
			for(int j=0; j<=1; j++)
			{
			System.out.println(scores2[i][j]);
			}
		}*/
		/*//using single for loop
		for(int i=0; i<scores2.length; i++)
		{
			System.out.print(scores2[i][0]+" , ");
			System.out.println(scores2[i][1]);
		}*/
		//using foreach loop
		for (int score : scores)
		{
			System.out.println(score);
		}
		char grades[] = {'A','B','C'};
		for(char grade : grades)
		{
			System.out.println(grade);
		}
		System.out.println(grades.length);
		System.out.println(scores.length);
		System.out.println(scores2.length);
	}

}
