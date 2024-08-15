package com.perscholas.dependencyinjectionlab.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices{
    @Override
    public String getFortune() {
        return "Database connection";
    }
}
