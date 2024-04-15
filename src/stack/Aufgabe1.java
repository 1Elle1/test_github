package stack;

import java.util.Stack;

public class Aufgabe1 {
	
	
	public static String reverseString(String input) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder reversedString = new StringBuilder();
        
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "Beispiel"; 
        System.out.println("Original: " + input + " | Umgekehrt: " + reverseString(input));
    }
}


