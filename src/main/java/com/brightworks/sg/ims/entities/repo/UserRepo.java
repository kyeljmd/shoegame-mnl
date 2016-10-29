package com.brightworks.sg.ims.entities.repo;

import com.brightworks.sg.ims.entities.model.user.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by kyel on 10/29/2016.
 */
public interface UserRepo extends PagingAndSortingRepository<User,Long>{
}
