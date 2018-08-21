package learningjava;

import java.util.Scanner;

public class ControlFlowStatement {

	public static void main(String[] args) {
		int scores[] = {25,45,35,50,65,34,78,100,36,99};
		int cutOff = 35;
		/*for(int i=0; i<scores.length; i++)
		{
			if(scores[i]>=cutOff)
				System.out.println(scores[i]+" is a pass score");
			else
				System.out.println(scores[i]+" is a fail score");
		}*/
		Scanner scan = new Scanner(System.in);
		int dayNumber = scan.nextInt();
		scan.close();
		/*if(dayNumber == 1)
			System.out.println("Monday");
		else if(dayNumber == 2)
		System.out.println("Tuesday");
		else if(dayNumber == 3)
			System.out.println("Wednesday");
		else if(dayNumber == 4)
			System.out.println("Thursday");
		else if(dayNumber == 5)
			System.out.println("Friday");
		else if(dayNumber == 6)
			System.out.println("Saturday");
		else if(dayNumber == 7)
			System.out.println("Sunday");
		else
			System.out.println("Not a valid day");*/
		switch(dayNumber)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;	
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Not a valid day");
	}
	}
}
