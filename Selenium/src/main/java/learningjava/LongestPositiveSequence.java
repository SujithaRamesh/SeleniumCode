package learningjava;

public class LongestPositiveSequence 
{
	public static void main(String args[])
	{
		int numberArray[] = {-1, 2, -3, -4, 5, 6, 7, -8, 9, 10};
		int startIndex=0;
		int endIndex=0;
		int validSequenceSize=0;
		int validSequenceStartIndex=0;
		for(int index=0; index<numberArray.length; index++)
		{
			if(numberArray[index]>0 && startIndex==0)
			{
				endIndex=endIndex+1;
			}
			if(numberArray[index]<0 || numberArray.length-1==index )
			{
				if(startIndex!=endIndex)
				{
					endIndex=index;
					int difference=endIndex-startIndex;
					if(difference>=validSequenceSize && difference!=0)
					{
						validSequenceSize=difference;
						if(numberArray[numberArray.length-1]>0 && numberArray.length-1==index)
						{
							validSequenceSize=validSequenceSize+1;
						}
						validSequenceStartIndex=startIndex;
					}
				}
				if(endIndex!=numberArray.length-1 && numberArray[index]<0 )
				{
					startIndex=endIndex+1;
				}

			}
		}
		System.out.println("Length is : "+validSequenceSize);
		System.out.println("Longest Positive Sequence is: ");
		if(validSequenceSize>0)
		{
			for (int index=validSequenceStartIndex; index<validSequenceStartIndex+validSequenceSize;index++)
			{
				System.out.print(numberArray[index]);
				System.out.print("\t");
			}
		}
	}
}