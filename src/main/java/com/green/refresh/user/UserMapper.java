package com.green.refresh.user;

import com.green.refresh.user.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
    List<UserProfileSelVo> selUserProfile(UserProfileSelDto dto);
    List<UserProfileSelVo> selAllUser();
    List<UserProfileSelVo> selAllUserEG();
    List<UserSelVo> selUser(UserSelDto dto);
    int updUser(UserUpdDto dto);
    int delUser(UserDelDto dto);
}
