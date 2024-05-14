package StringStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe1PasswortÜberprüfen {
	
	public static boolean isGoodPassword(String input) {
		
		Pattern inputPattern = Pattern.compile("[!#%&*+=?/@-]");
		Pattern p1 = Pattern.compile("[a-z]");
		Pattern p2 = Pattern.compile("[A-Z]");
		
			Matcher operatorMatcher = inputPattern.matcher(input);
			Matcher lc = p1.matcher(input);
			Matcher bc = p2.matcher(input);
			if(operatorMatcher.find() && input.length() > 8 && lc.find() && bc.find()) {
				return true;
			}else {
				return false;
			}
		
	}

	public static void main(String[] args) {
		
		
		if(isGoodPassword("!#gffsAdgsdfgfsdg") == true) {
			System.out.println("Starkes Passwort!");
		}else {
			System.out.println("Schwaches Passwort!");
		}

	}

}
