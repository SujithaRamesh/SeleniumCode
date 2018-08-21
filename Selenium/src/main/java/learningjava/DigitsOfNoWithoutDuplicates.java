package learningjava;

public class DigitsOfNoWithoutDuplicates {
	public static void main(String[] args) {
	    System.out.println(hasDistinctDigits(12234));
	}

	public static boolean hasDistinctDigits(int number) {
	    boolean returner = true;
	    int count = 1;
	    int newNum = number;
	    int digit = 0;

	    while (count < numDigits(number)) {         
	        while (count < numDigits(newNum)) {
	            digit = newNum % 10;
	            newNum/=10;
	            if (digit == getDigit(newNum, count)) {
	                returner = false;
	            }
	            count++;                
	        }
	        count++;
	    }
	    return returner;
	}

	public static int numDigits(int number) {
	    int count = 0;
	    while (number != 0) {
	        number /= 10;
	        count++;
	    }
	    return count;
	}

	public static int getDigit(int number, int i) {
	    int digit = 0;
	    int count = 0;
	    int originalNum = number;

	    while (count <= i) {
	        if (count == i) {
	            digit = number % 10;
	        }
	        number /= 10;
	        count++;
	    }
	    if (i > numDigits(originalNum)) {
	        return -1;
	    } else {
	        return digit;
	    }
	}
}