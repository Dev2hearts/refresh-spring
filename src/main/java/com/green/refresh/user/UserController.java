package com.green.refresh.user;

import com.green.refresh.user.model.UserInsDto;
import com.green.refresh.user.model.UserUpdDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/refresh/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;


    @PostMapping
    @Operation(summary = "회원가입", description = "" +
            "nm: [10] 유저 닉네임,<br>" +
            "gender: [1] 성별(M: 남성, F: 여성),<br>" +
            "birth [8] 생년월일,<br>")
    public int postUser(@RequestBody UserInsDto dto) {
        return service.insUser(dto);
    }



    @PatchMapping
    public int UpdInfoUser(@RequestBody UserUpdDto dto) {
        return service.updUser(dto);
    }

    @DeleteMapping
    public int deleteUser(@RequestParam int iuser) {
        return service.delUser(iuser);
    }
}
