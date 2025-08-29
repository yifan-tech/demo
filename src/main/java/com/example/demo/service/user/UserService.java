package com.example.demo.service.user;

import com.example.demo.entity.user.UserInfo;
import com.example.demo.service.user.dto.UserInfoDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserInfo addUser(UserInfoDto userInfoDto) {
        // 数据转换操作
        UserInfo userInfo = userInfoDto.dtoToEntity();
        userInfo.initEntity();

        // todo:数据库存储操作
        userInfo.setId((long)(Math.random() * 1000));

        // 返回实体,这个实体会填充id
        return userInfo;
    }
}
