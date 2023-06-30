package com.green.refresh.user;

import com.green.refresh.user.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
    List<UserSelVo> selUser(UserSelDto dto);
    List<UserSelVo> selAllUser();
    int updUser(UserUpdDto dto);
    int delUser(UserDelDto dto);
}
