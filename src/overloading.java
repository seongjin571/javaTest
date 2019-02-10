class practice{
    int one;
    int two;
    void overloading_method(){
        System.out.println("오버로드 practice");
    }
    public int overloading_method(int a){
        return a;
    }
    public int overloading_method(int a, int b){
        one=a;
        two=b;
        return one+two;
    }
    public String overloading_method(String a[]){
        String result="+";
        for(int i=0; i<a.length; i++) {
            result=result+a[i]+"+";
        }
        return result;
    }
}
public class overloading {
    public static void main(String[]args){
        practice p1=new practice();
        practice p2=new practice();
        practice p3=new practice();
        practice p4=new practice();
        p1.overloading_method();
        String[] arr={"가","나","다","라"};
        System.out.println(p2.overloading_method(5));
        System.out.println(p3.overloading_method(3,6));
        System.out.println(p4.overloading_method(arr));

    }
}
