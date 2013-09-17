/**
 * 
 */
package com.yousync.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author quanzhi
 *
 */
public class LogUtils {
	private static boolean isEffective = false; 
	private static BufferedWriter logWriter;
	private static int count = 1;
	public static void init(String file){
		try {
			logWriter = new BufferedWriter(new FileWriter(file));
			isEffective = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void logFile(String log){
		try {
			count ++;
			logWriter.write(log);
			logWriter.write("\r\n");
			if(count % 2 == 0){
				logWriter.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void log(String ...logs){
		StringBuilder builder = new StringBuilder();
		for(String log : logs){
			builder.append(log);
			builder.append("###");
		}
			
		if(isEffective){
			logFile(builder.toString());
		}else{
			System.out.println(builder.toString());
		}
	}
	
	public static void err(Exception e){
		
		if(isEffective){
			logFile(e.getMessage());
		}else{
			e.printStackTrace();
		}
	}
	
	public static void close(){
		if(isEffective){
			try {
				logWriter.close();
				logWriter = null;
				isEffective = false;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
