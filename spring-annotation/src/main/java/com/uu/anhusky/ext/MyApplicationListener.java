package com.uu.anhusky.ext;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyEvent> {

	//�������з������¼��Ժ󣬷�������
	@Override
	public void onApplicationEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("�յ��¼���"+event);
	}

}
