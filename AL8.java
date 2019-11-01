package arraylistprogrames;


import java.util.ArrayList;
import java.util.Iterator;


public class AL8 {
	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Iterator<Integer>t = a.iterator();
		while(t.hasNext())
		{
			int i= t.next();
			
			System.out.println(i);
		}
	}

}
