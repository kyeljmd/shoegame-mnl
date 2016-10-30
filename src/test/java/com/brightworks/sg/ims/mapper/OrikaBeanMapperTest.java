package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.ShoegameApplicationTests;
import com.brightworks.sg.ims.dto.FootWearDTO;
import com.brightworks.sg.ims.entities.model.FootWear;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.junit.Assert.assertEquals;
import static  com.brightworks.sg.ims.mapper.OrikaBeanMapperTestUtils.*;
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

    @Test
    public void footWearModelToFootWearDTO() {
        FootWear footWear = footWearModelWithBrand();
        FootWearDTO footWearDTO = mapper.map(footWear,FootWearDTO.class);
        assertEquals(footWearDTO.getId(),footWear.getId());
        assertEquals(footWearDTO.getName(),footWear.getName());
        assertEquals(footWearDTO.getBrand().getName(),footWear.getBrand().getName());
        assertEquals(footWearDTO.getBrand().getId(),footWear.getBrand().getId());
    }

    @Test
    public void footWearDTOToFootWearModel() {
        FootWearDTO dto = footWearDTOWithBrand();
        FootWear model = mapper.map(dto,FootWear.class);
        assertEquals(model.getId(),dto.getId());
        assertEquals(model.getName(),dto.getName());
        assertEquals(model.getBrand().getName(),dto.getBrand().getName());
        assertEquals(model.getBrand().getId(),dto.getBrand().getId());
    }
}
