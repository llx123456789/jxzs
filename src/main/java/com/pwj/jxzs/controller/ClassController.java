package com.pwj.jxzs.controller;

import com.pwj.jxzs.entity.Classgh;
import com.pwj.jxzs.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("class")
public class ClassController {
    //test
    @Autowired
    private ClassService classService;
    @PostMapping("insert")
    public String insert(Classgh classs)
    {
        System.out.println(classs);
        classService.insert(classs);
      return null;
    }

}
