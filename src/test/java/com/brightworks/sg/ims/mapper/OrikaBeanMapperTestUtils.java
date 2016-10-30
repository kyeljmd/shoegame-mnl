package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.dto.BrandDTO;
import com.brightworks.sg.ims.dto.FootWearDTO;
import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.entities.model.FootWear;

/**
 * Created by Dell on 29/10/2016.
 */
public class OrikaBeanMapperTestUtils {

    public static FootWear footWearModelWithBrand() {
        Brand brand = new Brand();
        brand.setName("Nike");
        brand.setId(1L);

        FootWear footWear = new FootWear();
        footWear.setName("Air Huarache");
        footWear.setId(2L);
        footWear.setBrand(brand);
        return footWear;
    }

    public static FootWearDTO footWearDTOWithBrand() {
        BrandDTO brand = new BrandDTO();
        brand.setName("Nike");
        brand.setId(1L);

        FootWearDTO footWear = new FootWearDTO();
        footWear.setName("Air Huarache");
        footWear.setId(2L);
        footWear.setBrand(brand);
        return footWear;
    }
}
