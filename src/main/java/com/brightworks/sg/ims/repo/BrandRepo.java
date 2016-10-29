package com.brightworks.sg.ims.repo;

import com.brightworks.sg.ims.entities.Brand;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Dell on 29/10/2016.
 */
public interface BrandRepo extends PagingAndSortingRepository<Brand,Long> {
}
