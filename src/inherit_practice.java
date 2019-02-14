class Car{
    int a;
    public void run(){
        System.out.println("부모");
    }
    public void size(){
        System.out.println("부모2");
    }
}
class Bus extends Car{
    public void run() {
        super.run();
        System.out.println("자식");
    }
}
public class inherit_practice {
    public static void main(String[] args) {
        Car id = new Bus();
        id.run();
    }
}