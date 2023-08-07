package com.example.demojv6.bai1cms.Stream;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Map {

    public static void main(String[] args) {
        Staff nv1 = new Staff("nguyễn anh tuấn", 255);
        Staff nv2 = new Staff("phạm thị Hanh", 200);
        Staff nv3 = new Staff("nguyễn thị hương", 25);
        List<Staff> lst = Arrays.asList(nv1, nv2, nv3);

        // stream<T>.map(T -> R) dung de chuyển đổi 1 ptử từ đầu vào (T) thành 1 ptử đầu ra (R)

//        demo1(lst);
        demo2(lst);
    }

    private static void demo2(List<Staff> lst) {
        // thu thập tên nv có lương dưới 100 usd
        List<String> names = lst.stream()
                .filter(n1 -> n1.getSalary() > 100)
                .map(n2 -> n2.getName())
                .collect(Collectors.toList());

        names.forEach(System.out::println);
        // tương đương dưới
        names.forEach(n -> System.out.println(n));
    }

    private static void demo1(List<Staff> lst) {
        // lấy tên nhân viên
        List<String> names = lst.stream()
                .map(n -> n.getName()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
