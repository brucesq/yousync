package com.mpn.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mpn.sd.Role;

public interface RoleDao extends PagingAndSortingRepository<Role, Long> {

}
