package basic.program;

import java.util.Scanner;

public class DigitCountsInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number: ");
		int number = sc.nextInt();
		System.out.println(noOfDigits(number));

	}

	public static int noOfDigits(int number) {
		
		int count = 0;
		int digit = 0;
		while(number != 0)
		{
			digit = number % 10;
			if(digit != 0)
				count++;
			number /= 10;
			
		}
		
		
		return count;
	}

}
