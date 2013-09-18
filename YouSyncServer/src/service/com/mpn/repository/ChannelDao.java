package com.mpn.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mpn.sd.Channel;

public interface ChannelDao extends PagingAndSortingRepository<Channel,Long>,JpaSpecificationExecutor<Channel>{

}
