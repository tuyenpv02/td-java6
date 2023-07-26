package com.example.demojv6.bai1cms.lambda;


import com.example.demojava6.bai1cms.Staff;

import java.util.*;

public class Lambda {

    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {

        Lambda lm = new Lambda();
//        lambda1();
        lm.lambda3();

    }

    void lambda3(){
        // sap xep
        Staff nv1 = new Staff("tuấn",255);
        Staff nv2 = new Staff("Hanh",200);
        Staff nv3 = new Staff("hương",25);
        List<Staff> lst =  Arrays.asList(nv1,nv2,nv3);

//        lst.sort((o1,o2) ->{
//            String name1 = o1.getName();
//            String name2 = o2.getName();
//            return name1.compareTo(name2);
//        });
//        lst.sort((o1,o2) ->o1.getName().compareTo(o2.getName()));

        // lambda phai doi tu double -> Double
        lst.sort((o1,o2)->{
            Double d1=o1.getSalary();
            Double d2=o2.getSalary();
            return d1.compareTo(d2);
        } );

        lst.forEach(o-> System.out.println(o.getName()+" "+o.getSalary()));
    }

    public void lambda2(){
        //map
        Map<String, Staff>map = new HashMap<String,Staff>();
        map.put("nv1",new Staff("tuấn",255)) ;
        map.put("nv1",new Staff("Hanh",200)) ;
        map.put("nv1",new Staff("hương",25)) ;

        // truyen thong
//        for (Map.Entry<String, Staff> entry:map.entrySet()){
//            String key= entry.getKey();
//            Staff value = entry.getValue();
//            System.out.println(key +" - "+value.getName());
//        }

        // lambda
        map.forEach((key, value) ->{
            System.out.println(key);
            System.out.println(value);
        });
    }

    public static void lambda1(){
        Staff nv1 = new Staff("tuấn",255);
        Staff nv2 = new Staff("Hanh",200);
        Staff nv3 = new Staff("hương",25);
        List<Staff> lst =  Arrays.asList(nv1,nv2,nv3);

        lst.forEach(n ->{
            System.out.println(n.getName());
            System.out.println(n.getSalary());
        });
    }



}
