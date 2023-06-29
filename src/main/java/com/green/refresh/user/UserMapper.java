package com.green.refresh.user;

import com.green.refresh.user.model.UserDelDto;
import com.green.refresh.user.model.UserInsDto;
import com.green.refresh.user.model.UserUpdDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
    int updUser(UserUpdDto dto);
    int delUser(UserDelDto dto);
}
