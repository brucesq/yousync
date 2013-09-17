package com.mpn.sd;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "ss_version")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Version extends IdEntity {
	
	private String versionCode;

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
}
