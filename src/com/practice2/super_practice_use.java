package com.practice2;
import java.util.Scanner;

public class super_practice_use {
    public static void main(String []args){
        System.out.println("원하시는 차를 선택해주세요.");
        Scanner car_type_choice=new Scanner(System.in);
        String car_type=car_type_choice.nextLine();
        super_practice_ab practice =new super_practice_ab(car_type);
        System.out.println("차 규격은 = "+practice.size(30)+"입니다.");
        System.out.println("가격은 = "+practice.cost+"만원입니다.");

        System.out.println();

        System.out.println("원하시는 차를 선택해주세요.");
        String car_type2=car_type_choice.nextLine();
        super_practice_ab practice2 =new super_practice_ab(car_type2);
        System.out.println("차 규격은 = "+practice.size(50)+"입니다.");
        System.out.println("가격은 = "+practice2.cost+"만원입니다.");
        System.out.println();
    }
}
