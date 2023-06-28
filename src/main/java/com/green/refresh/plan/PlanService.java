package com.green.refresh.plan;

import com.green.refresh.plan.model.PlanInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanService {
    private final PlanMapper mapper;

    public int insPlan(PlanInsDto dto) {
        return mapper.insPlan(dto);
    }
}
