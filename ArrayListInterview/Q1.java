package ArrayListInterview;

import java.util.ArrayList;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
//1. How to remove duplicates from ArrayList in Java?
        ArrayList<Integer> someNumbers = new ArrayList<>();

        someNumbers.add(1);
         someNumbers.add(2);
          someNumbers.add(2);
          someNumbers.add(1);

          System.out.println(someNumbers);

          HashSet<Integer> noDublicateNumbers = new HashSet<>(someNumbers);
          someNumbers.clear();
          someNumbers.addAll(noDublicateNumbers);
          System.out.println(noDublicateNumbers);
        
    }
    
}
