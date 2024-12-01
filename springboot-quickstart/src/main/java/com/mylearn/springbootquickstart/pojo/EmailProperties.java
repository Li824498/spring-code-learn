package com.mylearn.springbootquickstart.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "email")
public class EmailProperties {

//    @Value("${email.test}")
    private String test;

//    @Value("${email.test2}")
    private int test2;

    @Override
    public String toString() {
        return "EmailProperties{" +
                "test='" + test + '\'' +
                ", test2=" + test2 +
                '}';
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
