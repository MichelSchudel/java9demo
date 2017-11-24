package nl.craftsmen.java9demo.streamenhancements;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> l = List.of(40,55, 30, 60, 20, 80);

        // java 8
        l.stream().skip(2).forEach(System.out::println);
        l.stream().limit(2).forEach(System.out::println);

        //java 9
        l.stream().takeWhile( i -> i > 30).forEach(System.out::println);
        l.stream().dropWhile( i -> i > 30).forEach(System.out::println);

        Stream.iterate(0, c-> c < 10, c-> c+2).forEach(System.out::println);
    }
}
