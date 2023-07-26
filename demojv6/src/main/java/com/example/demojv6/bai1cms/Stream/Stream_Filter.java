package com.example.demojv6.bai1cms.Stream;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Filter {

    public static void main(String[] args) {
        Staff nv1 = new Staff("nguyễn anh tuấn", 255);
        Staff nv2 = new Staff("phạm thị Hanh", 200);
        Staff nv3 = new Staff("nguyễn thị hương", 25);
        List<Staff> lst = Arrays.asList(nv1, nv2, nv3);

        // stream<T>.filter(a -> boolean) dung de loc lay phan tu thoa man
//        demo1(lst);
        demo2(lst);
    }

    public static void demo2(List<Staff> lst) {
        // lấy nhan vien có họ nguyễn
        List<Staff> ds = lst.stream()
                .filter(o1 -> o1.getName().startsWith("nguyễn"))
                .collect(Collectors.toList());
        // Stream<T>.collect(Colletor) thực hiện việc thu thập các pt trong stream

        ds.forEach(o1 -> System.out.println(o1.getName() + " " + o1.getSalary()));
        System.out.println("/n/n");
        ds.stream().forEach(o1 -> System.out.println(o1.getName() + " " + o1.getSalary()));

    }

    public static void demo1(List<Staff> lst) {
        // hien thi nhan vien co luong duoi 100 usd
        lst.stream().filter(n1 -> n1.getSalary() < 100)
                .forEach(n2 -> System.out.println(n2.getName() + " " + n2.getSalary()));

        Stream<Staff> o = lst.stream().filter(n1 -> n1.getSalary() < 100);
        o.forEach(n2 -> System.out.println(n2.getName() + " " + n2.getSalary()));

        // collect tra ve lst
        List<Staff> lst2 = o.collect(Collectors.toList());
    }
}
