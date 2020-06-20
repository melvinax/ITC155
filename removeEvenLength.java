import java.util.ArrayList;

public class removeEvenLength {
	
public static void main (String[]args) { 
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Happy");
	list.add("mad");
	list.add("Sad");
	list.add("good");
	list.add("excellent");
	list.add("greatful");
	list.add("scared");
	list.add("hurt");
	list.add("tired");
	list.add("exhausted");
	list.add("done");
	 System.out.println("list: " + list);
	 
	 for (int i = 0; i < list.size(); i++) {
		 String word = list.get(i);
		 if (word.length() % 2 == 0) {
		 list.remove(i--);
		 //}else {
		 //i++;
	 }
	 
	System.out.println("Only the even list =" + list);
	
	
}
}
}
