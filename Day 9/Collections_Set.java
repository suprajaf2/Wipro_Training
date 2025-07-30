package Day9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_Set {

	public static void main(String[] args) {
		Set setdata = new HashSet();
        setdata.add(56);
        setdata.add("Hello");
        setdata.add(51);
        setdata.add(16);
        setdata.add(86);
        System.out.println(setdata);
        Iterator iterator= setdata.iterator();
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());        }
	}

}
