package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.entities.model.FootWear;

/**
 * Created by Dell on 29/10/2016.
 */
public class OrikaBeanMapperTestUtils {

    public static FootWear footWearWithBrand() {
        Brand brand = new Brand();
        brand.setName("Nike");
        brand.setId(1L);

        FootWear footWear = new FootWear();
        footWear.setName("Air Huarache");
        footWear.setId(2L);
        footWear.setBrand(brand);
        return footWear;
    }
}
