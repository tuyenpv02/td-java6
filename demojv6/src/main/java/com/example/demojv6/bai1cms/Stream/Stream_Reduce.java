package com.example.demojv6.bai1cms.Stream;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.List;

public class Stream_Reduce {

    public static void main(String[] args) {
        Staff nv1 = new Staff("nguyễn anh tuấn", 255);
        Staff nv2 = new Staff("phạm thị Hanh", 200);
        Staff nv3 = new Staff("nguyễn thị hương", 25);
        List<Staff> lst = Arrays.asList(nv1, nv2, nv3);

        // stream<T>.reduce(initial,(temp, item) -> newTemp) được sử dụng để tính giá trị tích lũy từ các phần tử trong Stream
//        demo1(lst);
        demo2(lst);
    }

    private static void demo2(List<Staff> lst) {
        // tìm nv có lương thấp nhất
        Staff result = lst.stream().reduce(lst.get(0), (min, staff) -> {
            if (staff.getSalary() > min.getSalary()) {
                return min;
            }
            return staff;
        });

        Staff result2 = lst.stream()
                .reduce(lst.get(0), (min, staff) -> min.getSalary() < staff.getSalary() ? min : staff);

        System.out.println(result.getName() + " " + result.getSalary());
    }

    private static void demo1(List<Staff> lst) {
        // tính tổng thuế thu nhập ( 10%)
        double incomeTax = lst.stream()
                .map(o1 -> o1.getSalary())
                .reduce(0.0, (tong, salary) -> tong + salary * 0.1);
        System.out.println("tổng lương " + incomeTax);
    }
}
