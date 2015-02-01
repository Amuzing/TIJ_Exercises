package amuzik95.vampire_numbers;

import java.util.*;

/**
 * Created by Amuzik on 31.01.2015.
 */
public class VampireNumber {
    public static boolean isVampire(int a, int b) {
        char[] ch1 = Integer.toString(a).toCharArray();
        char[] ch2 = Integer.toString(b).toCharArray();
        char[] ch3 = Integer.toString(a*b).toCharArray();
        if(!((ch1.length+ch2.length)==4 &&ch3.length==4))
            return false;
        ArrayList<Character> comps = new ArrayList<Character>();
        for(int i=0; i<2; ++i) {
            comps.add(ch1[i]);
            comps.add(ch2[i]);
        }
        ArrayList<Character> alProduct = new ArrayList<Character>();
        for(char c:ch3)
            alProduct.add(c);
        return (comps.containsAll(alProduct) && alProduct.containsAll(comps));
    }

    public static void main(String[] args) {
        SortedSet<Map.Entry<Integer,Integer>> sToPrint = new TreeSet<Map.Entry<Integer, Integer>>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getKey()*o1.getValue() - o2.getKey()*o2.getValue();
            }
        });
        Map<Integer,Integer> mTemp = new TreeMap<Integer,Integer>();
        for(int i=11; i<100; ++i)
            for(int j=11; j<100; ++j) {
                if(isVampire(i,j)) {
                    mTemp.put(i,j);
                }
            }
        sToPrint.addAll(mTemp.entrySet());
        for(Map.Entry m:sToPrint)
            System.out.println((Integer)m.getKey()*(Integer)m.getValue() + " = " + m.getKey() + "*" + m.getValue());
    }
}
