public class basic_value {
    public static  void main(String[]args){
        int i=10;
        int k=10;
        int[] j={10};
        Test test =new Test();
        test.plus(i);
        System.out.println(i);
        test.plus2(i);
        System.out.println(test.plus2(k));
        test.plus3(j);
        System.out.println(j[0]);
    }
}
class Test{
    void plus(int x){
        x++;
    }
    public int plus2(int x){
        x++;
        return x;
    }
    public void plus3(int x[]){
        for(int i=0; i<x.length; i++){
            x[i]++;
        }
    }
}
