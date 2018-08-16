package com.didispace.web.aspect;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 启用切面
 * 
 * @author cjg
 *
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectConfig {

}