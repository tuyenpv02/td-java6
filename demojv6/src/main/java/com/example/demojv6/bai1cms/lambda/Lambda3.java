package com.example.demojv6.bai1cms.lambda;

import java.util.Locale;
import java.util.stream.Stream;

public class Lambda3 {

    public static void main(String[] args) {
        Stream.of("tèo", "phèo", "kèo").forEach(s -> System.out.println(s));
        //  tương đương
        Stream.of("tèo", "phèo", "kèo").forEach(System.out::println);


        Stream.of(5, 3, 8).map(n -> Math.sqrt(n)).forEach(System.out::println);
        //  tương đương
        Stream.of(5, 3, 8).map(Math::sqrt).forEach(System.out::println);


        Stream.of("tèo", "phèo", "kèo")
                .map(s -> s.toUpperCase())
                .forEach(s2 -> System.out.println(s2));
        //  tương đương
        Stream.of("tèo", "phèo", "kèo")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
