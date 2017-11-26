package com.controller;

import com.bean.Person;
import com.bean.Student;
import com.service.BaseQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by w on 2017/11/12.
 */
@RestController
public class BaseController {

    @Autowired
    BaseQueryService service;

    @RequestMapping("/com/demo")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/query/{name}")
    @ResponseBody
    public Object getData(@PathVariable("name")String name){
        return service.query(name);
    }

    @RequestMapping("/query/all")
    @ResponseBody
    public List<Person> getAllPerson(){
        return service.getAllPerson();
    }

    @RequestMapping("/query/delete/{id}")
    @ResponseBody
    public int deletePerson(@PathVariable("id")Integer id){
        return service.deletePerson(id);
    }

    /*@RequestMapping("/query/getAllStudent")
    @ResponseBody
    public List<Student> getAllStudent(){
        List<Student> list = service.getAllStudent();
        return list;
    }*/
}
