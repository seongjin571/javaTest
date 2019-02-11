package com.practice2;

public class super_practice_use {
    public static void main(String []args){
        super_practice_ab practice =new super_practice_ab("sedan");
        System.out.println("차 규격은 = "+practice.size(30)+"입니다.");
        System.out.println();

        super_practice_ab practice2 =new super_practice_ab("suv");
        System.out.println("차 규격은 = "+practice2.size(50)+"입니다.");
        System.out.println();
    }
}
