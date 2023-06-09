package Simple;

import java.util.regex.Pattern;

public class Email2 {
	public static void main(String[] args) {
		
	
	String email="test01*gmail.com";
	
	if( isValidEmail(email)) {
		System.out.println("email is valid..");
	}
	else {
		System.out.println("email is not valid..");
	}
	
}

 public static void isValildEmail(String email) {
	 String regex="^ [A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	 
	 Pattern pattern=Pattern.compile(regex);
	 
	 boolean matcher=Pattern.matches(email, email);
 }

private static boolean isValidEmail(String email) {
	
	return Pattern.matches(email, email);

}
}
