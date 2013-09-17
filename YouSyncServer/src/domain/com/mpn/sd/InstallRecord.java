/**
 * 
 */
package com.mpn.sd;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author quanzhi
 *
 */
@Entity
@Table(name="install_record")
public class InstallRecord extends IdEntity{
	
	
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "soft_id")
	private Long softId;
	
	@Column(name = "soft_name")
	private String softName;
	
	@Column(name = "soft_version")
	private String softVersion;
	
	@Column(name = "device_num")
	private String deviceNum;

	@Column(name = "device_brand")
	private String deviceBrand;
	
	@Column(name = "remote_ip")
	private String remoteIp;
	
	@Column(name = "mac_addr")
	private String macAddr;
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSoftId() {
		return softId;
	}

	public void setSoftId(Long softId) {
		this.softId = softId;
	}

	public String getSoftName() {
		return softName;
	}

	public void setSoftName(String softName) {
		this.softName = softName;
	}

	public String getSoftVersion() {
		return softVersion;
	}

	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}

	public String getDeviceNum() {
		return deviceNum;
	}

	public void setDeviceNum(String deviceNum) {
		this.deviceNum = deviceNum;
	}

	public String getDeviceBrand() {
		return deviceBrand;
	}

	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}

	public String getRemoteIp() {
		return remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public String getMacAddr() {
		return macAddr;
	}

	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}
	
	
	
}
