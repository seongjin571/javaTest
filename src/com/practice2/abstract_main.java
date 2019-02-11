package com.practice2;

public class abstract_main {
    public static void main(String []args){
        abstract_use practice =new abstract_use();
        practice.bird();
        practice.fly();
        practice.size(100,50);
        System.out.println(practice.height+"  "+practice.weight);
    }
}
