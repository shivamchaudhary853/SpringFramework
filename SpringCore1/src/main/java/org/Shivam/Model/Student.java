package org.Shivam.Model;

public class Student {
    int age;
    String name;
    String Gmail;

    public Student(){}

    public Student(int age ,String name ,String Gmail){
      this.age = age;
      this.name = name;
      this.Gmail=Gmail;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", Gmail='" + Gmail + '\'' +
                '}';
    }
}
