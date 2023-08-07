package com.example.demojv6.bai1cms.Stream;

public class demo {
    public static void main(String[] args) {
        m();

    }

    public static void m() {
        Shape s = new Shape() {
            @Override
            public void hi() {
                System.out.println("jj");
            }
        };
        s.hi();
    }
}

abstract class Shape {
    public void h() {

    }

    ;

    abstract void hi();
}
