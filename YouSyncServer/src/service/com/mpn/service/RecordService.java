/**
 * 
 */
package com.mpn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.mpn.repository.InstallRecordDao;
import com.mpn.sd.InstallRecord;

/**
 * @author quanzhi
 * 
 */
@Component
@Transactional
public class RecordService {
	@Autowired
	private InstallRecordDao installRecordDao;

	public List<InstallRecord> getLastRecordList() {
		Sort sort = new Sort(Direction.DESC, "id");
		return installRecordDao.findAll(new PageRequest(0, 50, sort))
				.getContent();
	}
}
