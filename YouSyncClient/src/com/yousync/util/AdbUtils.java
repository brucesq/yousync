/**
 * 
 */
package com.yousync.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author quanzhi
 * 
 */
public class AdbUtils {

	private static String ADB_PATH = "C:\\adb";//"/Users/quanzhi/Android/android-sdk-macosx/platform-tools/adb";
	
	
	
	public static void init(String path){
		LogUtils.log(path);
		ADB_PATH = path;
	}

	
	public static String getDeviceNum() {
		String deviceNum = "";
		try {
			String[] command = new String[]{ADB_PATH,"devices"};
			Process process = Runtime
					.getRuntime()
					.exec(command);
			process.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			String line = null;
			boolean isFound = false;
			String deviceName = null;
			while ((line = reader.readLine()) != null) {
				if (isFound) {
					deviceName = line;
					break;
				}
				if (line.startsWith("List of devices")) {
					isFound = true;
				}
			}
//			LogUtils.log("deviceName:",deviceName);
			if (deviceName != null) {
				String[] strs = deviceName.split("	");
				if(strs.length > 0)
				deviceNum = strs[0];
			}
//			LogUtils.log("deviceNum:",deviceNum);
			reader.close();
			process.destroy();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deviceNum;
	}

	public static Map<String,String> getDeviceProps(){
		 Map<String,String> props = new  HashMap<String,String>();
		try {
			String line = "";
			String[] command = new String[]{ADB_PATH,"shell","getprop"};
			Process process = Runtime
					.getRuntime()
					.exec(command);
//			LogUtils.log("command:",ADB_PATH,"shell","getprop");
//			process.waitFor();
//			LogUtils.log("end waitFor");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			while ((line = reader.readLine()) != null) {
				String[] strs = line.split("]:");
//				LogUtils.log("Line:"+line);
				if(strs.length == 2){
					String key = strs[0].replaceAll("\\[", "").replaceAll("\\]", "");
					String value = strs[1].replaceAll("\\[", "").replaceAll("\\]", "");
					props.put(key,value);
				}
			}
			reader.close();
			process.destroy();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return props;
	}
	
	public static void uninstallSoft(String softName){
		try{
			String line = "";
			String[] command = new String[]{ADB_PATH,"uninstall",softName};
			Process process = Runtime
					.getRuntime()
					.exec(command);
			process.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			while ((line = reader.readLine()) != null) {
				System.out.println("uninstallSoft:"+line);
			}
			reader.close();
			process.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static boolean installApk(String apkPath){
		//adb install -r apkÎÄ¼þÃû³Æ.apk
		try {
			String line = "";
			String[] command = new String[]{ADB_PATH,"install","-r",apkPath};
			Process process = Runtime
					.getRuntime()
					.exec(command);
			LogUtils.log(ADB_PATH," install -r ",apkPath);

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			
			long start = System.currentTimeMillis();  
            boolean processFinished = false;  
            while (System.currentTimeMillis() - start < 50000 && !processFinished) {  
                processFinished = true;  
                try {  
                    process.exitValue();  
                } catch (IllegalThreadStateException e) {  
                    // process hasn't finished yet  
                    processFinished = false;  
  
                    try {  
                        Thread.sleep(1000);  
                    } catch (InterruptedException e1) {  
                    	LogUtils.log("Process, failed [" , e.getMessage(),  "]");  
                    }  
                }  
            }  
            
            StringBuilder builder = new StringBuilder();
            if(reader.ready()){
            	while ((line = reader.readLine()) != null) {
            		builder.append(line);
    			}
            }

			reader.close();
			process.destroy();
			
//			System.out.println(builder.toString());
			if(builder.toString().indexOf("Success") >= 0){
				return true;
			}
			LogUtils.log(builder.toString());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		getDeviceNum();
//		getDeviceProps();
//	}

}
