package basic.program;

public class VowelConsonant {
	public static void main(String[] args) {
		String str = "education 0987";
		int vowelCount = 0, consCount = 0, count = 0;
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (Character.isDigit(c))
				count++;
			else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowelCount++;
			else if (c != ' ')
				consCount++;
			result += ++c;
		}
		System.out.println("digits:" + count);
		System.out.println("vowels:" + vowelCount);
		System.out.println("consonants:" + consCount);
		System.out.println("Result: " + result);
	}
}
