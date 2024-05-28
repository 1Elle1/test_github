package Exceptions;

public class Aufgabe6_4 {

	public static int CheckFileExtension(String fileName) {

		if(fileName.endsWith(".java")) {
			return 1;
		}else if(fileName.isEmpty()) {
			throw new IllegalInputtype();
		}
		return 0;
		
			
	}

	public static void main(String[] args) {

		String datei = "";
		try {
			System.out.println(CheckFileExtension(datei));
		}catch(IllegalInputtype e){
			System.out.println("Falsche datei endung. \n -1");
		}
		
	}

}
