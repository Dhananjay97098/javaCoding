package practices.java.jay;

class Parent{
    int a=10;
}
class Child extends Parent{
    int a=20;
}
public class Main1 {
    public static void main(String[] args) {
        Parent p=new Child();
        System.out.println(p.a);
    }
}
