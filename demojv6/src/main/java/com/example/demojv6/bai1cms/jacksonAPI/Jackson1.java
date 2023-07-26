package com.example.demojv6.bai1cms.jacksonAPI;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Jackson1 {

//    Reading: JSON String -> Java Object
    //    readTree(source): JsonNode
    //    //    readValue(source, Class<T>): T
    //    //    Source:
    //    //    String/byte[]
    //    //    Reader/InputStream/File/URL
//    Writing: Java Object -> JSON String
    //    writeValueAsBytes(Object): byte[]
    //    writeValueAsString(Object): String
    //    writeValue(source, Object)
    //    Source
        //    Writer/OutputStream/File
    //    writerWithDefaultPrettyPrinter().writeValueAsString(Object)


    public static void main(String[] args)   {

        try {
            demo2();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    // read
    public static void demo2() throws Exception {
        String json = "C:\\Users\\TBC\\IdeaProjects\\demojava6\\src\\main\\resources\\jsonFile\\students.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode students = mapper.readTree(new File(json));

        students.iterator().forEachRemaining(student->{
            System.out.println("\n");
            System.out.println(">> name: "+ student.get("name").asText());
            System.out.println(">> mark: "+ student.get("mark").asDouble());
            System.out.println(">> Gender: "+ student.get("gender").asBoolean());
            System.out.println(">> Email: "+ student.get("contact").get("email").asText());
            // tìm đối tượng : findValue
            System.out.println(">> phone: "+ student.findValue("phone").asText());
            //đọc dữ liệu từ mảng
            student.get("subjects").iterator().forEachRemaining(o->{
                System.out.println(">> subject "+o);
            });
        });
    }

    // read
    public static void demo1() throws Exception {
        String json = "C:\\Users\\TBC\\IdeaProjects\\demojava6\\src\\main\\resources\\jsonFile\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode student = mapper.readTree(new File(json));

        System.out.println(">> name: "+ student.get("name").asText());
        System.out.println(">> mark: "+ student.get("mark").asDouble());
        System.out.println(">> Gender: "+ student.get("gender").asBoolean());
        System.out.println(">> Email: "+ student.get("contact").get("email").asText());
        // tìm đối tượng : findValue
        System.out.println(">> phone: "+ student.findValue("phone").asText());
        //đọc dữ liệu từ mảng
        student.get("subjects").iterator().forEachRemaining(o->{
            System.out.println(">> subject "+o);
        });

//        Đọc một node: JsonNode.get(key): JsonNode
//        Chuyển đổi kiểu dữ liệu thích hợp: JsonNode.asType(): Type
//        Đọc mảng: JsonNode.iterator(): Iterator<JsonNode>
    }


}
