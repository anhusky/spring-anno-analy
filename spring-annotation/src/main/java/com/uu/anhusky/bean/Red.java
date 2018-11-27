package com.uu.anhusky.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Red implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    private Blue blue;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("�����ioc��" + applicationContext);
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("��ǰbean�����֣�" + name);
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String resolveStringValue = resolver.resolveStringValue("��� ${os.name} ���� #{20*18}");
        System.out.println("�������ַ�����" + resolveStringValue);
        System.out.println("bule " + blue.toString());
    }


    //���󴴽�����ֵ֮�����
    @PostConstruct
    public void init() {
        System.out.println("Red....@PostConstruct...");
    }

    //�����Ƴ�����֮ǰ
    @PreDestroy
    public void detory() {
        System.out.println("detory....@PreDestroy...");
    }

    @Autowired
    private void setBlue(Blue blue) {
        this.blue = blue;
    }

}
