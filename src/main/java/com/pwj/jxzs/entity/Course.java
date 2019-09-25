package com.pwj.jxzs.entity;

import lombok.Data;

@Data
public class Course {
    private int courseid;
    private String coursename;
    private String coursetime;
    private String coursexueqi;
    private User courseuser;
}
