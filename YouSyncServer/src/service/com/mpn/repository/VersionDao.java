package com.mpn.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mpn.sd.Version;

public interface VersionDao extends PagingAndSortingRepository<Version,Long>{

}
