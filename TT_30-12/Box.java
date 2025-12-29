public class Box {
    private int length,width,height;

    public Box(int length,int width,int height){
        this.height=height;
        this.length=length;
        this.width=width;
    }

    private int volume(){
        return length*width*height;
    }

    private void display(){
        System.out.println("Length : "+length+"\nWidth : "+width+"\nHeight : "+height);
    }

    public static void main(String[] args) {
        Box box1=new Box(3, 6, 9);
        Box box2=new Box(4, 7, 10);

        System.out.println("Box 1 : ");
        box1.display();
        System.out.println("\nBox 2 : ");
        box2.display();

        System.out.println("\nVolume of box 1 : "+box1.volume());
        System.out.println("Volume of box 2 : "+box2.volume());

        if(box1.volume() > box2.volume()){
            System.out.println("\nBox 1 contains higher volume than box 2");
        }
        else if(box1.volume() < box2.volume()){
            System.out.println("\nBox 2 contains higher volume than box 1");
        } 
        else{
            System.out.println("\nBox boxes contains equal volumes");
        }
    }
}
