/**
 * 
 */
package com.yousync.core;

import java.util.Map;

import com.yousync.util.AdbUtils;

/**
 * Deamon thread check device connect status
 * @author quanzhi
 *
 */
public class DeviceCheckThread implements Runnable {

	
	private String lastDeviceNum = null;
	
	public DeviceCheckThread(){
		
	}
	
	
	@Override
	public void run() {
		while(true){
			try{		
				processStatus(AdbUtils.getDeviceNum());
				Thread.sleep(Application.CHECK_DEVICE_CONNECT_INTERVAL);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	
	}
	
	
	
	private void processStatus(String deviceName){
		if(deviceName == null)
			return ;
		String[] strs = deviceName.split(" ");
		if(strs.length>0){
			String deviceNum = strs[0];
			if(!deviceNum.equals(lastDeviceNum)){
				if(deviceNum.length() > 0){
					
					Map<String,String> props = AdbUtils.getDeviceProps();
//					StringBuilder statusBuilder = new StringBuilder();
					String deviceProduct = props.get("ro.product.brand") + props.get("ro.build.product");
					
					
					
//					if(deviceProduct != null && deviceProduct.length() > 0){
//						statusBuilder.append("手机型号：");
//						statusBuilder.append(deviceProduct);
//						statusBuilder.append("		");
//					}
//					statusBuilder.append("手机SN号：");
//					statusBuilder.append(deviceNum);
					Application.setDeviceStatus(deviceNum,deviceProduct);
					
				}else{
					Application.setDeviceStatus("", "");
				}
				lastDeviceNum = deviceNum;
			}
		}
		
		
	}
	
	


}
