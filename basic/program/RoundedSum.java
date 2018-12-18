package basic.program;

public class RoundedSum {
	public static void main(String[] args) {
		int a = 28, b = 32, c = 45;
		System.out.println(sumOfRoundedValues(a, b, c));
	}

	public static int sumOfRoundedValues(int n1, int n2, int n3) {

		if (n1 <= 0 || n2 <= 0 || n3 <= 0)
			return -1;

		else {
			int num1 = roundValue(n1);
			int num2 = roundValue(n2);
			int num3 = roundValue(n3);

			return num1 + num2 + num3;
		}
	}

	private static int roundValue(int num) {

		int small = (num / 10) * 10;
		int large = small + 10;

		if(num-small < large-num)
			return small;
		else
			return large;
	}
}
