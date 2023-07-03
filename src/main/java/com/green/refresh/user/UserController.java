package com.green.refresh.user;

import com.green.refresh.user.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@Tag(name ="유저")
@RequestMapping("/api/refresh/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;


    @PostMapping
    @Operation(summary = "유저 추가", description = "" +
            "\"nm\": [10] 유저 닉네임,<br>" +
            "\"birth\": [10] 생년월일<br>")
    public int postUser(@RequestBody UserInsDto dto) {
        return service.insUser(dto);
    }

    @GetMapping
    @Operation(summary = "유저 프로필 선택"
            , description = "" +
            "\"iuser\": 유저 PK값 <br>")
    public List<UserProfileSelVo> selectUserProfile(@RequestParam int iuser) {
        return service.selUserProfile(iuser);
    }


    @GetMapping("/all/{igroup}")
    @Operation(summary = "전체 유저 프로필")
    public List<UserProfileSelVo> selectAllUser() {
        return service.selAllUser();
    }

    @GetMapping("/all")
    @Operation(summary = "전체 유저 프로필 (igroup값 없음)")
    public List<UserProfileEGSelVo> selectAllUserEG() {
        return service.selAllUserEG();
    }

    @GetMapping("/login")
    @Operation(summary = "유저 선택"
            , description = "" +
            "\"iuser\": 유저 PK값 <br>")
    public List<UserSelVo> selectUser(@RequestParam int iuser) {
        return service.selUser(iuser);
    }


    @PatchMapping
    @Operation(summary = "유저 정보 수정", description = "" +
            "\"nm\": [10] 유저 닉네임,<br>" +
            "\"birth\": [10] 생년월일<br>")
    public int UpdInfoUser(@RequestBody UserUpdDto dto) {
        return service.updUser(dto);
    }


    @DeleteMapping
    @Operation(summary = "유저 삭제", description = "" +
            "\"iuser\": [-] 유저 PK값<br>" )
    public int deleteUser(@RequestParam int iuser) {
        return service.delUser(iuser);
    }
}
