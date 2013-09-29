/**
 * 
 */
package com.yousync.core;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.yousync.model.User;

/**
 * @author quanzhi
 * 
 */
public class BussinessService {
	
	private final static String serverName = "http://yousync.ignag.com/yousync/api/";

//	private final static String serverName = "http://localhost:8080/yousync/api/";

	private static User currentUser;
	
	public static void logout(){
		currentUser = null;
		Application.unLoadDataModel();
	}

	public static boolean login(String userName, String passWord) {
		DefaultHttpClient httpclient = new DefaultHttpClient();
		String url = serverName + "user/login";
		HttpPost httpost = new HttpPost(url);

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("username", userName));
		nvps.add(new BasicNameValuePair("password", passWord));

		httpost.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
		
		Long code = 500l;
		try {

			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			String response = httpclient.execute(httpost, responseHandler);
			System.out.println("Login form get: " + response);
			JSONParser parser = new JSONParser();  
			JSONObject json = (JSONObject)parser.parse(response);
			code = (Long)json.get("code");
			if(code == 200l){
				String name = (String)json.get("name");
				Long userId = (Long)json.get("userId");
				String channel = (String)json.get("channels");
				currentUser = new User();
				currentUser.id = userId;
				currentUser.name = name;
				System.out.println(userId+":"+name);
				Application.updateChannel(channel);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpclient.getConnectionManager().shutdown();
		}
		if(code == 200l)
			return true;
		return false;
	}
	
	public static void installRecord(final Long softId,final String softVersion,
			final String deviceNum,final String deviceBrand,final String softName,final String macAddr){
		new Thread(new Runnable(){ 
			public void run(){
				DefaultHttpClient httpclient = new DefaultHttpClient();
				String url = serverName + "record";
				HttpPost httpost = new HttpPost(url);

				List<NameValuePair> nvps = new ArrayList<NameValuePair>();
				nvps.add(new BasicNameValuePair("softid", ""+softId));
				nvps.add(new BasicNameValuePair("version", softVersion));
				if(currentUser != null){
					nvps.add(new BasicNameValuePair("userid", ""+currentUser.id));
				}else{
					nvps.add(new BasicNameValuePair("userid", "0"));
				}
				nvps.add(new BasicNameValuePair("devicenum", deviceNum));
				
				nvps.add(new BasicNameValuePair("devicebrand", deviceBrand));
				
				nvps.add(new BasicNameValuePair("softname", softName));
				
				nvps.add(new BasicNameValuePair("macaddr", macAddr));
				
				httpost.setEntity(new UrlEncodedFormEntity(nvps, Consts.UTF_8));
				
				Long code = 500l;
				try {

					ResponseHandler<String> responseHandler = new BasicResponseHandler();
					String response = httpclient.execute(httpost, responseHandler);
					System.out.println("Login form get: " + response);
					JSONParser parser = new JSONParser();  
					JSONObject json = (JSONObject)parser.parse(response);
					code = (Long)json.get("code");
					if(code == 200l){	
						System.out.println("successful");
					}
					
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					httpclient.getConnectionManager().shutdown();
				}
				
			}
		}).start();
	}

	public static void main(String[] args) {
		login("admin", "admin");
		BussinessService.installRecord(12L, "1212", Application.deviceNum, Application.deviceBrand,"н╒пе",Application.macAddr);
	}
}
