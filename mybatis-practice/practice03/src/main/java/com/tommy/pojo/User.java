package com.tommy.pojo;

import lombok.Data;

/**
 * ClassName: User
 * PackageName: com.tommy
 * Create: 2024/6/14-17:12
 * Description:
 */
@Data //lombok
public class User {
    private Integer id;
    private String username;
    private String password;
}
