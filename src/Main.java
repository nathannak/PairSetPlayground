import javafx.util.Pair;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Pair<Integer,Integer> pair1 = new Pair<>(100,1);
        Pair<Integer,Integer> pair2 = new Pair<>(10,2);

        Set<Pair<Integer,Integer>> set = new TreeSet<>( (a, b) -> b.getValue() - a.getValue() );

        set.add(pair1);
        set.add(pair2);

        Iterator iter = set.iterator();

        while(iter.hasNext()){

            Pair<Integer,Integer> pair = (Pair<Integer,Integer>) iter.next();
            System.out.println("key is: " + pair.getKey() + " & value is: " + pair.getValue());

        }






    }
}
