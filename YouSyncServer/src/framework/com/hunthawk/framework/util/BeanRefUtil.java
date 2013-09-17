package com.hunthawk.framework.util;

import java.lang.reflect.Field;  
import java.lang.reflect.Method;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.HashMap;  
import java.util.Locale;  
import java.util.Map;  
  
/** 
 * java bean ����ķ��� 
 * @author yanshixin 
 */  
public class BeanRefUtil {  
  
	public static Object autoGetterAndSetter(Object src, Object target) throws Exception {  
        Method[] sms = src.getClass().getMethods();     // ԭʼ�෽�� srcMethod  
        Method[] tms = target.getClass().getMethods();  // Ŀ������� targetMethod  
        for (Method sm : sms) {  
            if (sm.getName().startsWith("get")) {       // ԭʼ��� getter  
                String attrName = sm.getName().substring(3);// ����  
                for (Method tm : tms) {// ����Ŀ����  
                    if (("set" + attrName).equals(tm.getName())) {// ִ��Ŀ�����ָ��attrName��setter  
                        tm.invoke(target, sm.invoke(src));  
                    }  
                }  
            }  
        }  
        return target;  
    }  
} 
