package com.green.refresh.user;

import com.green.refresh.user.model.UserInsDto;
import com.green.refresh.user.model.UserSelVo;
import com.green.refresh.user.model.UserUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name ="유저 및 그룹")
@RequestMapping("/refresh/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;


    @PostMapping
    @Operation(summary = "유저 추가", description = "" +
            "nm: [10] 유저 닉네임,<br>" +
            "birth: [10] 생년월일<br>")
    public int postUser(@RequestBody UserInsDto dto) {
        return service.insUser(dto);
    }

    @GetMapping
    @Operation(summary = "유저 프로필"
            , description = "" +
            "nm: 유저 닉네임, <br>" +
            "birth: 생년월일, <br>" +
            "pic: 프로필 사진, <br>")
    public List<UserSelVo> selectUser(@RequestParam int iuser) {
        return service.selUser(iuser);
    }



    @PatchMapping
    @Operation(summary = "유저 정보 수정", description = "" +
            "nm: [10] 유저 닉네임,<br>" +
            "birth: [10] 생년월일<br>")
    public int UpdInfoUser(@RequestBody UserUpdDto dto) {
        return service.updUser(dto);
    }

    @DeleteMapping
    @Operation(summary = "유저 삭제", description = "" +
            "iuser: [-] 유저 PK값<br>" )
    public int deleteUser(@RequestParam int iuser) {
        return service.delUser(iuser);
    }
}
