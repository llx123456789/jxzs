package com.pwj.jxzs.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String username;
    private String userphone;
    private int userrole;
    private String userphoto;
    private List<Leave> leaves;
    private List<Classgh> classes;
}
