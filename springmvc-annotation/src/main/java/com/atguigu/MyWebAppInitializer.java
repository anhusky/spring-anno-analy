package com.atguigu;

import com.atguigu.config.AppConfig;
import com.atguigu.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * web����������ʱ�򴴽����󣻵��÷�������ʼ��������ǰ  ǰ�˿�����
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * ��ȡ�������������ࣻ��Spring�������ļ���   ��������
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * ��ȡweb�����������ࣨSpringMVC�����ļ���  ��������
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    /**
     * ��ȡDispatcherServlet��ӳ����Ϣ
     * �����������󣨰�����̬��Դ��xx.js,xx.png���������ǲ�����*.jsp��
     * ��������������*.jspҳ�涼���أ�jspҳ����tomcat��jsp��������ģ�
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
