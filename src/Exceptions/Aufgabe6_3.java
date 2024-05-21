package Exceptions;

public class Aufgabe6_3 {

	public static double divide(int x, int y) throws ArithmeticException {
		return x/y;
	}

	
	public static void main(String[] args) {
		
		try {
			System.out.println(divide(4,1));
		}catch(ArithmeticException lokal){
			System.out.println("Die Gesammtzahl der möglichen Punkte darf nicht 0 sein");
		}
		
		
	}

}
