package com.ivoronline.springboot_qiockstart_beans_reference_manually.controllers;

import com.ivoronline.springboot_qiockstart_beans_reference_manually.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private ApplicationContext context;

  //=======================================================================
  // HELLO
  //=======================================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    //MyService myService = (MyService) context.getBean("myBean");                //Name
    //MyService myService = (MyService) context.getBean(MyService.class);         //Class
    MyService myService = (MyService) context.getBean("myBean", MyService.class); //Name & Class
    String    result = myService.sayHello();
    return    result;
  }

}
