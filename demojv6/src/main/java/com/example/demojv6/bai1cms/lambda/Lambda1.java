package com.example.demojv6.bai1cms.lambda;

import com.example.demojava6.bai1cms.Staff;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda1 {

    public static void main(String[] args) {

//        demo2();
//        demo3();

        // funtionInterface
        demo4();
        demo5();

    }
    // tao 1 funtionInterface
// chi co 1 phuong thuc
    private static void demo5() {
        demo4InterFace o = (int x)->{
            System.out.println(x);
        };
        o.m1(555);
    }
    private static void demo4(){
    // tao 1 funtionInterface
        demo4InterFace o = new demo4InterFace() {
            @Override
            public void m1(int x) {
                System.out.println(x);
            }
        };
        o.m1(555);
    }

    // sap xep get luong
    private static void demo3() {
        // sap xep
        Staff nv1 = new Staff("tuấn",255);
        Staff nv2 = new Staff("Hanh",200);
        Staff nv3 = new Staff("hương",25);
        List<Staff> lst =  Arrays.asList(nv1,nv2,nv3);

        // sap xep tang
        Collections.sort(lst,(o1,o2)->{
            Double d1=o1.getSalary();
            Double d2=o2.getSalary();
            return d1.compareTo(d2);
                });
        lst.forEach(nv->{
            System.out.println(nv.getName());
            System.out.println(nv.getSalary());
        });
        System.out.println(" sx giam");

        // sap xep giam
        Collections.sort(lst,(o1,o2)->{
            Double d1=o1.getSalary();
            Double d2=o2.getSalary();
            return - d1.compareTo(d2);
        });

        lst.forEach(nv->{
            System.out.println(nv.getName());
            System.out.println(nv.getSalary());
        });
    }


    // sap xep theo ten
    private static void demo2() {
        Staff nv1 = new Staff("tuấn",255);
        Staff nv2 = new Staff("Hanh",200);
        Staff nv3 = new Staff("hương",25);
        List<Staff> lst =  Arrays.asList(nv1,nv2,nv3);

        Collections.sort(lst,(o1,o2)->o1.getName().compareTo(o2.getName()));

        lst.forEach(nv->{
            System.out.println(nv.getName());
            System.out.println(nv.getSalary());
        });
    }

    @FunctionalInterface
    // chi co 1 phuong thuc
    interface demo4InterFace{
        void m1(int x);
        default void m2(){ };
        static void m3(){}
    }
}
