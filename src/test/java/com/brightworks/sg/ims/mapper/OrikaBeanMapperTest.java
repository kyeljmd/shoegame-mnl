package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.ShoegameApplicationTests;
import com.brightworks.sg.ims.dto.FootWearDTO;
import com.brightworks.sg.ims.dto.UserDTO;
import com.brightworks.sg.ims.dto.VariantDTO;
import com.brightworks.sg.ims.entities.model.FootWear;
import com.brightworks.sg.ims.entities.model.Variant;
import com.brightworks.sg.ims.entities.model.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static com.brightworks.sg.ims.mapper.OrikaBeanMapperTestUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void userModelToUserDTO(){
        User user = userModel();
        UserDTO dto = mapper.map(user,UserDTO.class);
        assertEquals(dto.getFamilyName(),user.getFamilyname());
        assertEquals(dto.getGivenName(),user.getGivenName());
        assertEquals(dto.getMiddleName(),user.getMiddleName());
        assertEquals(dto.getEmail(), user.getEmail());
        assertEquals(dto.getId(),user.getId());
        assertEquals(dto.getPassword(),user.getPassword());
        assertEquals(dto.getRoles().size(),user.getRoles().size());
    }

    @Test
    public void userDTOToUserModel(){
        UserDTO dto = userDTO();
        User user = mapper.map(dto,User.class);
        assertEquals(dto.getFamilyName(),user.getFamilyname());
        assertEquals(dto.getGivenName(),user.getGivenName());
        assertEquals(dto.getMiddleName(),user.getMiddleName());
        assertEquals(dto.getEmail(), user.getEmail());
        assertEquals(dto.getId(),user.getId());
        assertEquals(dto.getPassword(),user.getPassword());
        assertEquals(dto.getRoles().size(),user.getRoles().size());
    }

    @Test
    public void createNewUserFromDTOToUserModelWithEncodedPassword(){
        UserDTO newUser = userDTO();
        newUser.setId(null);
        User mappingResult = mapper.map(newUser,User.class);
        assertEquals(newUser.getFamilyName(), mappingResult.getFamilyname());
        assertEquals(newUser.getGivenName(), mappingResult.getGivenName());
        assertEquals(newUser.getMiddleName(), mappingResult.getMiddleName());
        assertEquals(newUser.getEmail(), mappingResult.getEmail());
        assertEquals(newUser.getId(), mappingResult.getId());
        assertTrue(passwordEncoder.matches(newUser.getPassword(), mappingResult.getPassword()));
        assertEquals(newUser.getRoles().size(), mappingResult.getRoles().size());
    }

    @Test
    public void variantModelToVariantDTO(){
        Variant variant = variantModelThatIsDefault();
        VariantDTO variantDTO = mapper.map(variant,VariantDTO.class);
        assertEquals(variantDTO.getId(),variant.getId());
        assertEquals(variantDTO.getColorWay(),variant.getColorWay());
        assertEquals(variantDTO.getSize(),variant.getSize());
        assertEquals(variantDTO.getQuantity(),variant.getQuantity());
        assertEquals(variantDTO.getSKU(),variant.getSKU());
        assertEquals(variantDTO.getAssets().size(), variant.getAssets().size());
        assertEquals(variantDTO.getPrice().getRegularPrice(), variant.getPrice().getRegularPrice());
        assertEquals(variantDTO.getPrice().getSalePrice(), variant.getPrice().getSalePrice());
    }

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
