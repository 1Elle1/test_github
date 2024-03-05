package arrayList;
 
import java.util.ArrayList;
import java.util.List;
 
public class KommentareFiltern {
 
	public static void main(String[] args) {
		List<String>LogBook = new ArrayList<String>();
		LogBook.add("A1");
		LogBook.add("A2");
		LogBook.add("A3");
		LogBook.add("A4");
		LogBook.add("B1");
		LogBook.add("B2");
		LogBook.add("B3");
		LogBook.add("B4");
		LogBook.add("C1");
		LogBook.add("C2");
		LogBook.add("C3");
		LogBook.add("C4");
 
		
		reduceToComments(LogBook);
	}

	public static void reduceToComments(List<String>lines) {
		for(int i = 0; i < lines.size(); i++) {
			lines.remove(i);
			lines.remove(i);
			lines.remove(i);
			System.out.println(lines.get(i));
		}
	}
}