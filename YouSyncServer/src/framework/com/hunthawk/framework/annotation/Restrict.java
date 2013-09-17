/**
 * 
 */
package com.hunthawk.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sunquanzhi
 *
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Restrict {
	enum Position 
	 {
	         ARG_1, ARG_2, ARG_3, ARG_4, ARG_5, ARG_6, ARG_7, ARG_8, ARG_9 
	 }
	enum Mode
	{
		ROLE,PERMISSION,ALL
	}
	//Ȩ������
	String name() default "";
	//��������
	String action() default "";
	//����
	Restrict.Position[] args() default {};
	//����
	String[] properties() default {};
	//��ɫ
	String[] roles() default {};
	
	Restrict.Mode mode() default Mode.ALL;
}
