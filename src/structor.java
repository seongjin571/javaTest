class car{
    String color;
    int wheel;
    String size;
    car(){
        color="white";
        wheel=4;
        size="suv";
    }
    car(int a){
        this("white",a,"size");
    }
    car(String color, int wheel, String size ){
        this.color=color;
        this.wheel=wheel;
        this.size=size;
    }
    car(String[] a){
        this();
        for(int i=0; i<a.length; i++) {
            System.out.printf(a[i]+" ");
        }
        System.out.println();

    }
}
public class structor {
    public static void main(String[]args){
        car p1= new car();
        car p2= new car(8);
        car p3= new car("black",12,"compact");
        String[] arr={"하","히","후","해","호"};
        car p4=new car(arr);
        System.out.println(p1.color+" "+p1.wheel+" "+p1.size);
        System.out.println(p2.color+" "+p2.wheel+" "+p2.size);
        System.out.println(p3.color+" "+p3.wheel+" "+p3.size);

    }
}
