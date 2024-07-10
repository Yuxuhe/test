package com.tommy.pojo;

import lombok.Data;

/**
 * ClassName: Order
 * PackageName: com.tommy.pojo
 * Create: 2024/6/15-15:54
 * Description:
 */
@Data
public class Order {
    private Integer orderId;
    private String orderName;
    private Integer customerId;

    /**
     * 一个订单对应一个客户信息
     */
    private Customer customer;


}
