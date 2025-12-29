public class Book {
    private String title;
    private double price;

    public Book(String title,double price){
        this.title=title;
        this.price=price;
    }

    private void display(){
        System.out.println("Title : "+title+"\nPrice : "+price);
    }

    public static void main(String[] args) {
        Book b1=new Book("Java", 500);
        Book b2=new Book("Python",300);
        Book b3=new Book("Kotlin",400);

        System.out.println("\nBook 1 : ");
        b1.display();
        System.out.println("\nBook 2 : ");
        b2.display();
        System.out.println("\nBook 3 : ");
        b3.display();

        System.out.println("\nCostliest Book :");

        if(b1.price > b2.price && b1.price > b3.price){
            b1.display();
        }
        else if(b2.price > b3.price){
            b2.display();
        }
        else{
            b3.display();
        }
    }
}
