package com.augmentum.dao.impl;

import org.springframework.beans.BeansException;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.ApplicationContextAware;  
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;  

public abstract class AbstractBaseMongoTemplete implements  
ApplicationContextAware {  

	protected MongoOperations mongoTemplate;  
	
	/** 
	* @Description 根据配置文件设置mongoTemplate 
	* @param mongoTemplate 
	*/  
	public void setMongoTemplate(MongoOperations mongoTemplate) {  
		this.mongoTemplate = mongoTemplate;  
	}  
	
	@Override  
	public void setApplicationContext(ApplicationContext applicationContext)  
	    throws BeansException {  
		MongoOperations mongoTemplate = applicationContext.getBean(  
		        "mongoTemplate", MongoOperations.class);  
		setMongoTemplate(mongoTemplate);  
	}  
}  