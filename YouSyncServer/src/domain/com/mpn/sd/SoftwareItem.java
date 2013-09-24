/**
 * 
 */
package com.mpn.sd;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * @author quanzhi
 *
 */
@Entity
@Table(name="soft_item")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class SoftwareItem extends IdEntity {
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "icon_url")
	private String iconUrl;
	
	@Column(name = "apk_file")
	private String apkFile;
	
	@Column(name = "soft_version")
	private String version;
	
	@Column(name = "soft_type")
	private String softType;
	
	@Column(name = "soft_price")
	private String price;

	@Column(name = "package_name")
	private String packageName;
	
	@Column(name = "soft_status")
	private String status;
	
	@Column(name = "soft_channels")
	private String channels;
	
	@Transient
	private String channelNames = "";

	@Transient
	private List<Channel> channelList = Lists.newArrayList(); 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getApkFile() {
		return apkFile;
	}

	public void setApkFile(String apkFile) {
		this.apkFile = apkFile;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSoftType() {
		return softType;
	}

	public void setSoftType(String softType) {
		this.softType = softType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Transient
	public String getStatusName(){
		return allStatus.get(status);
	}
	@Transient
	public static Map<String, String> getAllStatus(){
		return allStatus;
	}
	public String getChannels() {
		return channels;
	}

	public void setChannels(String channels) {
		this.channels = channels;
	}
	
	@Transient
	public String getChannelNames(){
		return channelNames;
	}

	public void setChannelNames(String channelNames) {
		this.channelNames = channelNames;
	}

	@Transient
	public List<Channel> getChannelList() {
		return channelList;
	}

	public void setChannelList(List<Channel> channelList) {
		this.channelList = channelList;
	}
	
	private static Map<String, String> allStatus = Maps.newHashMap();

	static {
		allStatus.put("enabled", "有效");
		allStatus.put("disabled", "无效");
	}
}
