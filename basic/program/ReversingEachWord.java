package basic.program;

import java.util.Scanner;

public class ReversingEachWord {

	public static void main(String[] args) {
		String text="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text:");
		text=sc.nextLine();
		String reverse = "";
		String[] arrStr = text.split(" ");
		
		for(int i = 0; i < arrStr.length; i++)
		{
			
			String temp = arrStr[i];;
	     
			for (int j = temp.length()-1; j >= 0 ; j--)
	      
	        reverse = reverse + arrStr[i].charAt(j);
			
			reverse = reverse + " "; 
			
			
		}
	
		System.out.println(reverse);

	}

}
