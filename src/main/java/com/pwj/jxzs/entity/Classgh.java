package com.pwj.jxzs.entity;

import lombok.Data;

import java.util.List;

@Data
public class Classgh {
    private int classid;
    private String classname;
    private String classkemu;
    private String classxueqi;
    private String classarea;
    private String classschool;
    private int classnumber;
    private List<User> users;
}
