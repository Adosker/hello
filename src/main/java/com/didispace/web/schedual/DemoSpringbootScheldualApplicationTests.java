package com.didispace.web.schedual;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
	public class DemoSpringbootScheldualApplicationTests {
	    public final static long ONE_Minute =  60 * 1000;
	    
	    @Scheduled(fixedDelay=ONE_Minute)
	    public void fixedDelayJob(){
	        System.out.println(new Date()+" >>fixedDelay执行....");
	    }
	    
	    @Scheduled(fixedRate=ONE_Minute)
	    public void fixedRateJob(){
	        System.out.println(new Date()+" >>fixedRate执行....");
	    }

	    @Scheduled(cron="0 15 3 * * ?")
	    public void cronJob(){
	        System.out.println(new Date()+" >>cron执行....");
	    }
	}

