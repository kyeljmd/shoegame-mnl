package com.brightworks.sg.ims.repo.user;

import com.brightworks.sg.ims.entities.model.user.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Dell on 29/10/2016.
 */
public interface UserRepo extends PagingAndSortingRepository<User,Long> {
}
