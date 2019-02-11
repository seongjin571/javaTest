package com.practice2;
import java.util.Arrays;
public class super_practice_ab extends super_practice{
    String[] suv_color={"white","black","red"};
    String[] sedan_color={"white","black","red","blue"};
    String[] compact_color={"white","black","yellow"};
    String[] type_arr={"sedan","compact","suv"};
    int count=0;
    super_practice_ab(String type) {

        super(type);
        for(int j=0; j<type_arr.length; j++) {
            if (type_arr[j].equals(type)) {
                count = 1;
            }
        }
        if(count==1){
                System.out.println(type + "을 선택하셨습니다.");
                System.out.printf(type + "의 선택 하실 수 있는 색상은 = ");
                if (type.equals("sedan")) {
                    for (int i = 0; i < sedan_color.length; i++) {
                        if (i != sedan_color.length - 1)
                            System.out.printf(sedan_color[i] + " , ");
                        else {
                            System.out.println(sedan_color[i]);
                        }
                    }
                    cost = 3000;
                } else if (type.equals("suv")) {
                    for (int i = 0; i < suv_color.length; i++) {
                        if (i != suv_color.length - 1)
                            System.out.printf(suv_color[i] + " , ");
                        else {
                            System.out.println(suv_color[i]);
                        }
                    }
                    cost = 3200;
                } else if (type.equals("compact")) {
                    for (int i = 0; i < compact_color.length; i++) {
                        if (i != compact_color.length - 1)
                            System.out.printf(compact_color[i] + " , ");
                        else {
                            System.out.println(compact_color[i]);
                        }
                    }
                    cost = 2200;
                }
            }
        else{
            System.out.println("잘못 입력하셨습니다.");
            System.exit(0);
            }

        }



    int size(int size){
        this.size=size;
        return this.size;
    }

}
