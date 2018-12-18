package basic.program;

import java.util.Scanner;

public class SequenceOfChars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String text = sc.nextLine();
		
		String alp = "";
		String chr = "";

		for (int i = 0; i < text.length(); i++) {
			
			char c = text.charAt(i);
			
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
				alp = alp + c;

			else

				chr = chr + c;
			
		}
		System.out.println(chr + alp);

	}

}
