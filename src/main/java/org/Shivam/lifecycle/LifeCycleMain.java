package org.Shivam.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/Shivam/lifecycle/lifecycleconfig.xml");
        LifeCycle lc = applicationContext.getBean("lc", LifeCycle.class);
        applicationContext.registerShutdownHook();
        System.out.println(lc);
        LifeCycle.doDBoperation();
    }

}
