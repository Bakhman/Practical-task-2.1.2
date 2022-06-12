package com.bakhman.practical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean(HelloWorld.class);
        System.out.println(bean.getMessage());

        /*HelloWorld bean1 =
                applicationContext.getBean(HelloWorld.class);
        System.out.print(bean.getMessage() + " == " + bean1.getMessage() + " = ");
        System.out.println(bean.equals(bean1));

        Cat beanCat = applicationContext.getBean(Cat.class);
        System.out.print(beanCat.getAnimal()+" == ");
        Cat beanCat1 = applicationContext.getBean(Cat.class);
        System.out.print(beanCat1.getAnimal()+" = ");
        System.out.println(beanCat.equals(beanCat1));*/


    }
}