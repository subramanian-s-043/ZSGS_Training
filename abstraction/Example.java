package abstraction;

 class A{
    void display(){

    }
}
class B extends A
{
    void display(){
        System.out.print("Display");
    }
    void hello(){
        System.out.print("Hello");
    }
}
public class Example {
    public static void Main(String[] args)
    {
        A objB = new A();
        System.out.println(objB instanceof B);        
    }
    public static void some()
    {
        A objB = new B();
        // objB.equals(obj2);
        B obj3=(B)objB;
        obj3.hello();  /* To find the overwritten methods */        
    }
}
