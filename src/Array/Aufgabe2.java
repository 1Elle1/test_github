package Array;

public class Aufgabe2 {
	
	public static boolean isProbablyAppeoaching(String[] signs) {
		int counter = 0;
		for(int i = 1; i< signs.length; i++) {
			if(signs[i -1].equals(signs[i])) {
				counter++;
				if(counter == 4) {
					return true;
				}
			}
		}
		return false;
	}
	
	//(signs[i].equals(signs[i] +1)

	public static void main(String[] args) {
		
		String[] signs1 = {"F", "DO", "MOS","MOS","MOS", "MOS", "WES"};
		System.out.println(isProbablyAppeoaching(signs1));

	}

}
