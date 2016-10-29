package com.brightworks.sg.ims.repo.user;

import com.brightworks.sg.ims.entities.model.user.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Dell on 29/10/2016.
 */
public interface RoleRepo extends PagingAndSortingRepository<Role,Long> {
}
