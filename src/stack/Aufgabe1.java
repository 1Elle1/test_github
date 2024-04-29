package stack;

import java.util.LinkedList;

public class Aufgabe1 {
	
	
	public static String reverseString(String input) {
        LinkedList<Character> stack = new LinkedList<>();
        for(char c : input.toCharArray()) {
        	stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()) {
        	reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
    	
    	String input = "Hello World!";
    	String output = reverseString(input);
    	System.out.println(output);
        
    }
}


