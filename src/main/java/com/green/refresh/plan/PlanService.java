package com.green.refresh.plan;

import com.green.refresh.plan.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlanService {
    private final PlanMapper mapper;

    public int insPlan(PlanInsDto dto) {
        return mapper.insPlan(dto);
    }

    public List<PlanSelVo> selPlan(PlanSelDto dto) {
        return mapper.selPlan(dto);
    }

    public int updPlan(PlanUpdDto dto) {
        return mapper.updPlan(dto);
    }

    public int delPlan(int iplan) {
        PlanEntity entity = new PlanEntity();
        entity.setIplan(iplan);
        return mapper.delPlan(entity);
    }
}
