package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.ShoegameApplicationTests;
import com.brightworks.sg.ims.dto.BrandDTO;
import com.brightworks.sg.ims.dto.FootWearDTO;
import com.brightworks.sg.ims.dto.VariantDTO;
import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.entities.model.FootWear;
import com.brightworks.sg.ims.entities.model.Variant;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.junit.Assert.assertEquals;

/**
 * No Need to write test for brand.
 * Since this already performs it within
 */
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShoegameApplicationTests.class)
public class OrikaBeanMapperTest {

    @Autowired
    private OrikaBeanMapper mapper;

    private FootWear footWearModel;

    private FootWearDTO footWearDTO;

    private VariantDTO variantDTO;

    private Variant variantModel;


    @Test
    public void footWearModelToFootWearDTO() {
        FootWearDTO footWearDTO = mapper.map(this.footWearModel,FootWearDTO.class);
        assertEquals(footWearDTO.getId(),this.footWearModel.getId());
        assertEquals(footWearDTO.getName(),this.footWearModel.getName());
        assertEquals(footWearDTO.getBrand().getName(),this.footWearModel.getBrand().getName());
        assertEquals(footWearDTO.getBrand().getId(),this.footWearModel.getBrand().getId());
    }

    @Test
    public void footWearDTOToFootWearModel() {
        FootWear footWearModel = mapper.map(this.footWearDTO,FootWear.class);
        assertEquals(footWearModel.getId(),this.footWearDTO.getId());
        assertEquals(footWearModel.getName(),this.footWearDTO.getName());
        assertEquals(footWearModel.getBrand().getName(),this.footWearDTO.getBrand().getName());
        assertEquals(footWearModel.getBrand().getId(),this.footWearDTO.getBrand().getId());
    }

    @Before
    public void buildFootWearModel(){
        Brand brand = new Brand();
        brand.setName("Nike");
        brand.setId(1L);

        FootWear footWear = new FootWear();
        footWear.setName("Air Huarache");
        footWear.setId(2L);
        footWear.setBrand(brand);
        this.footWearModel = footWear;
    }


    @Before
    public void buildFootWearDTO(){
        BrandDTO brand = new BrandDTO();
        brand.setName("Nike");
        brand.setId(1L);

        FootWearDTO footWear = new FootWearDTO();
        footWear.setName("Air Huarache");
        footWear.setId(2L);
        footWear.setBrand(brand);
        this.footWearDTO = footWear;
    }
}
