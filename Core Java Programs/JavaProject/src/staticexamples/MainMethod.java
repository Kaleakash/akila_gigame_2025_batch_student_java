package staticexamples;

public class MainMethod {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.id=100;
        e2.id=200;
        e1.deptId=300;
        e2.deptId=400;
        Employee.deptId=500;
        e1.dis1();
        e2.dis1();

    }
}
