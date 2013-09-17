/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yousync.model;

/**
 *
 * @author quanzhi
 */
public class SoftwareObject {
	private String softId;
    private String softName;
    private String softImageUrl;
    private String softTypeName;
    private String version;
    private String softUrl;
    private Long id;
    
    private String cacheImageFile = "";
    private String cacheSoftFile = "";

    public SoftwareObject(String softName, String softImageUrl, String softTypeName) {
        this.softName = softName;
        this.softImageUrl = softImageUrl;
        this.softTypeName = softTypeName;
    }

    public SoftwareObject(String softName, String softImageUrl,
			String softTypeName, String version, String softUrl,String softId,Long id) {
		
		this.softName = softName;
		this.softImageUrl = softImageUrl;
		this.softTypeName = softTypeName;
		this.version = version;
		this.softUrl = softUrl;
		this.softId = softId;
		this.id = id;
	}

	public String getSoftName() {
        return softName;
    }

    public void setSoftName(String softName) {
        this.softName = softName;
    }

    public String getSoftImageUrl() {
        return softImageUrl;
    }

    public void setSoftImageUrl(String softImageUrl) {
        this.softImageUrl = softImageUrl;
    }

    public String getSoftTypeName() {
        return softTypeName;
    }

    public void setSoftTypeName(String softTypeName) {
        this.softTypeName = softTypeName;
    }

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSoftUrl() {
		return softUrl;
	}

	public void setSoftUrl(String softUrl) {
		this.softUrl = softUrl;
	}

    
    public String getCacheImageFile() {
		return cacheImageFile;
	}

	public void setCacheImageFile(String cacheImageFile) {
		this.cacheImageFile = cacheImageFile;
	}

	public String getCacheSoftFile() {
		return cacheSoftFile;
	}

	public void setCacheSoftFile(String cacheSoftFile) {
		this.cacheSoftFile = cacheSoftFile;
	}

	public String getSoftId() {
		return softId;
	}

	public void setSoftId(String softId) {
		this.softId = softId;
	}

	public String toString(){
    	StringBuilder builder = new StringBuilder();
    	builder.append("softName=").append(softName).append(",softImageUrl=").append(softImageUrl).append(",softTypeName=")
    	.append(softTypeName).append(",version=").append(version).append(",softUrl=").append(softUrl).append(",packID=").append(softId)
    	.append(",ID=").append(id);
    	return builder.toString();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
}
