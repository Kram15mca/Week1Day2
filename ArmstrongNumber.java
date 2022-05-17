package week1day1assesment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 246;
		int sum = 0;
		int originalnumber = input;
		
		while (input > 0) {
			int rem = input % 10;
			sum = sum + (rem * rem * rem);
	//		sum = input + rem;
			input = input / 10;
		}
		if (originalnumber == sum) {
		
		System.out.println(sum + " This number is ArmstrongNumber");
		}
		else
		{
			System.out.println(sum + " This number is not an ArmstrongNumber");
	}
	}
	}

