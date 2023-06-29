package com.green.refresh.product;

import com.green.refresh.product.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PdtService {
    private final PdtMapper mapper;

    public int insPdt(PdtInsDto dto) {

/*        PdtEntity entity = new PdtEntity();
        entity.setIplan(iplan);
        entity.setIcate(dto.getIcate());
        entity.setIunit(dto.getIunit());
        entity.setBIuser(dto.getWIuser());
        entity.setNm(dto.getNm());*/


/*        int result = mapper.insPdt(entity);
        if (result == 1){
            return entity.getIproduct();
        }*/

        return mapper.insPdt(dto);

    }

    public List<PdtSelVo> selPdt(int igroup, String createdAt) {
        PdtSelDto dto = new PdtSelDto();
        dto.setIgroup(igroup);
        dto.setCreatedAt(createdAt);
//        return mapper.selPdt(dto);
        return mapper.selPdt(dto);
    }

    public int updPdt(PdtUpdDto dto) {
/*        PdtEntity entity = new PdtEntity();
        entity.setNm(dto.getNm());
        entity.setCnt(dto.getCnt());
        entity.setIcate(dto.getIcate());
        entity.setIunit(dto.getIunit());
        entity.setIproduct(dto.getIproduct());*/
        return mapper.updPdt(dto);
    }

}