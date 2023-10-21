package multipleinheritance;
class Employee{
    String name;
    int empId;
}
class Personal extends Employee{
    String fatherName;
    String address;
}
public class Example2 {
    public static void main(String[] args)
    {
        Employee arunEmployee = new Personal();
        // arunEmployee.fatherName = "test";
    }
}
