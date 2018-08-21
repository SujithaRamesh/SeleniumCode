package learningjava;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		int[] numbers = {13, 15, 67, 88, 65, 67, 13, 13, 99, 67, 65, 13, 87, 13};
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		System.out.print("Duplicate Numbers are:"+"\t");
		for(int number: numbers)
		{
			if(set1.add(number) == false)
			{
				if(set2.add(number) == true)
				{
					System.out.print(number+"\t");
				}
			}
		}
	}
}
