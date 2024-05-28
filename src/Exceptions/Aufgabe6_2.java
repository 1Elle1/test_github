package Exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Aufgabe6_2 {

	
	
	public static void main(String[] args) {
		
		final Pattern noten = Pattern.compile(
				"C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'"
				);
		
		String fileName = "NotenSchreiben.txt";
		String fertigeNoten = "";
		
		try {
			Scanner sc = new Scanner(Paths.get("Noten.txt"));
			System.out.println("M: C");
			System.out.println("L:1/4");
			System.out.println("K: C");
			while(sc.hasNext()) {
				String tmp = sc.nextLine();
				if(noten.matcher(tmp).matches())
				
				fertigeNoten += tmp + " ";
				System.out.print(tmp + " ");
			}
			sc.close();
			
			try (PrintWriter writer = new PrintWriter(fileName)) {
				writer.println("M: C");
				writer.println("L:1/4");
				writer.println("K: C");

				writer.print(fertigeNoten);
				
				System.out.println("Die Noten wurden in die Datei geschrieben.");
			} catch (IOException e) {
				System.err.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
			}
		
		}catch(IOException e){
			System.out.println("Konnte nicht eingelesen werden!");
			
		}
	}
	

}

