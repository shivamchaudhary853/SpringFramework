package org.Shivam.beaninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/Shivam/beaninheritance/bconfig.xml");
        Employee employee = applicationContext.getBean("emp1",Employee.class);
        System.out.println(employee);
    }
}
