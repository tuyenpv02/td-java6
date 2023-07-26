package com.example.demojv6.bai1cms.Stream;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.List;

public class Stream_Number {

    public static void main(String[] args) {
        Staff nv1 = new Staff("nguyễn anh tuấn", 255);
        Staff nv2 = new Staff("phạm thị Hanh", 200);
        Staff nv3 = new Staff("nguyễn thị hương", 25);
        List<Staff> lst = Arrays.asList(nv1, nv2, nv3);

        //Ngoại trừ count() thì sum(), min(), max(), average() đều được thực hiện trên các số.
        // Vì vậy cần chuyển đổi sang <Number>Stream trước khi thực hiện.
        //Stream<T>.mapToDouble(): DoubleStream
        //Stream<T>.mapToInt(): IntegerStream
        //Stream<T>.mapToLong(): LongStream

        // số ptử
        long count = lst.stream().count();
        System.out.println("count "+count);

        //tổng gtrị các ptử
        double total = lst.stream().mapToDouble(o->o.getSalary()).sum();
        System.out.println("total "+total);

        // ptử có giá trị nhỏ nhất
        List<Staff> lst2 = Arrays.asList();

        double min = lst2.stream().mapToDouble(o->o.getSalary())
                .min().orElse(0);
        // orElse() nếu có thì trả về, nếu k có thì trả về 0(Optional)
        System.out.println("min "+min);
    }


}
