package com.green.refresh.group;

import com.green.refresh.group.model.GroupSelDto;
import com.green.refresh.group.model.GroupSelVo;
import com.green.refresh.user.model.UserSelDto;
import com.green.refresh.user.model.UserSelVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GroupService {
    private final GroupMapper mapper;




    public List<GroupSelVo> selGroup(int igroup) {
        GroupSelDto dto = new GroupSelDto();
        dto.setIgroup(igroup);
        return mapper.selGroup(dto);
    }

    public List<GroupSelVo> selAllGroup() {
        return mapper.selAllGroup();
    }
}
