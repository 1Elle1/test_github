package arrayList;

import java.util.ArrayList;
import java.util.List;

public class VerlusteManipulieren {
	
	public static void trimNonGrowingNumbers(List<Double> numbers){
		
        double vorherigeNummer = numbers.get(0);
        
        for(int i = 1; i < numbers.size(); i++) {
            double aktuelleNummer = numbers.get(i);
            if(aktuelleNummer < vorherigeNummer) {
                numbers.remove(i);
                i--;
            } else {
                vorherigeNummer = aktuelleNummer;
            }
        }
    }

	public static void main(String[] args) {
		List<Double>numbers = new ArrayList<Double>();
		numbers.add(1.0);
		numbers.add(2.0);
		numbers.add(3.0);
		numbers.add(4.0);
		numbers.add(5.0);
		numbers.add(4.0);
		numbers.add(3.0);
		numbers.add(1.0);
		
		
		System.out.println("Vor dem Trimmen: " + numbers);
        trimNonGrowingNumbers(numbers);
        System.out.println("Nach dem Trimmen: " + numbers);
		
		

	}

}
