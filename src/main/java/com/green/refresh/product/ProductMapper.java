package com.green.refresh.product;

import com.green.refresh.product.model.ProductEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    int insPdt(ProductEntity entity);
}