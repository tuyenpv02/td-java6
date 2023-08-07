package com.example.demojv6.bai1cms.Stream;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.List;

public class Stream_allMatch_anyMatch_noneMatch {

    public static void main(String[] args) {
        Staff nv1 = new Staff("nguyễn anh tuấn", 255);
        Staff nv2 = new Staff("phạm thị Hanh", 200);
        Staff nv3 = new Staff("nguyễn thị hương", 25);
        List<Staff> lst = Arrays.asList(nv1, nv2, nv3);

        // allMatch(), anyMatch(), noneMatch() đc dùng để ktra các ptử trong steam có thỏa mãn dk k
//        demo1(lst);

        // tất cả nv đều có lương dưới 50 usd
        if (lst.stream().allMatch(o -> o.getSalary() < 50)) {
            System.out.println(" tất cả dưới 50 usd");
        }

        // ít nhất 1 nv  có lương dưới 50 usd
        if (lst.stream().anyMatch(o -> o.getSalary() < 50)) {
            System.out.println(" ít nhất dưới 50 usd");
        }

        // k 1 nv nào có lương dưới 50 usd
        if (lst.stream().noneMatch(o -> o.getSalary() < 50)) {
            System.out.println(" k có nv dưới 50 usd");
        }
    }
}
