package basic.program;

import java.util.Scanner;

public class CaseInterchange {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String text = sc.nextLine();
		String res = "";
		
		//char[] chars = text.toCharArray();
	    for (int i = 0; i < text.length(); i++)
	    {
	        char c = text.charAt(i);
	        if (Character.isUpperCase(c))
	           res = res+ Character.toLowerCase(c);
	     
	        else
	        
	            res = res + Character.toUpperCase(c);
	        
	    }
	    System.out.println(res);
	}

}
