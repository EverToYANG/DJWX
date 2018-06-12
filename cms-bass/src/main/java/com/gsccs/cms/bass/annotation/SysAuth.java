package com.gsccs.cms.bass.annotation;

import java.lang.annotation.Documented;      
import java.lang.annotation.ElementType;      
import java.lang.annotation.Retention;      
import java.lang.annotation.RetentionPolicy;      
import java.lang.annotation.Target;   


/**
 * FuncAuth注解,声明有权限使用被注解方法的功能代码
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */

@Target({ElementType.METHOD})      
@Retention(RetentionPolicy.RUNTIME)      
@Documented     
public @interface SysAuth {  
	String[] codes();//功能代码数组
}   
