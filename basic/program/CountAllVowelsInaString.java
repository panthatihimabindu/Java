package basic.program;

import java.util.Scanner;

public class CountAllVowelsInaString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println(countvowels(str));
	
	}

	public static int countvowels(String str) {
		
		int vowels = 0;
		for(int i = 0; i< str.length(); i++)
		{
			
		char ch = str.charAt(i);
		if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u' || ch == 'A' ||ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U')
		vowels++;
		}
		return vowels;
	}

}
