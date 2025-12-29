public class Employee {
    private int empid;
    private String ename;
    private double salary;

    public Employee(int empid,String ename,double salary){
        this.empid=empid;
        this.ename=ename;
        this.salary=salary;
    }

    private void salIncrement(){
        if(salary < 30000){
            salary=salary+(10*salary/100);
        }
    }

    private void display(){
        System.out.println("Id : "+empid+"\nName : "+ename+"\nSalary : "+salary);
    }


    public static void main(String[] args) {
        Employee employee1=new Employee(123, "Vishwa", 29000);
        Employee employee2=new Employee(143, "Sakshith", 35000);

        System.out.println("Employee details before increment");
        System.out.println("\nEmployee 1:");
        employee1.display();
        System.out.println("\nEmployee 2:");
        employee2.display();
        
        employee1.salIncrement();
        employee2.salIncrement();
        
        System.out.println("\nEmployee details After increment");
        System.out.println("\nEmployee 1:");
        employee1.display();
        System.out.println("\nEmployee 2:");
        employee2.display();
    }
}
