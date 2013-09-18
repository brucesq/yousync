/**
 * 
 */
package com.yousync.core;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import com.yousync.model.SoftwareObject;
import com.yousync.util.DBUtils;
import com.yousync.util.IoUtils;

/**
 * Check software version and download new files.
 * @author quanzhi
 *
 */
public class CheckSoftwareUpdateThread implements Runnable {

	private String dbFile;
	private String versionFile;
	private String lastDownloadCheckFile;
	
	public CheckSoftwareUpdateThread(String dbFile,String vFile){
		this.dbFile = dbFile;
		this.versionFile = vFile;
		this.lastDownloadCheckFile = dbFile+".ca";
	}
	
	@Override
	public void run() {
		processLastCheckFile();
		checkVersion();
		readDBFiles();
		updateModelFiles();
		Application.setRightStatus("", false);
		Application.setCenterStatus("");
	}

	private void checkVersion(){
		String vOnline = "";
		String vLocale = "";
		String vCache = versionFile+".b";
		IoUtils.saveFileFromUrl(Application.versionUrl+"?channels="+Application.channel, vCache, "");
		File vFile = new File(vCache);
		if(vFile.exists()){
			try {
				vOnline = FileUtils.readFileToString(vFile, "utf-8");
			} catch (IOException e) {
			}
		}
		File vLocaleFile = new File(versionFile);
		if(vLocaleFile.exists()){
			try {
				vLocale = FileUtils.readFileToString(vLocaleFile, "utf-8");
			} catch (IOException e) {
			}
		}
		
		
		if((!vOnline.equals(vLocale) && StringUtils.isNotEmpty(vOnline))|| StringUtils.isEmpty(vLocale)  ){
			try {
				FileUtils.writeStringToFile(vLocaleFile, vOnline, "utf-8");
			} catch (IOException e) {
				e.printStackTrace();
			}
			updateDBFile();
		}
		if(StringUtils.isEmpty(vOnline)){
			return;
		}
		
	}
	
	private void updateDBFile(){
		Application.setRightStatus("更新安装软件信息...", false);
		IoUtils.saveFileFromUrl(Application.softWareUrl+"?channels="+Application.channel, dbFile+".b", "");
		File cacheFile = new File(dbFile+".b");
		try {
			String dbStr = FileUtils.readFileToString(cacheFile, "utf-8");
			FileUtils.writeStringToFile(new File(dbFile), dbStr, "utf-8");
			readDBFiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void readDBFiles(){
		Application.setModels(DBUtils.readObjectfromDB(dbFile));
	}
	
	private void updateModelFiles(){
		List<SoftwareObject> objs = Application.getModels();
		for(SoftwareObject obj : objs){
			updateModelFile(obj);
		}
	}
	private void updateModelFile(SoftwareObject obj){
		obj.setCacheImageFile(checkCacheFileExist(obj.getSoftImageUrl(),"",false,""));
		obj.setCacheSoftFile(checkCacheFileExist(obj.getSoftUrl(),obj.getVersion(),true,"正在下载"+obj.getSoftName()+"安装包"));
	}
	
	private String checkCacheFileExist(String fileUrl,String version,boolean isShowStatus,String showInfo){
		String filePath = Application.getCacheFilePath(fileUrl, version);
		File cacheFile = new File(filePath);
		if(!cacheFile.exists()){
			if(isShowStatus){
				Application.setRightStatus("", true);
				Application.setCenterStatus(showInfo);
			}
			//Should check integrity of the download file 
			//Need record  in the file 
			writeLastCheckFile(filePath);
			IoUtils.saveFileFromUrl(fileUrl, filePath, "");
			//Need clean the record
			writeLastCheckFile("");
		}
		if(cacheFile.exists()){
			return filePath;
		}
		return "";
	}
	
	private void writeLastCheckFile(String content){
		try {
			FileUtils.writeStringToFile(new File(this.lastDownloadCheckFile), content, "utf-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void processLastCheckFile(){
		try {
			File f = new File(this.lastDownloadCheckFile);
			if(!f.exists()){
//				f.createNewFile();
				return;
			}
			String filePath = FileUtils.readFileToString(new File(this.lastDownloadCheckFile), "utf-8");
			if(StringUtils.isNotEmpty(filePath)){
//				System.out.println("delete file:"+filePath);
				FileUtils.deleteQuietly(new File(filePath));
			}
			writeLastCheckFile("");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
