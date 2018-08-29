package com.fufu.dubbo.provider.service;


import com.fufu.dubbo.api.DemoService;

/**
 * Created by zhoujunfu on 2018/5/21.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
