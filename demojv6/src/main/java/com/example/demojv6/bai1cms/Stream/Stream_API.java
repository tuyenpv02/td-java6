package com.example.demojv6.bai1cms.Stream;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API {

    public static void main(String[] args) {


    }


    // tao stream
    public void taoStream() {
        Staff nv1 = new Staff("tuấn", 255);
        Staff nv2 = new Staff("Hanh", 200);
        Staff nv3 = new Staff("hương", 25);
        List<Staff> lst = Arrays.asList(nv1, nv2, nv3);

        //tao moi
        Stream<Staff> s1 = Stream.of(nv1, nv2, nv3);

        // tao tu collection
        Stream<Staff> s2 = lst.stream();

    }

    public void stream2() {
        List<Double> x = Stream.of(1, 9, 3, 7, 6, 2) // Stream<Integer>
                .filter(n -> n % 3 == 0) // Stream<Integer>
                .map(n -> Math.sqrt(n)) // Stream<Double>
                .peek(System.out::println) // Stream<Double>
                .collect(Collectors.toList()); // List<Double>
        System.out.println(x);


    }

    public void stream1() {
        double x = Stream.of(1, 9, 3, 7, 6, 2)
                .filter(n -> n % 3 == 0)
                .reduce(10, (p, c) -> p > c ? c : p);
        System.out.println(x);
    }


}
