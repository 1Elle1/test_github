package Array;

public class Aufgabe1 {
	
	
	
	public static int count5PercentJumps(int [] gains) {
		int sprung = 0;
		for(int i = 1; i < gains.length; i++) {
			if(gains[i] > gains[i -1] * 1.05) {
				sprung ++;
			}
		}
		return sprung;
	}
	

	public static void main(String[] args) {
		int [] dailyGains = {1000, 2000, 500, 9000, 9010};
		System.out.println(count5PercentJumps(dailyGains));

	}

}
