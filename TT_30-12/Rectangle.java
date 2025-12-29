public class Rectangle {
    private int length,breadth;
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }    

    private int area(){
        return length*breadth;
    }

    private int perimeter(){
        return 2*(length+breadth);
    }

    public static void main(String[] args) {
        Rectangle rec=new Rectangle(3, 5);
        System.out.println("Length of rectangle : "+rec.length);
        System.out.println("Breadth of rectangle : "+rec.breadth);
        System.out.println("Area of rectangle : "+rec.area());
        System.out.println("Perimeter of rectangle : "+rec.perimeter());
    }

}
