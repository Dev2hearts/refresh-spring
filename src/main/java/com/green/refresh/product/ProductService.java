package com.green.refresh.product;

import com.green.refresh.product.model.ProductEntity;
import com.green.refresh.product.model.ProductInsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper mapper;

    public int insPdt(ProductInsDto dto) {
        ProductEntity entity = new ProductEntity();
        entity.setIplan(dto.getIplan());
        entity.setIcate(dto.getIcate());
        entity.setIunit(dto.getIunit());
        entity.setBIuser(dto.getWIuser());
        entity.setNm(dto.getNm());

        try {
            int result = mapper.insPdt(entity);
            if (result == 1){
                return entity.getIproduct();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

}