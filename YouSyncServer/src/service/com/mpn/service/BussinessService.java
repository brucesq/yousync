/**
 * 
 */
package com.mpn.service;

import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.persistence.DynamicSpecifications;
import org.springside.modules.persistence.SearchFilter;

import com.mpn.repository.ChannelDao;
import com.mpn.repository.InstallRecordDao;
import com.mpn.repository.SoftItemDao;
import com.mpn.repository.VersionDao;
import com.mpn.sd.Channel;
import com.mpn.sd.InstallRecord;
import com.mpn.sd.SoftwareItem;
import com.mpn.sd.Version;

/**
 * @author quanzhi
 *
 */
@Component
@Transactional
public class BussinessService {

	@Autowired
	private InstallRecordDao installRecordDao;
	
	@Autowired
	private SoftItemDao softItemDao;
	
	@Autowired
	private VersionDao versionDao;
	
	@Autowired
	private ChannelDao channelDao;
	
	public void saveSoftItem(SoftwareItem item){
		softItemDao.save(item);
		updateVersion();
	}
	
	public void publishSoft(Long id){
		SoftwareItem item = getSoftwareItem(id);
		item.setStatus("enabled");
		softItemDao.save(item);
	}
	public void offlineSoft(Long id){
		SoftwareItem item = getSoftwareItem(id);
		item.setStatus("disabled");
		softItemDao.save(item);
	}
	
	public Page<SoftwareItem> getSoftItem( Map<String, Object> searchParams, int pageNumber, int pageSize,
			String sortType) {
		PageRequest pageRequest = buildPageRequest(pageNumber, pageSize, sortType);
		Specification<SoftwareItem> spec = buildSpecification(searchParams);

		return softItemDao.findAll(spec, pageRequest);
	}
	
	public SoftwareItem getSoftwareItem(Long id){
		return softItemDao.findOne(id);
	}
	
	public SoftwareItem getSoftwareItemChannel(SoftwareItem softwareItem){
		String[] channels = softwareItem.getChannels().split("@");
		for(String str : channels){
			try{
				Long cid = Long.parseLong(str);
				Channel channel = channelDao.findOne(cid);
				softwareItem.getChannelList().add(channel);
				softwareItem.setChannelNames(softwareItem.getChannelNames()+", "+channel.getName());
			}catch(Exception e){
//				e.printStackTrace();
			}
		}
		return softwareItem;
	}
	
	public Iterable<SoftwareItem> getAllSoftItem(){
		return softItemDao.findAll();
	}
	
	public void saveInstallRecord(InstallRecord record){
		installRecordDao.save(record);
	}
	
	/**
	 * 创建分页请求.
	 */
	private PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType) {
		Sort sort = null;
		if ("auto".equals(sortType)) {
			sort = new Sort(Direction.DESC, "id");
		} else if ("title".equals(sortType)) {
			sort = new Sort(Direction.ASC, "name");
		}

		return new PageRequest(pageNumber - 1, pagzSize, sort);
	}

	/**
	 * 创建动态查询条件组合.
	 */
	private Specification<SoftwareItem> buildSpecification(Map<String, Object> searchParams) {
		Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
//		filters.put("user.id", new SearchFilter("user.id", Operator.EQ, userId));
		Specification<SoftwareItem> spec = DynamicSpecifications.bySearchFilter(filters.values(), SoftwareItem.class);
		return spec;
	}
	
	public void updateVersion(){
		Version version = versionDao.findOne(1L);
		version.setVersionCode(""+System.currentTimeMillis());
	}
	public String getVersion(){
		Version version = versionDao.findOne(1L);
		return version.getVersionCode();
	}

	private static Hex hex = new Hex();
	public  String encode(String str) throws Exception{
		String result = new String(hex.encode(str.getBytes("utf-8")),"utf-8");

		int length = result.length();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < length; i++) {
			char c = result.charAt(i);
			if (i < length / 2  )
				builder.append(decodeChar(c));
			else
				builder.append(c);
		}
		return builder.toString();
//		System.out.println(str);
//		return str;

	}
	private  char decodeChar(char c){
		if(c == '1'){
			return '2';
		}
		if(c == '2'){
			return '1';
		}
		if(c == '3'){
			return '5';
		}
		if(c == '5'){
			return '3';
		}
		if(c == '6'){
			return '8';
		}
		if(c == '8'){
			return '6';
		}
		return c;
	}
}
