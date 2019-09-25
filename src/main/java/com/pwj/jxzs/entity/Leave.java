package com.pwj.jxzs.entity;

import lombok.Data;

import java.util.List;

@Data
public class Leave {
    private int leaveid;
    private String leavetime;
    private String leavecourse;
    private int leavestate;
    private List<User> leaveuser;
}
