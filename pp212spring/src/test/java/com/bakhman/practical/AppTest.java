package com.bakhman.practical;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.bakhman.practical.AppConfig.class)
public class AppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        com.bakhman.practical.HelloWorld tree =
                applicationContext.getBean(com.bakhman.practical.HelloWorld.class);
        com.bakhman.practical.HelloWorld leaf =
                applicationContext.getBean(com.bakhman.practical.HelloWorld.class);

        com.bakhman.practical.Cat one = applicationContext.getBean(com.bakhman.practical.Cat.class);
        com.bakhman.practical.Cat two = applicationContext.getBean(com.bakhman.practical.Cat.class);

        Assert.assertSame("Тест провален, не корректная настройка бина com.bakhman.practical.HelloWorld", tree, leaf);
        Assert.assertNotSame("Тест провален, не корректная настройка бина Cat", one, two);
    }
}
