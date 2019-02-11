package com.practice;
class value_class{
    int a = 4;
    public int b = 6;
    protected int c = 8;
    private int d = 10;
    void private_int(){
        System.out.println(d);
    }
}
public class value_test {
    public static void main(String[] args) {
      value_class value= new value_class();
        System.out.println(value.a);
        System.out.println(value.b);
        System.out.println(value.c);
        value.private_int();
    }
}

