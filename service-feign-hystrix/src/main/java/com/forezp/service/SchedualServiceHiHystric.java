package com.forezp.service;

import org.springframework.stereotype.Component;

/**
 * Created by ZhaGuolong on 2018/1/19.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
