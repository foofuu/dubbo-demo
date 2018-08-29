package com.fufu.consumer.controller;

import com.fufu.dubbo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zhoujunfu on 2018/8/29.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Resource
    DemoService demoService;

    @RequestMapping(value ="/test",method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String testCategoryAccuracy(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}
