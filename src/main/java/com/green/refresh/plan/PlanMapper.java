package com.green.refresh.plan;

import com.green.refresh.plan.model.PlanInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlanMapper {
    int insPlan(PlanInsDto dto);
}
