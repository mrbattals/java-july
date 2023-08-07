package ArrayListInterview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q2 implements Comparable {
    public static void main(String[] args) {
        //2. How to reverse ArrayList in Java?


        List<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Mercedes");

        Collections.reverse(cars);
        System.out.println(cars);

        Collections.sort(cars);
        System.out.println(cars);

    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}