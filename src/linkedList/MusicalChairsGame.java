package linkedList;

public class MusicalChairsGame {

	public static void main(String[] args) {
		
		MusicalChairs mc1  = new MusicalChairs("Leo", "Max", "Paul", "Haid");
		MusicalChairs mc2  = new MusicalChairs("Jonas", "Hund");
		
//		System.out.println(mc1);
//		System.out.println(mc2);
//		mc1.rotate(2);
//		System.out.println(mc1);
//		mc1.rotateAndRemoveLast(2);
//		System.out.println(mc1);
//		System.out.println();
		System.out.println(mc1);
		mc1.play();
		System.out.println(mc1);
		

	}

}
