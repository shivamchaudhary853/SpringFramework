package org.Shivam;


import org.Shivam.Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
       /* Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student); */
        Student student = applicationContext.getBean("student",Student.class);
        System.out.println(student);
    }
}


