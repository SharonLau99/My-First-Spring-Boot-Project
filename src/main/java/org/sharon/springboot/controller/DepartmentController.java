package org.sharon.springboot.controller;

import org.sharon.springboot.bean.Department;
import org.sharon.springboot.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sharon
 * @create 2020-08-14-11:02
 */
@RestController
public class DepartmentController {

    @Autowired(required = false)
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDeptById(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }
}
