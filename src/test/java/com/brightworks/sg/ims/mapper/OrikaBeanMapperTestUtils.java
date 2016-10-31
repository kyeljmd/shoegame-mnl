package com.brightworks.sg.ims.mapper;

import com.brightworks.sg.ims.dto.BrandDTO;
import com.brightworks.sg.ims.dto.FootWearDTO;
import com.brightworks.sg.ims.dto.RoleDTO;
import com.brightworks.sg.ims.dto.UserDTO;
import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.entities.model.FootWear;
import com.brightworks.sg.ims.entities.model.Image;
import com.brightworks.sg.ims.entities.model.Price;
import com.brightworks.sg.ims.entities.model.Variant;
import com.brightworks.sg.ims.entities.model.user.Role;
import com.brightworks.sg.ims.entities.model.user.User;
import org.dom4j.util.UserDataDocumentFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dell on 29/10/2016.
 */
public class OrikaBeanMapperTestUtils {

    public static User userModel(){
        User user = new User();
        user.setId(1L);
        user.setEmail("user@gmail.com");
        user.setPassword("longpassword");
        user.setFamilyName("Family Name");
        user.setGivenName("Given Name");
        user.setMiddleName("Middle Name");
        user.setRoles(roles());
        return user;
    }

    public static UserDTO userDTO(){
        UserDTO user = new UserDTO();

        user.setId(1L);
        user.setEmail("user@gmail.com");
        user.setPassword("longpassword");
        user.setFamilyName("Family Name");
        user.setGivenName("Given Name");
        user.setMiddleName("Middle Name");
        user.setRoles(rolesDTO());
        return user;
    }

    private static List<Role> roles() {
        Role role = new Role();
        role.setCode("VIEW_CATALOG");
        role.setDescription("CAN VIEW CATALOGUES");
        return Arrays.asList(role);
    }


    private static List<RoleDTO> rolesDTO() {
        RoleDTO role = new RoleDTO();
        role.setCode("VIEW_CATALOG");
        role.setDescription("CAN VIEW CATALOGUES");
        return Arrays.asList(role);
    }

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
