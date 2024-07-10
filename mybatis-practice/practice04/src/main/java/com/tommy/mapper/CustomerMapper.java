package com.tommy.mapper;
import com.tommy.pojo.Customer;
import com.tommy.pojo.Order;

import java.util.List;

/**
 * ClassName: CustomerMapper
 * PackageName: com.tommy.mapper
 * Create: 2024/6/15-16:43
 * Description:
 */
public interface CustomerMapper {
    List<Customer> queryList();
}
