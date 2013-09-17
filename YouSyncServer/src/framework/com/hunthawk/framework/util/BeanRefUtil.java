package com.hunthawk.framework.util;

import java.lang.reflect.Field;  
import java.lang.reflect.Method;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.HashMap;  
import java.util.Locale;  
import java.util.Map;  
  
/** 
 * java bean 反射的方法 
 * @author yanshixin 
 */  
public class BeanRefUtil {  
  
	public static Object autoGetterAndSetter(Object src, Object target) throws Exception {  
        Method[] sms = src.getClass().getMethods();     // 原始类方法 srcMethod  
        Method[] tms = target.getClass().getMethods();  // 目标类防范 targetMethod  
        for (Method sm : sms) {  
            if (sm.getName().startsWith("get")) {       // 原始类的 getter  
                String attrName = sm.getName().substring(3);// 属性  
                for (Method tm : tms) {// 遍历目标类  
                    if (("set" + attrName).equals(tm.getName())) {// 执行目标类的指定attrName的setter  
                        tm.invoke(target, sm.invoke(src));  
                    }  
                }  
            }  
        }  
        return target;  
    }  
} 
