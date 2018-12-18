package basic.program;

public class RangeWithStep {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 30;
        int step = 3;
        System.out.println(getNumbersInRange(n1, n2, step)); 
    }
	public static String getNumbersInRange(int num1, int num2, int step) {
		if(num1 < 0 || num2 < 0)
			return "-1";
		if(num1 == num2)
			return "-2";
		if(num1 > num2)
			return "-3";
		String s = "";
		for(int i= num1; num1 <= num2; i++ )
		{
			
			num1 = num1 + step;
			if(num1 < num2)
			s = s + num1 + " ";
		}
		
	   return s.trim();
	}
}