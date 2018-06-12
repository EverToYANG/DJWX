package com.gsccs.cms.bass.annotation;

import java.lang.annotation.Documented;      
import java.lang.annotation.ElementType;      
import java.lang.annotation.Retention;      
import java.lang.annotation.RetentionPolicy;      
import java.lang.annotation.Target;   


/**
 * 
 * <p>Title: SiteSelectCheck.java</p>
 * 
 * <p>Description: SiteSelectCheck注解,声明必须有当前管理站点才能使用的功能</p>
 * 
 * <p>Date: Dec 16, 2013</p>
 * 
 * <p>Time: 4:43:12 PM</p>
 * 
 * <p>Copyright: 2013</p>
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */

@Target({ElementType.METHOD})      
@Retention(RetentionPolicy.RUNTIME)      
@Documented     
public @interface SiteCheck {  
	
}   
