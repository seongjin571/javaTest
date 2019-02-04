
import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String []args){
        System.out.printf("로또 번호를 출력할 횟수를 입력하세요.");
        Scanner count=new Scanner(System.in);
        int count_int=count.nextInt();
        System.out.println(count_int);
        for(int i=0; i<count_int; i++) {
//            System.out.println(i+"번째="+making());
        }
    }
//    static String making(){
//        int[] six_number= new int[6];
//        for(int arr=0; arr<6; arr++) {
//            six_number[arr] = (int) (Math.random() * 45) + 1;
//        }
//        if(check(six_number))
//        return Arrays.toString(six_number);
//    }
}



