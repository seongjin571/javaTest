import java.util.Arrays;
import java.util.Scanner;
public class lotto {
    public static void main(String []args){

        System.out.println("로또 출력 횟수를 입력하세요.");
        Scanner lotto =new Scanner(System.in);
        int lotto_count=lotto.nextInt();
        for(int i=0; i<lotto_count; i++){
            System.out.println(i+1+"번째:"+making_number());
        }
    }
    static String making_number() {
        int[] array = new int[6];
        while (true) {
            for (int i = 0; i < 6; i++)
                array[i] = (int) (Math.random() * 45 + 1);
            if(check_number(array)==true)
                break;
        }
        return Arrays.toString(array);
    }
    static boolean check_number(int []arr){
        int[] all_number=new int[45];
        for(int j=0; j<6; j++){
            all_number[arr[j]-1]+=1;
            if(all_number[arr[j]-1]==2){
                return false;
            }
        }
        return true;
    }
}
