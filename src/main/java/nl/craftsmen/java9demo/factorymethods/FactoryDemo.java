package nl.craftsmen.java9demo.factorymethods;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryDemo {

    public static void main(String[] args) {
        List<Integer>  l = List.of(1,2,2);
        Set<Integer> s = Set.of(1,2);
        Map<Integer, String> m = Map.of(1,"a", 2, "b");
    }
}
