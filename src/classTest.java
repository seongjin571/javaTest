import java.util.Scanner;
class Tv{
    int channel=20;
    boolean power=false;
    int volume=20;
    void power(){
        power=!power;
    }
    void channelUp(){
        volume++;
        System.out.println("현재 온도: "+volume);
    }
    void channelDown(){
        volume--;
        System.out.println("현재 온도: "+volume);
    }
    void powerControl(){
        System.out.println("전원 on-3");
        Scanner count = new Scanner(System.in);
        int count_int = count.nextInt();
        if(count_int==3){
            power();
        }
    }
}
public class classTest {

    public static void main(String []args){

        Tv remote = new Tv();
        remote.powerControl();
            while(remote.power) {
            System.out.println("온도 Up-1//온도 Down-2//전원 off-3");
            Scanner controller = new Scanner(System.in);
            int controller_number  = controller.nextInt();
            if(controller_number ==1){
                remote.channelUp();
            }
            else if(controller_number ==2){
                remote.channelDown();
            }
            else if(controller_number ==3){
                remote.power();
                System.out.println("전원이 종료 되었습니다.");
                remote.powerControl();
            }
            else{
                System.out.println("올바른 입력이 아닙니다.");
            }

        }

    }
}
