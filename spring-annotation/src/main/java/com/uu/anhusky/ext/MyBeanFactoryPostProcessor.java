package com.uu.anhusky.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor...postProcessBeanFactory...");
        int count = beanFactory.getBeanDefinitionCount();
        System.out.println("��ǰBeanFactory����" + count + " ��Bean");

       // String[] names = beanFactory.getBeanDefinitionNames();
        // System.out.println(Arrays.asList(names));
    }

}
