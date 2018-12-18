package basic.program;

public class MaskEmail {
	public static void main(String args[])
			{
				int space = 0;
				String temp = "", mask = "";
				String email = "phb1935@gmail.com";
				
				space = email.indexOf('@');
				temp = email.substring(2, space);
				
				System.out.println(temp);
				
				for(int i=0; i < temp.length(); i++)
					mask += "X";
				
				System.out.println(email.substring(0,2) + mask + email.substring(space));
			}

}
