package com.green.refresh.user;

import com.green.refresh.user.model.UserInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
}
