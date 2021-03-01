package com.app;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		 TreeSet ts=new TreeSet();
           ts.add(1);
           ts.add(2);
           ts.add(3);
           ts.add(4);
           //ts.add(null);
          // ts.addAll(ts);
          // ts.add("a");            //allow only same type of data
           
           System.out.println("first :" +ts.first());
           System.out.println("last :" +ts.last());
           
          // System.out.println("pollFirst :" +ts.pollFirst());    //remove
           //System.out.println("pollLast :" +ts.pollLast());
           
          // System.out.println(ts.subSet(fromElement, toElement));
           System.out.println("subset :" +ts.subSet(1,4));      //subset[1,2,3]
           
           System.out.println("higher :" +ts.higher(3));       // higher 4
           System.out.println("higher :" +ts.higher(4));        // higher null
           System.out.println("lower :" +ts.lower(3));          //lower 2
           
           System.out.println("ceiling :" +ts.ceiling(1));
           
           System.out.println("headset :" +ts.headSet(4));   //headset :[1, 2, 3] above
           System.out.println("tailset :" +ts.tailSet(1));    //tailset :[1, 2, 3, 4]  below
           
           System.out.println(ts);

           for(Object obj : ts) {
        	 //  Integer i=(Integer) obj;
        	 
        	   System.out.println(obj);
           }
	}

}
