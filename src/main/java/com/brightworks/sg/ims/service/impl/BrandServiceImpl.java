package com.brightworks.sg.ims.service.impl;

import com.brightworks.sg.ims.dto.BrandDTO;
import com.brightworks.sg.ims.entities.Brand;
import com.brightworks.sg.ims.mapper.OrikaBeanMapper;
import com.brightworks.sg.ims.repo.BrandRepo;
import com.brightworks.sg.ims.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

/**
 * Created by kyel on 11/13/2016.
 */
public class BrandServiceImpl implements BrandService {

    @Autowired
    private OrikaBeanMapper mapper;

    @Autowired
    private BrandRepo brandRepo;

    @Override
    public void addBrand(BrandDTO brand) {
        brandRepo.save(mapper.map(brand, Brand.class));
    }

    @Override
    public BrandDTO findBrandByName(String name) {
        return mapper.map(brandRepo.findByName(name), BrandDTO.class);
    }

    @Override
    public BrandDTO findById(Long id) {
        return mapper.map(brandRepo.findOne(id), BrandDTO.class);
    }
}
