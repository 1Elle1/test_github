package Exceptions;

public class Aufgabe6_4 {
	
	
	public static int CheckFileExtension(String fileName) {
		int pupil = 0;

		if(fileName.endsWith(".java")) {
			pupil ++;
		}else if(!fileName.endsWith(".java")) {
			
		}else if(fileName.isEmpty()) {
			pupil --;
		}
	}

	public static void main(String[] args) {
		

	}

}
