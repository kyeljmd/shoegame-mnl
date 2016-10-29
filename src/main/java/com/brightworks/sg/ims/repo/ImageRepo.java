package com.brightworks.sg.ims.repo;

import com.brightworks.sg.ims.entities.model.Image;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Dell on 29/10/2016.
 */
public interface ImageRepo extends PagingAndSortingRepository<Image,Long>{
}
