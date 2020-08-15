package org.sharon.springboot.controller;

import org.sharon.springboot.bean.Department;
import org.sharon.springboot.bean.Employee;
import org.sharon.springboot.dao.DepartmentDao;
import org.sharon.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


/**
 * @author sharon
 * @create 2020-08-12-17:23
 */
@RestController
public class EmployeeController {
    @Autowired(required = false)
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }


//    @Autowired
//    EmployeeDao employeeDao;
//
//    @Autowired
//    DepartmentDao departmentDao;
//
//    //查询所有员工返回列表页面
//    @GetMapping("/emps")
//    public String list(Model model){
//        Collection<Employee> all = employeeDao.getAll();
//
//        model.addAttribute("emps", all);
//        //thymeleaf默认就会拼串
//        return "emp/list";
//    }
//
//    //跳转到添加页面，
//    @GetMapping("/emp")
//    public String toAddPage(Model model){
//        //在下拉选择框里显示部门列表
//        Collection<Department> departments = departmentDao.getDepartments();
//        model.addAttribute("departments", departments);
//        return "emp/add";
//    }
//
//    //添加员工
//    @PostMapping("/emp")
//    public String addPage(Employee employee){
//        employeeDao.save(employee);
//        //直接return就是拼串
//        return "redirect:/emps";
//    }
//
//    //编辑员工，得到员工id
//    @GetMapping("/emp/{id}")
//    public String toEditPage(@PathVariable Integer id, Model model){
//        //查询到员工
//        Employee employee = employeeDao.get(id);
//        model.addAttribute("emp", employee);
//
//        //在下拉选择框里显示部门列表
//        Collection<Department> departments = departmentDao.getDepartments();
//        model.addAttribute("departments", departments);
//        //回到修改页面
//        return "emp/edit";
//    }
//
//    //编辑员工
//    @PutMapping("/emp")
//    public String editEmp(Employee employee){
//        employeeDao.save(employee);
//        return "redirect:/emps";
//    }
//
//    //删除员工
//    @DeleteMapping("/emp/{id}")
//    public String editEmp(@PathVariable Integer id){
//        employeeDao.delete(id);
//        return "redirect:/emps";
//    }
}
