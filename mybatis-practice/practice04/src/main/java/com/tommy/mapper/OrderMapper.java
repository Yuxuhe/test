package com.tommy.mapper;

import com.tommy.pojo.Order;

/**
 * ClassName: OrderMapper
 * PackageName: com.tommy.mapper
 * Create: 2024/6/15-15:58
 * Description:
 */
public interface OrderMapper {
    Order queryOrderById(Integer id);
}
