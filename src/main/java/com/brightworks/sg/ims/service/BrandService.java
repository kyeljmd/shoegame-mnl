package com.brightworks.sg.ims.service;

import com.brightworks.sg.ims.dto.BrandDTO;
import org.springframework.stereotype.Service;

/**
 * Created by kyel on 11/13/2016.
 */
@Service
public interface BrandService {

    void addBrand(BrandDTO brand);

    BrandDTO findBrandByName(String name);

    BrandDTO findById(Long id);
}
