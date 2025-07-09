package dsa.mca.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DenoDSA {
    public static void main(String[] args) {
      LinkedHashMap<Integer,String> d=new LinkedHashMap<Integer,String>();
    		  d.put(100, "Desktop");
    		  d.put(102,"ram");
    		  d.put(101,"laptop");
    		  System.out.println(d);
    		  
    		  
     ArrayList<Integer> a=new ArrayList<Integer>();
     a.add(100);
     a.add(300);
     a.add(59);
     Iterator<Integer> l=a.iterator();
     while(l.hasNext())
     {
    	 Integer i=l.next();
    	 System.out.println(i);
    	 a.add(900);
     }
    }
}
 