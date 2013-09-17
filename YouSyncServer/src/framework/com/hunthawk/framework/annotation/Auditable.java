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
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Auditable {
	 enum Position 
	 {
	         ARG_1, ARG_2, ARG_3, ARG_4, ARG_5, ARG_6, ARG_7, ARG_8, ARG_9 
	 }
	 //���״̬��������δ֪
	 Auditable.Position status() default Position.ARG_2;
	 //������������δ֪
	 Auditable.Position value() default Position.ARG_1;
}
