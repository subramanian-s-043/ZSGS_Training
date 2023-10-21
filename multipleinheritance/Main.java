package multipleinheritance;

class Duck extends Main implements Multiple { 
    public void walk() 
    { 
        System.out.println("Duck is walking."); 
    } 
  
    public void swim() 
    { 
        System.out.println("Duck is swimming."); 
    } 
} 
interface Multiple
{
    void walk();
    void swim();
};
public class Main {
    public static void main(String[] args){

    }
    static void Add(){
        System.out.print("Add Method");
    }
}

/*
 * In Muliti-level Inheritance, the object which is created for the class method will be exceuted.
 * In Mulitple Inheritance, there must be more than one parent.Parent may be interface
 */