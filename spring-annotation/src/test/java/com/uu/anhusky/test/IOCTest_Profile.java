package com.uu.anhusky.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.uu.anhusky.bean.Yellow;
import com.uu.anhusky.config.MainConfigOfProfile;

public class IOCTest_Profile {
	
	//1��ʹ�������ж�̬����: �����������λ�ü��� -Dspring.profiles.active=test
	//2������ķ�ʽ����ĳ�ֻ�����
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext();
		//1������һ��applicationContext
		//2��������Ҫ����Ļ���
		applicationContext.getEnvironment().setActiveProfiles("dev");
		//3��ע����������
		applicationContext.register(MainConfigOfProfile.class);
		//4������ˢ������
		applicationContext.refresh();
		
		
		String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
		for (String string : namesForType) {
			System.out.println(string);
		}
		
		Yellow bean = applicationContext.getBean(Yellow.class);
		System.out.println(bean);
		applicationContext.close();
	}

}