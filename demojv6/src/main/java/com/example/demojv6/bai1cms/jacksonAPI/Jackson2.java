package com.example.demojv6.bai1cms.jacksonAPI;

import com.example.demojava6.bai1cms.bean.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class Jackson2 {
    public static void main(String[] args) {
        try {
            demo2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // doc mang json
    public static void demo2() throws Exception {
        String json = "C:\\Users\\TBC\\IdeaProjects\\demojava6\\src\\main\\resources\\jsonFile\\students.json";
        TypeReference<List<Student>> type = new TypeReference<List<Student>>() {
        };
        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = mapper.readValue(new File(json), type);

        students.forEach(student -> {
            System.out.println("\n");
            System.out.println(">> name: " + student.getName());
            System.out.println(">> mark: " + student.getMark());
            System.out.println(">> Gender: " + student.getGender());
            System.out.println(">> Email: " + student.getContact().getEmail());
            System.out.println(">> phone: " + student.getContact().getPhone());
            List<String> ds = student.getSubjects();
            ds.forEach(System.out::println);
        });
    }

    // doc json
    public static void demo1() throws Exception {
        String json = "C:\\Users\\TBC\\IdeaProjects\\demojava6\\src\\main\\resources\\jsonFile\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(new File(json), Student.class);

        System.out.println("\n");
        System.out.println(">> name: " + student.getName());
        System.out.println(">> mark: " + student.getMark());
        System.out.println(">> Gender: " + student.getGender());
        System.out.println(">> Email: " + student.getContact().getEmail());
        System.out.println(">> phone: " + student.getContact().getPhone());
        List<String> ds = student.getSubjects();
        ds.forEach(System.out::println);
    }
}
