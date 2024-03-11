package Array;

public class Matrix {
	
	int [][] photo = new int [255][255];
	
	public static  int[][] magnify(int[][] array, int factor) {
		int z = 0;
		int s = 0;
		for(int i = 0; i < array.length; i++) {
			System.out.println("A");
			z++;
			for(int j = 0; j < array[0].length; j++) {
				System.out.print("B");
			s++;
			}
		}
		z *= 2;
		s *= 2;
		int [][] newMatrix = new int [z][s];
		return newMatrix;
		
		
	}

	public static void main(String[] args) {
		int [][] test = new int [10][10];
		
		System.out.println(magnify(test, 1));

	}

}
