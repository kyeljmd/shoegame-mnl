package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.dto.BrandDTO;
import com.brightworks.sg.ims.dto.FootWearDTO;
import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.entities.model.FootWear;
import com.brightworks.sg.ims.entities.model.Image;
import com.brightworks.sg.ims.entities.model.Price;
import com.brightworks.sg.ims.entities.model.Variant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 29/10/2016.
 */
public class OrikaBeanMapperTestUtils {

    public static Variant variantModelThatIsDefault(){
        Variant variant = new Variant();
        variant.setDefaultVariant(true);
        variant.setProduct(footWearModelWithBrand());
        variant.setColorWay("Fair Green");
        variant.setPrice(priceModelwithSalePrice());
        variant.setId(1L);
        variant.setQuantity(2);
        variant.setSize("6.5");
        variant.setSKU("SKUNUMBER");
        variant.setAssets(assets());
        return variant;
    }

    public static List<Image> assets(){
        String[] source = {"Source 1","Source 2"};
        List<Image> images = new ArrayList<>();
        Long idCounter = 1L;
        for(String s: source) {
            Image image = new Image();
            image.setId(idCounter);
            image.setSource(s);
            images.add(image);
            idCounter+=1L;
        }
        return images;
    }

    public static Price priceModelwithSalePrice() {
        Price price = new Price();
        price.setRegularPrice(455.5);
        price.setSalePrice(455.5);
        return price;
    }

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
