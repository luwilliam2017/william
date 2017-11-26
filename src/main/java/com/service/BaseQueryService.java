package com.service;

import com.bean.Person;
import com.bean.Student;
import com.dao.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by w on 2017/11/12.
 */
@Service
public class BaseQueryService {

    @Autowired
    BaseMapper mapper;

    public Person query(String name){
        Person res = mapper.selectStateByName(name);
        return res;
    }

    public List<Person> getAllPerson(){
        List<Person> list = new ArrayList<Person>();
        list = mapper.selectAllPerson();
        return list;
    }

    public int deletePerson(int id){
        int res = mapper.deletePerson(id);
        return res;
    }

    /*public List<Student> getAllStudent(){
        List<Student> list = new ArrayList<Student>();
        list = mapper.selectAll();
        return list;
    }*/
}
