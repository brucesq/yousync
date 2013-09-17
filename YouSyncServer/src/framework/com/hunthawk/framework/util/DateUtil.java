/**
 * 
 */
package com.hunthawk.framework.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author liuxh
 *
 */
public class DateUtil {

	private static final Logger log = LoggerFactory.getLogger(DateUtil.class);
    public static final String  yyyy_MM_ddHH24mmss_FORMAT="yyyy-MM-dd HH:mm:ss";
    
    
    
    public static String formatDateToString(Date date, String pattern) {
        if (null == date) return "";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
    
    public static Date parseStringToDate(String src, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(src);
        } catch (ParseException e) {
            log.error(e.getMessage());
            return null;
        }
    }
    public static int timeCompare(Date t1, Date t2) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		try {
			c1.setTime(t1);
			c2.setTime(t2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int result = c1.compareTo(c2); // ����ֵ��1:c1>c2 0:c1=c2 -1:c1<c2
		return result;
	}
    public static void main(String[] args) {
    	Date d=new Date();
    	Date old=DateUtil.parseStringToDate("2011-11-05 11:11:11", "yyyy-MM-dd HH:mm:ss");
    	System.out.println(timeCompare(old,d));
        String src = "10/23/2007 15:20";
        System.out.println(formatDateToString(parseStringToDate(src, "MM/dd/yyyy HH:mm"), "yyyyMMddHHmmss"));
        String dsrc = "2008-07-07 12:12:12";
        System.out.println(DateUtil.formatDateToString(DateUtil.parseStringToDate(dsrc, "yyyy-MM-dd HH:mm:ss"), "yyyyMMddHHmmss"));
    }
}
