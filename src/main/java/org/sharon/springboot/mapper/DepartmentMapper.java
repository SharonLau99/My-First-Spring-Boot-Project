package org.sharon.springboot.mapper;

import org.apache.ibatis.annotations.*;
import org.sharon.springboot.bean.Department;

/**
 * 这是一个操作数据库的mapper
 * @author sharon
 * @create 2020-08-14-10:32
 */
@Mapper
public interface DepartmentMapper {

    //查询部门根据id
    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    //根据id删除部门
    @Delete("delete from department where id = #{id}")
    public int deleteDeptById(Integer id);

    //插入数据
    //@Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    //更新数据
    @Update("update department set department_name = #{departmentName} where id = #{id}")
    public int updateDept(Department department);
}
