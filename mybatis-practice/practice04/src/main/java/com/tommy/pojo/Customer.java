package com.tommy.pojo;

import lombok.Data;

import java.util.List;

/**
 * ClassName: Customer
 * PackageName: com.tommy.pojo
 * Create: 2024/6/15-15:55
 * Description:
 */
@Data
public class Customer {
    private Integer customerId;
    private String customerName;

    private List<Order> orders;
}
