package com.tommy.mapper;

import com.tommy.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: EmployeeMapper
 * PackageName: com.tommy.mapper
 * Create: 2024/6/15-20:50
 * Description:
 */
public interface EmployeeMapper {
    /** 根据id批量查询
     *
     * @param ids
     * @return
     */
    List<Employee> queryByBatch(@Param("ids") List<Integer> ids);

    /**
     * 根据id批量删除
     * @param ids
     * @return
     */
    int deleteBatch(@Param("ids") List<Integer> ids);

    int insertBatch(@Param("employees") List<Employee> employees);

    int updateBatch(@Param("employeeList") List<Employee> employeeList);

    List<Employee> query(@Param("name") String name, @Param("salary") Double salary);

    int update(Employee employee);

    List<Employee> selectEmployeeByConditionByChoose(Employee employee);

    List<Employee> queryList();

}
