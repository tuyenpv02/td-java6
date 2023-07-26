package com.example.demojv6.bai1cms.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private String name;
    private Boolean gender;
    private Double mark =0.0;
    private Contact contact;
    private List<String> subjects;
}
