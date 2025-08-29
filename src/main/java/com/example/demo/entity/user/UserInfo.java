package com.example.demo.entity.user;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
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
