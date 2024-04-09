package linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheesInserter {
	
	//private = Sichtbarkeit auf die eigenen Klassen beschr�nkt
	//static = unabh�ngig von einem Objekt, geh�rt zur Klasse	
	//final = Wert der Varibale bleibt nach Initialisierung unver�ndert
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Tomaten?|Zwiebeln?|Melanzani"
			);
	
	public static void insertCheesAroundVegetable(List<String> ingredients) {
		//For-Schleife mit iterator als Laufvaribale
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			//Auslesen der momentanen Zutat
			String ingredient = iterator.next();
			//�berpr�fen, ob die Zutat zu unserem Vegetable Pattern passt.
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
		}
	}
			

	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchi", "Zucchini", "Paprika", "Milch", "Zwiebeln", "Melanzani");
		insertCheesAroundVegetable(ingredients);
		System.out.println(ingredients);
		

	}

}
