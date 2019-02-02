import java.util.Random;
public class test1 {
    public static void main(String[] args) {
//        for (int j = 1; j < 10; j++) {
//            for (int i = 1; i < 10; i++) {
//                System.out.printf(j+"X"+i+"="+i*j+" ");
//                if(i==9)
//                    System.out.println();
//            }
//        }
        int[] a = new int[]{1,2,3,4};
        a[0]=3;
        a[1]=5;
        a[3]=13;
        a[2]=122;
        for(int i=0; i<4; i++){
            System.out.println(a[i]+" ");
        }

}
}