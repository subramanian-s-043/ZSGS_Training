package polymorphism;
class A{
    int a=10;
}
public class Shadowing extends A{
    int a=20;
    public static void main(String[] args) {
        // System.out.println(a);//20
        // System.out.println(A.a);//10
        // System.out.println(Shadowing.a);//20
        A a1=new Shadowing();
        System.out.println(a1.a);//10
        Shadowing s=(Shadowing)a1;
        System.out.println(s.a);//20
    }
}