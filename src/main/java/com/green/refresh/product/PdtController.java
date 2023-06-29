package com.green.refresh.product;

import com.green.refresh.product.model.PdtInsDto;
import com.green.refresh.product.model.PdtSelVo;
import com.green.refresh.product.model.PdtUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Tag(name="장보기 일정관리",description = "item")
@RequestMapping("/refresh")
@RequiredArgsConstructor
public class PdtController {
    private final PdtService service;

    @PostMapping("pdt")
    @Operation(summary = "아이템 추가"
            , description = "" +
            "\"iplan\": [-] 그룹PK,<br>" +
            "\"icate\": [-] 카테고리,<br>" +
            "\"iunit\": [1] 단위,<br>" +
            "\"nm\": [20] 제품명,<br>" +
            "\"cnt\": [-] 수량,<br>" +
            "\"w_iuser\": [1] 작성자 - 유저 PK<br>")
    public int insPdt(@RequestBody PdtInsDto dto) {
        return service.insPdt(dto);
    }

    @GetMapping("pdt")
    @Operation(summary = "아이템 리스트"
            , description = "" +
            "\"igroup\": [-] 그룹PK,<br>" +
            "\"createdAt\": [8] 일정 날짜<br>")
    public List<PdtSelVo> selPdt(@RequestParam int igroup, @RequestParam int createdAt) {
        return service.selPdt(igroup, createdAt);
    }

    @PatchMapping("pdt")
    @Operation(summary = "아이템 수정"
            , description = "" +
            "\"iplan\": [-] 그룹 PK,<br>" +
            "\"iproduct\": [-] 아이템 PK,<br>" +
            "\"icate\": [-] 카테고리,<br>" +
            "\"iunit\": [1] 단위,<br>" +
            "\"nm\": [20] 제품명,<br>" +
            "\"cnt\": [-] 수량<br>")
    public int patchPdt(@RequestBody PdtUpdDto dto) {
        return service.updPdt(dto);
    }
}
