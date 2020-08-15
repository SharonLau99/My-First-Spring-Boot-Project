package org.sharon.springboot.mapper;

import org.sharon.springboot.bean.Employee;

/**
 * @author sharon
 * @create 2020-08-14-13:08
 */
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
