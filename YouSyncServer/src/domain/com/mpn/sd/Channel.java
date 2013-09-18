package com.mpn.sd;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "ss_channel")
// 默认的缓存策略.
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Channel extends IdEntity {

	@Column(name = "channel_name")
	private String name;
	
	@Column(name = "channel_desc")
	private String channelDesc;
	
	@Column(name = "create_time")
	private Date createTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getChannelDesc() {
		return channelDesc;
	}

	public void setChannelDesc(String desc) {
		this.channelDesc = desc;
	}

}
