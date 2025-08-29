package com.example.demo.service.user.dto;


import com.example.demo.entity.user.UserInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class UserInfoDto {
    private Long id;
    private String name;
    private String password;
    private String email;
    private String sex;
    private String birthday;


    /**
     * dto2entity
     */
    public UserInfo dtoToEntity() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(this.id);
        userInfo.setName(this.name);
        userInfo.setPassword(this.password);
        userInfo.setEmail(this.email);
        userInfo.setSex(this.sex);
        userInfo.setBirthday(this.birthday);
        return userInfo;
    }

}
