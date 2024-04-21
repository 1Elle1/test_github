package stack;
 
import java.util.LinkedList;
import java.util.regex.Pattern;
 
public class Aufgabe2 {
 
	private static final Pattern klammern = Pattern.compile(
			"(|)|[|]|{|}"
		);
	
	
	public static void main(String[] args) {
		
		
 
	}
	
	
	private static boolean sameNumberOfClosedBrackets(String input) {
		LinkedList<Character> brackets = new LinkedList<>();
		char bracketNow ="";
        for (int i = 0; i < input.length(); i++) {
        	if(input.matches(klammern)) {
        		brackets.push(input.charAt(i));
        		char bracketNow ="";
        	}
        	if(brackets.getLast().equals(bracketNow)) {
        		brackets.pop();
        	}
        	
        }
        
        String reversed = "";
        while (!brackets.isEmpty()) {
        	reversed += brackets.pop();
        }
		return;		
	}
	
	
	
	
	
	
	
	
	
	
 
}