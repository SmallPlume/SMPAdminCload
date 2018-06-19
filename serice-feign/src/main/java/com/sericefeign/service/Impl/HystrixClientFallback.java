package com.sericefeign.service.Impl;

import com.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author Dell
 * @date 2018/6/19 13:20
 */
@Component
public class HystrixClientFallback implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        System.out.println("<<<<<<<<<<<<<<<<<<" + name + ">>>>>>>>>>>>>>>>>>>>>>");
        return "error connection:" + name;
    }
}
