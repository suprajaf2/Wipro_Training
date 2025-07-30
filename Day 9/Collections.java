package Day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		//Collection<Integer> data = new ArrayList<Integer>();
		List<Integer> data = new ArrayList<Integer>();
		data.add(11);
		data.add(22);
		data.add(33);
		data.add(44);
		System.out.println(data.get(3));
		System.out.println(data.indexOf(44));
		for(Object i: data) {
			//int data1 = (Integer) i; // wrapper class 
			// System.out.println(data1);
			//System.out.println(i);
			

	}

}
}
