package com.example.demojv6.bai1cms.jacksonAPI;

import com.example.demojava6.bai1cms.bean.Contact;
import com.example.demojava6.bai1cms.bean.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Jackson3_write {
    public static void main(String[] args) {
        try {
            demo1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo1() throws Exception {
        Contact contact = new Contact("eu@gmail.com", "213123131");
        List<String> subjects = Arrays.asList("web201", "com108");
        Student student = new Student("phạm tuyên", true, 8.5, contact, subjects);

        ObjectMapper mapper = new ObjectMapper();
        // write  to string
        String json = mapper.writeValueAsString(student);
        // write  to ouput
        mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, student);
        // write  to file
        mapper.writeValue(new File("D:\\jsonne\\student.json"), student);

    }
}
