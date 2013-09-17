/**
 * 
 */
package com.hunthawk.framework.annotation;

/**
 * @author sunquanzhi
 *
 */
public @interface PublishService {
	enum Position 
	 {
	         ARG_1, ARG_2, ARG_3, ARG_4, ARG_5, ARG_6, ARG_7, ARG_8, ARG_9 
	 }
	enum Type
	{
		Object,Collection,Int
	}
	//������������
	String serviceName();
	//��������״̬����δ֪
	PublishService.Position value() default Position.ARG_1;
	//��������״̬����
	PublishService.Type type() default Type.Object;
}
