package learningjava;

import java.util.Scanner;

public class PossibleCombOf3DigitNo {

	public static void main(String[] args) {
		System.out.println("Enter a 3 digit number:");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] a = s.toCharArray(); 
		System.out.println("Possible combinations of the number are:");
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=0;j<a.length;j++)
			{ 
				for(int k=0;k<a.length;k++)
				{
					if(i!=j && j!=k && k!=i)
					{
						System.out.print(a[i]); 
						System.out.print(a[j]); 
						System.out.print(a[k]);
						System.out.print("\n"); 
					}
				}
			}
		}
	}
}