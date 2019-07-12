package Test;

public class Test04 {
    public static void main(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID);
    }
    String name = "No name";
    public Test04(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000"; // 类的成员变量
    public Employee(String id) {
        empID = id;
    }
}
