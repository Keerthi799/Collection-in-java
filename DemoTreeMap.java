package Collection;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		
		tmap.put(11,"Developer");
		tmap.put(2,"Tester");
		tmap.put(13,"Tech Support");
		tmap.put(42,"Data Analyst");
		tmap.put(10,"Data Base Administrator");
		tmap.put(1,"System  Architect");
		tmap.put(-91,"System Operater");
		tmap.put(0,null);
        
		System.out.println(tmap);
		
		TreeMap<Double,Integer> tmap1 = new TreeMap<Double,Integer>();
		tmap1.put(32.05, 100);
		tmap1.put(56.432, 43);
		
		System.out.println(tmap1.floorKey(56.0));
		System.out.println(tmap1.ceilingKey(32.1));
		
		
	}

}
