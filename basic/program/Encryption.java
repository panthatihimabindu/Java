package basic.program;

public class Encryption {

	public static void main(String[] args) {
		String input = "xyz";
		String str = "abcdefghijklmnopqrstuvwxyz";
		String cipher = "zyxwvutsrqponmlkjihgfedcba";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int index = str.indexOf(ch);

			output += cipher.charAt(index);
		}

		System.out.println(output);

	}

}
