package com.fufu.consumer.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by fufu on 2018/8/31.
 */
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext ac;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ac = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return ac;
    }

    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }
}
