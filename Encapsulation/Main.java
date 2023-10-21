package encapsulation;
class Employee {
    private String name;
    private int Salary;
    //Getters-And-Setters
    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setSalary(int s){
        this.Salary=s;
    }
    public int getSalary(){
        return Salary;
    }
}
public class Main {
    public static void main(String[] args){
        Employee e = new Employee();
        e.setName("Deva"); //variable-name hidden.
        System.out.println(e.getName());
    }
}
