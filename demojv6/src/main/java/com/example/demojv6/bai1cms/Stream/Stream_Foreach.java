package com.example.demojv6.bai1cms.Stream;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Stream_Foreach {
    public static void main(String[] args) {

        Staff nv1 = new Staff("tuấn", 255);
        Staff nv2 = new Staff("Hanh", 200);
        Staff nv3 = new Staff("hương", 25);
        List<Staff> lst = Arrays.asList(nv1, nv2, nv3);

        // tang luong 15%
        System.out.println("tang 15 % luong");
        lst.stream().forEach(staff -> staff.setSalary(staff.getSalary() * 1.15));
        lst.stream().forEach(s -> System.out.println(s.getName() + " " + s.getSalary()));

        // tang luong 15% va chuyen ten sang in hoa
        System.out.println("\n tang 15 % luong va set hoa ten");
        lst.stream().forEach(s -> {
            s.setSalary(s.getSalary() * 1.15);
            s.setName(s.getName().toUpperCase());
        });
        lst.stream().forEach(s -> System.out.println(s.getName() + " " + s.getSalary()));
    }


}
