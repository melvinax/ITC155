import java.util.ArrayList;

public class Doublelist {

	public static void main(String[] args){
			
		//create an arraylist
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println("Words: " + names);
		
		names.add("how");
		names.add("are");
		names.add("you?");
		
		for (int i= 0; i <names.size(); i+=2) {
			names.add(i, names.get(i));
		}
			//String word = arraylist.get(2 * i);
			// arraylist.add(2 * i + 1, word);
		
		System.out.println(names.toString());
	}
}
