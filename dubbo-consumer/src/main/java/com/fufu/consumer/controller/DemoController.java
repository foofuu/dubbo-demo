package com.fufu.consumer.controller;

import com.alibaba.dubbo.rpc.service.GenericService;
import com.fufu.consumer.util.ApplicationContextUtil;
import com.fufu.dubbo.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

/**
 * Created by zhoujunfu on 2018/8/29.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping(value ="/test",method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String test(@RequestParam String name) {
        GenericService genericService =
                (GenericService) ApplicationContextUtil.getBean("demoService");
        Object sayHello = genericService.$invoke("sayHello", new String[]{"java.lang.String"}, new Object[]{name});
        return sayHello.toString();

    }
}
