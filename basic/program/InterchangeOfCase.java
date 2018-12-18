package basic.program;

import java.util.Scanner;

public class InterchangeOfCase {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String text = sc.nextLine();
		
		char[] chars = text.toCharArray();
	    for (int i = 0; i < text.length(); i++)
	    {
	        char c = text.charAt(i);
	        if (Character.isUpperCase(c))
	        {
	            chars[i] = Character.toLowerCase(c);
	        }
	        else if (Character.isLowerCase(c))
	        {
	            chars[i] = Character.toUpperCase(c);
	        }
	    }
	    System.out.println(chars);
	}

}
