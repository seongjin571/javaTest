class car{
    String color;
    int wheel;
    String size;
    car(){
        System.out.println("생성자");
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
}
public class structor {
    public static void main(String[]args){
        car p1= new car();
        car p2= new car(8);
        car p3= new car("black",12,"compact");
        System.out.println(p1.color+" "+p1.wheel+" "+p1.size);
        System.out.println(p2.color+" "+p2.wheel+" "+p2.size);
        System.out.println(p3.color+" "+p3.wheel+" "+p3.size);

    }
}
