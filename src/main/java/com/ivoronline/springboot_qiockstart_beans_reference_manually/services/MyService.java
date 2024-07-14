package com.ivoronline.springboot_qiockstart_beans_reference_manually.services;

import org.springframework.stereotype.Service;

@Service("myBean")
public class MyService {
  
  //=======================================================================
  // SAY HELLO
  //=======================================================================
  public String sayHello() {
    return "Hello from MyService Bean";
  }

}
