import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String []args){
            System.out.println("로또 번호를 추출할 횟수를 입력해주세요.");

            Scanner sc=new Scanner(System.in);
            int play_count=sc.nextInt();

            for(int i=1; i<=play_count; i++){
                System.out.println(i+"번째: "+making_lottonumber());
            }
}

        static String making_lottonumber(){
            int []arr=new int[6];
            while(true){
                for(int a=0; a<6;a++){
                    arr[a]=(int)(Math.random()*45+1);
                }

                // 배열 정렬
            Arrays.sort(arr);
            // 중복 체크
            if(checking_overlap(arr)==true){
                break;
            }
        }
        return Arrays.toString(arr);
    }

    static boolean checking_overlap(int []arr){
        int[]check_arr=new int[46];
        for(int i=0; i<6; i++){
            check_arr[arr[i]]+=1;
            if(check_arr[arr[i]]==2){
                return false;
            }
        }
        return true;
    }
}