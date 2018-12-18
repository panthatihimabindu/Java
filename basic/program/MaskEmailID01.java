package basic.program;

public class MaskEmailID01 {
    public static void main(String[] args) {
        String email = "phb1935@gmail.com";
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
    	int index = email.indexOf("@");
    	String endString = email.substring(index);
    	String temp = "";
    	int size = email.substring(2, index).length();
    	for(int i = 0; i < size; i++)
    		temp += "X";
		
    	 return email.substring(0, 2) + temp + endString;
    	
    }

}
