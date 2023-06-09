package Simple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
	public static void main(String[] args) {
		
		
		String email2=" student01@gmail.com";
		
		
		
		if(isValidEmail(email2)) {
			System.out.println("email is valid..");
		}
		else {
			System.out.println("email is not valid..");
		}
		
	}

     public static void isValildEmail(String email2) {
    	 String regex="^ [A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    	 
    	 Pattern pattern=Pattern.compile(regex);
    	 
    	 boolean matcher=Pattern.matches(email2, email2);
     }

	private static boolean isValidEmail(String email2) {
		
		return Pattern.matches(email2, email2);
		
	}
	
}
