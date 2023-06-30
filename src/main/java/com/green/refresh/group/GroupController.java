package com.green.refresh.group;

import com.green.refresh.group.model.GroupSelVo;
import com.green.refresh.user.model.UserSelVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Tag(name ="그룹")
@RequestMapping("/refresh/group")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService service;

    @GetMapping
    @Operation(summary = "\"그룹\""
            , description = "" +
            "\"igroup\": 그룹 PK, <br>")
    public List<GroupSelVo> selectGroup(@RequestParam int igroup) {
        return service.selGroup(igroup);
    }

    @GetMapping("/all")
    @Operation(summary = "\"그룹 리스트\"")
    public List<GroupSelVo> selectAllGroup() {
        return service.selAllGroup();
    }


}
