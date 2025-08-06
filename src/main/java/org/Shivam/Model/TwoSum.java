package org.Shivam.Model;

public class TwoSum {
    int a;
    int b;

    TwoSum(){}

    TwoSum(int a , int b ){
        this.a= a;
        this.b= b;
        System.out.println("int int");
    }
    TwoSum(double a , double b){
        System.out.println("double double");
    }

    TwoSum(String a , String b){
        System.out.println("String String");
    }
}
