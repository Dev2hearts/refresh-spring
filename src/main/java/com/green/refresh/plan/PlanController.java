package com.green.refresh.plan;

import com.green.refresh.plan.model.PlanInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/refresh/plan")
@RequiredArgsConstructor
public class PlanController {
    private final PlanService service;

    @PostMapping
    public int postPlan(@RequestBody PlanInsDto dto) {
        return service.insPlan(dto);
    }
}


