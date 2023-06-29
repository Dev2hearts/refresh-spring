package com.green.refresh.user;

import com.green.refresh.user.model.UserDelDto;
import com.green.refresh.user.model.UserInsDto;
import com.green.refresh.user.model.UserUpdDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper mapper;

    @Autowired
    public UserService(UserMapper mapper) {
        this.mapper = mapper;
    }

    public int insUser(UserInsDto dto) {
        char gender = Character.toUpperCase(dto.getGender());
        if(!(gender == 'M' || gender =='F')) {
            return -1;
        }
        dto.setGender(gender);
        return mapper.insUser(dto);
    }


    public int updUser(UserUpdDto dto) {
        return mapper.updUser(dto);
    }

    public int delUser(int iuser) {
        UserDelDto dto = new UserDelDto();
        dto.setIuser(iuser);

        return mapper.delUser(dto);
    }
}
