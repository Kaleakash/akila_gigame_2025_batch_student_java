package staticexamples;

public class Employee {
    int id;  // non static
    static int deptId;
    final int A=100;
    final static int B=200;
    void dis1() {
        System.out.println("dis1");
        System.out.println("id "+id);
        System.out.println("deptId "+deptId);
        deptId= 600;
    }
    static void dis2() {
        System.out.println("dis2");
        //System.out.println(id);
        //Employee emp1 = new Employee();
        //System.out.println(emp1.id);
        System.out.println(deptId);
    }
}
