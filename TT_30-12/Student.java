
public class Student{
    private int id;
    private String name;
    private int marks;
    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    private void display(){
        System.out.println("Id : "+id+"\nName : "+name+"\nMarks : "+marks);
    }

    public static void main(String[] args) {
        Student std1=new Student(1,"Srineeth", 98);
        Student std2=new Student(2,"Saketh", 99);
        System.out.println("Student 1 :");
        std1.display();
        System.out.println("Student 2 :");
        std2.display();


        System.out.println("\nStudent with highest score");
        if(std1.marks > std2.marks){
            std1.display();
        }
        else if(std1.marks < std2.marks){
            std2.display();
        }else{
            std1.display();
            std2.display();
        }

    }
}