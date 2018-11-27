package com.uu.anhusky.test;

import com.uu.anhusky.bean.Boss;
import com.uu.anhusky.config.MainConifgOfAutowired;
import com.uu.anhusky.dao.BookDao;
import com.uu.anhusky.service.BookService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class IOCTest_Autowired {
    private AnnotationConfigApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);

    }

    @After
    public void after() {
        applicationContext.close();
    }


    /**
     * ʹ��Red ���в���
     * �Զ�װ��ײ�ԭ��ʵ��xxxAware �ӿ�
     */
    @Test
    public void test04() {

    }


    /**
     * @AutoWird ���췽���Զ�ע��
     */
    @Test
    public void test03() {
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss.toString());
    }

    /**
     * @Qualifer ��ָ����Ҫװ������id,��ʹ������װ��
     */
    @Test
    public void test02() {
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService.toString());

        System.out.println("------------------------");
        Map<String, BookDao> map = applicationContext.getBeansOfType(BookDao.class);
        map.forEach((key, value) -> {
            System.out.println(key + " " + value.toString());
        });
    }

    /**
     * @Primary ��Spring�����Զ�װ���ʱ��Ĭ��ʹ����ѡ��bean��
     * Ҳ���Լ���ʹ��@Qualifierָ����Ҫװ���bean������
     */
    @Test
    public void test01() {
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao.toString());
        //ֱ�Ӵ�ӡ���� expected single matching bean but found 2: bookDao,bookDao2

        Map<String, BookDao> map = applicationContext.getBeansOfType(BookDao.class);
        map.forEach((key, value) -> {
            System.out.println(key + " " + value.toString());
        });

    }

}
