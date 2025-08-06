package org.Shivam.Model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    int age;
    String name;
    String Gmail;
                                 //constructor injection
 /*   public Student(){}

    public Student(int age ,String name ,String Gmail){
      this.age = age;
      this.name = name;
      this.Gmail=Gmail;
    }*/

    List<String> subject;
    Map<String,Integer> marks;
    Set<Integer> set;

    Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", Gmail='" + Gmail + '\'' +
                ", subject=" + subject +
                ", marks=" + marks +
                ", set=" + set +
                ", address=" + address +
                '}';
    }
}

