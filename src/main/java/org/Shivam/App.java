package org.Shivam;


import org.Shivam.Model.Address;
import org.Shivam.Model.Student;
import org.Shivam.Model.TwoSum;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

                               //setter injection
       Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
                               //constructor injection
       /* Student student = applicationContext.getBean("student",Student.class);
        System.out.println(student);*/

        //TwoSum twoSum = (TwoSum)applicationContext.getBean("twosum");

    }
}


