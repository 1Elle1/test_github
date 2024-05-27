package Exceptions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Aufgabe6_2 {

	
	
	public static void main(String[] args) {
		
		final Pattern noten = Pattern.compile(
				"C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'"
				);
		
		try {
			Scanner sc = new Scanner(Paths.get("Noten.txt"));
			System.out.println("M: C");
			System.out.println("L:1/4");
			System.out.println("K: C");
			while(sc.hasNext()) {
				String tmp = sc.nextLine();
				if(noten.matcher(tmp).matches())
				
				System.out.println(tmp);
			}
			sc.close();
		}catch(IOException e){
			System.out.println("Konnte nicht eingelesen werden!");
			
		}
	}
	

}

