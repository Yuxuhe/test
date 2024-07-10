package com.tommy.mapper;

import com.tommy.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Map;


/**
 * ClassName: EmployeeMapper
 * PackageName: com.tommy.mapper
 * Create: 2024/6/12-17:44
 * Description: 123
 * @author Z
 */
public interface EmployeeMapper {
    Employee queryById(Integer id);

    String queryNameById(Integer id);

    Double querySalaryById(Integer id);

    Map<String, Object> selectEmpNameAndMaxSalary();

    int insertEmp(@Param("empName") String empName, @Param("empSalary") Double empSalary);
}
