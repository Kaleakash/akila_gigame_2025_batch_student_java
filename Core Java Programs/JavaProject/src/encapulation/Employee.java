package encapulation;

public class Employee {
    private int id;
    private String name;
    private float salary;
    Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        if(salary<0){
            this.salary = 8000;
        }else {
            this.salary = salary;
        }
    }
    Employee() {

    }
    public void setEmpInfo(int id, String name, float salary){
        this.id = id;
        this.name = name;
       // this.salary = salary;
        if(salary<0){
            this.salary = 8000;
        }else {
            this.salary = salary;
        }
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("id is "+id);
    }
}
