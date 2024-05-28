package Exceptions;

import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class CurrentDateInFile {

	public static void main(String[] args) {
		
		String fileName = "current_date.txt";
		
		 
		

		try (PrintWriter writer = new PrintWriter(fileName)) {

			writer.println(LocalDateTime.now());

			System.out.println("Das aktuelle Datum wurde in die Datei geschrieben.");
		} catch (IOException e) {
			System.err.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
		}
	}

}
