package com.example.demo.entity.user;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserInfo {
    private Long id;
    private String name;
    private String password;
    private String email;
    private String sex;
    private String birthday;

    private Long isDelete;
    private Long create_time;
    private String create_user;
    private Long update_time;
    private String udpate_user;

    public void initEntity() {
        this.id = 0l;
        this.isDelete = 0l;
    }

}
