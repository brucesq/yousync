package com.yousync.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.yousync.model.SoftwareObject;

public class DBUtils {

	@SuppressWarnings("unchecked")
	public static void makeDBFiles(String fromFile, String toFile) {
		try {
			List<String> strs = FileUtils
					.readLines(new File(fromFile), "utf-8");
			List<String> outs = new ArrayList<String>();

			for (String str : strs) {
				StringBuilder builder = new StringBuilder();
				String[] fields = str.split("###");
				for (String field : fields) {
					builder.append(StringUtil.encode(field));
					builder.append("###");
				}
				outs.add(builder.toString());
				
			}
			FileUtils.writeLines(new File(toFile), "utf-8", outs);

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<SoftwareObject> readObjectfromDB(String dbFile) {
		List<SoftwareObject> objs = new ArrayList<SoftwareObject>();
		try {
			List<String> lines = FileUtils.readLines(new File(dbFile), "utf-8");
			
			for (String line : lines) {
				String[] fields = line.split("###");
				System.out.println(fields.length);
				if(fields.length > 6){
					SoftwareObject obj = new SoftwareObject(StringUtil.decode(fields[0]), StringUtil.decode(fields[1]),
							StringUtil.decode(fields[2]), StringUtil.decode(fields[4]), StringUtil.decode(fields[3]), StringUtil.decode(fields[5]),Long.parseLong(StringUtil.decode(fields[6])));
					System.out.println(obj);
					objs.add(obj);
				}

			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return objs;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		makeDBFiles(
				"/Users/quanzhi/program/SwtWorkspace/YouSync/configs/software.properties",
				"/Users/quanzhi/program/SwtWorkspace/YouSync/configs/ys.db");
		readObjectfromDB("/Users/quanzhi/program/SwtWorkspace/YouSync/configs/ys.db");
	}

}
