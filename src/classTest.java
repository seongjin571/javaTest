import java.util.Scanner;
class Tv{
    int channel=17;
    boolean power=false;
    int volume=10;
    void power(){
        power=!power;
    }
    void channelUp(){
        volume++;
        System.out.println("채널은: "+volume);
    }
    void channelDown(){
        volume--;
        System.out.println("채널은: "+volume);
    }
    void powerControl(){
        System.out.println("전원 버튼-3");
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
            System.out.println("채널 Up-1//채널 Down-2//전원 버튼-3");
            Scanner channel = new Scanner(System.in);
            int channel_int = channel.nextInt();
            if(channel_int==1){
                remote.channelUp();
            }
            else if(channel_int==2){
                remote.channelDown();
            }
            else if(channel_int==3){
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
