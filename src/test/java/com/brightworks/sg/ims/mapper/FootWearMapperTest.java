package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.ShoegameApplicationTests;
import com.brightworks.sg.ims.dto.BrandDTO;
import com.brightworks.sg.ims.dto.FootWearDTO;
import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.entities.model.FootWear;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.junit.Assert.assertEquals;

@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShoegameApplicationTests.class)
public class FootWearMapperTest {

    @Autowired
    private OrikaBeanMapper mapper;

    private FootWear model;

    private FootWearDTO dto;

    @Test
    public void footWearModelToFootWearDTO() {
        FootWearDTO footWearDTO = mapper.map(this.model,FootWearDTO.class);
        assertEquals(footWearDTO.getId(),this.model.getId());
        assertEquals(footWearDTO.getName(),this.model.getName());
        assertEquals(footWearDTO.getBrand().getName(),this.model.getBrand().getName());
        assertEquals(footWearDTO.getBrand().getId(),this.model.getBrand().getId());
    }

    @Test
    public void footWearDTOToFootWearModel() {
        FootWear footWearModel = mapper.map(this.dto,FootWear.class);
        assertEquals(footWearModel.getId(),this.dto.getId());
        assertEquals(footWearModel.getName(),this.dto.getName());
        assertEquals(footWearModel.getBrand().getName(),this.dto.getBrand().getName());
        assertEquals(footWearModel.getBrand().getId(),this.dto.getBrand().getId());
    }


    @Before
    public void buildModel(){
        Brand brand = new Brand();
        brand.setName("Nike");
        brand.setId(1L);

        FootWear footWear = new FootWear();
        footWear.setName("Air Huarache");
        footWear.setId(2L);
        footWear.setBrand(brand);
        this.model = footWear;
    }


    @Before
    public void buildDTO(){
        BrandDTO brand = new BrandDTO();
        brand.setName("Nike");
        brand.setId(1L);

        FootWearDTO footWear = new FootWearDTO();
        footWear.setName("Air Huarache");
        footWear.setId(2L);
        footWear.setBrand(brand);
        this.dto = footWear;
    }
}
