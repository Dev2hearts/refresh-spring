package com.green.refresh.plan;

import com.green.refresh.plan.model.PlanInsDto;
import com.green.refresh.plan.model.PlanUpdDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/refresh/plan")
@RequiredArgsConstructor
public class PlanController {
    private final PlanService service;

    @Bean
    public OpenAPI OpenAPI() {
        final Info info = new Info()
                .version("v1.0.0")
                .title("re:fresh")
                .description("FRIST PROJECT");
        return new OpenAPI().info(info);
    }

    @PostMapping
    @Operation(summary = "일정등록", description = "{</br>" +
            "  \"igroup\": PK값,</br>" +
            "  \"iuser\": PK값,</br>" +
            "  \"title\": \"일정 제목 입력\"</br>" +
            "}")
    public int postPlan(@RequestBody PlanInsDto dto) {
        return service.insPlan(dto);
    }

    @PutMapping("/{iplan}")
    @Operation(summary = "일정수정", description = "{ </br>" +
            "  \"iplan\": 수정할 PK값, </br>" +
            "  \"title\": \"제목 수정할 내용 입력\" </br>" +
            "}")
    public int putPlan(@RequestBody PlanUpdDto dto) {
        return service.updPlan(dto);
    }

    @DeleteMapping("/{iplan}")
    @Operation(summary = "일정삭제", description = "{</br>" +
            "  \"iplan\": 삭제할 PK값 </br>" +
            "}")
    public int delPlan(@RequestParam int iplan) {
        return service.delPlan(iplan);
    }
}