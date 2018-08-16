package com.didispace.web.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 系统日志记录
 * 
 * @author cjg
 *
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ServiceLog {
	/**
	 * 操作类型,新增用户?删除用户 ?调用xx服务?使用接口?...
	 * 
	 * @return
	 */
	public String operation();

	/**
	 * 日志级别
	 * 
	 * @return
	 */
	public LogType level() default LogType.INFO;

}