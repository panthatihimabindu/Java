package basic.program;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = sc.nextLine();
		System.out.println(isPalindrome(input));

	}

	public static boolean isPalindrome(String input) {
		
		if(input.equals(reverse(input)))
			return true;
		else
			return false;
	}

	public static String reverse(String input) {
		
		String reverse = "";
	
		for(int j =input.length()-1; j>=0; j--)
			
			reverse = reverse + input.charAt(j);
		
		return reverse;
	}

}
