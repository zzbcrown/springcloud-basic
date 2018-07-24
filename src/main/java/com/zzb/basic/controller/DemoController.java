package com.zzb.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo
 */
@RestController
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping("/heartbeat")
    public String heartbeat(){
        return "success";
    }

}
