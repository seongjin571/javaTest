import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lotto_set {
    public static void main(String []args){
        System.out.println("로또 번호를 추출할 횟수를 입력해주세요.");

        Scanner sc=new Scanner(System.in);
        int play_count=sc.nextInt();

        for(int i=1; i<=play_count; i++){
            System.out.println(i+"번째: "+making_lottonumber());
        }
    }

    static String making_lottonumber(){
        Set set = new HashSet();

        while(set.size() != 6){
            set.add((int)(Math.random() * 45 + 1));
        }

        return set.toString();
    }
}
