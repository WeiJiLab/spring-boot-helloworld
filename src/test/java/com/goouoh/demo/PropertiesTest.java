package com.goouoh.demo;

import com.goouoh.demo.comm.OtherProperties;
import com.goouoh.demo.comm.TestProperties;
import jakarta.annotation.Resource;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesTest {

    @Value("${test.name}")
    private String name;

    @Value("${test.name}")
    private String proper;

    @Resource
    private TestProperties testProperties;

    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testSingle() {
        System.out.println(name);
        Assert.assertEquals(name, "goouoh");
    }

    @Test
    public void testMore() throws Exception {
        System.out.println("name:" + testProperties.getName());
        System.out.println("description:" + testProperties.getDescription());
    }

    @Test
    public void testOther() throws Exception {
        System.out.println("team:" + otherProperties.getTeam());
        System.out.println("homepage:" + otherProperties.getHomepage());
    }
}
