package com.green.refresh.plan;

import com.green.refresh.plan.model.PlanEntity;
import com.green.refresh.plan.model.PlanInsDto;
import com.green.refresh.plan.model.PlanUpdDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlanMapper {
    int insPlan(PlanInsDto dto);
    int updPlan(PlanUpdDto dto);
    int delPlan(PlanEntity entity);
}
