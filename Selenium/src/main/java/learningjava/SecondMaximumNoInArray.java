package learningjava;

import java.util.Arrays;

public class SecondMaximumNoInArray 
{
	public int getSecondMaximum(int[] arr, int len)
	{
		int i,j,temp;
		for(i=0; i<len; i++)
		{
			for(j=i+1; j<len; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[len-2];
	}
	public static int getSecMax(int[] arr, int len)
	{
		Arrays.sort(arr);
		return arr[len-2];
	}
	public static void main(String[] args) 
	{
		int[] intArray = {20, 340, 21, 879, 92, 21, 474, 83647, -200};
		int[] intArr = {-500, -150, -270, -400, -1000, -67353856, -50, -10};
		int length = intArray.length;
		int length2 = intArr.length;
		SecondMaximumNoInArray max = new SecondMaximumNoInArray();
		int secMax = max.getSecondMaximum(intArray, length);
		System.out.println("Second largest value in 1st array is: "+secMax);
		System.out.println("Second largest value in 2nd array is: "+getSecMax(intArr, length2));
	}
}