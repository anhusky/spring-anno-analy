package com.uu.anhusky.test;

import com.uu.anhusky.ext.ExtConfig;
import com.uu.anhusky.ext.MyEvent;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Ext {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext  =
				new AnnotationConfigApplicationContext(ExtConfig.class);
		
		
		//�����¼���
		applicationContext.publishEvent(new MyEvent(new String("�ҷ������¼�")) {});
		
		applicationContext.close();
	}

}
