package com.mpn.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mpn.sd.InstallRecord;
import com.mpn.sd.SoftwareItem;

public interface InstallRecordDao extends PagingAndSortingRepository<InstallRecord,Long>,JpaSpecificationExecutor<SoftwareItem>{

}
