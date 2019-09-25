package com.pwj.jxzs.service.Impl;

import com.pwj.jxzs.dao.ClassDao;
import com.pwj.jxzs.entity.Classgh;
import com.pwj.jxzs.entity.User;
import com.pwj.jxzs.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(readOnly =true)
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassDao classDao;
    @Transactional(readOnly = false)
    public void insert(Classgh classs)
    {
        Map map=new HashMap<String,Object>();
        map.put("classid",classs.getClassid());
        map.put("classname",classs.getClassname());
        map.put("classkemu",classs.getClasskemu());
        map.put("classxueqi",classs.getClassxueqi());
        map.put("classarea",classs.getClassarea());
        map.put("classschool",classs.getClassschool());
        map.put("classnumber",classs.getClassnumber());
        for(User user:classs.getUsers())
        {
            map.put("usersid",user.getId());
        }
        classDao.insert(map);
    }

}
