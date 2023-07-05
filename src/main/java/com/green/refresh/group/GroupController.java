package com.green.refresh.group;

import com.green.refresh.group.model.GroupPicDto;
import com.green.refresh.group.model.GroupSelVo;
import com.green.refresh.user.model.UserPicDto;
import com.green.refresh.user.model.UserSelVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@RestController
@Tag(name ="그룹")
@RequestMapping("/api/refresh/group")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService service;

    @GetMapping
    @Operation(summary = "그룹"
            , description = "" +
            "\"igroup\": 그룹 PK <br>")
    public List<GroupSelVo> selectGroup(@RequestParam int igroup) {
        return service.selGroup(igroup);
    }


    @GetMapping("/all")
    @Operation(summary = "그룹 리스트")
    public List<GroupSelVo> selectAllGroup() {
        return service.selAllGroup();
    }



    @PatchMapping(name="/pic", consumes={MediaType.MULTIPART_FORM_DATA_VALUE})
    @Operation(summary = "그룹 프로필 사진 추가", description = "" +
            "\"igroup\": [-] 그룹 PK값 <br>" +
            "\"pic\": [-] 사진파일<br>")
    public int patchPicGroup(@RequestPart MultipartFile pic, @RequestParam int iuser) {
        GroupPicDto dto = new GroupPicDto();
        dto.setIgroup(iuser);
        return service.updGroupPic(pic,dto);
    }


}
