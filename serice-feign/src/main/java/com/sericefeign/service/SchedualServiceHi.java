package com.sericefeign.service;

import com.sericefeign.service.Impl.HystrixClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Dell
 * @date 2018/6/15 13:37
 */
@FeignClient(value = "service-hi", fallback = HystrixClientFallback.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
