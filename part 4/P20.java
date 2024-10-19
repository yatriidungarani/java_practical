class Shape{
    public static void printShape(){
        System.out.println("This is shape.");
    } 
class Rectangle extends Shape{
    public static void printRectangle(){
        System.out.println("This is rectangular shape.");
    }
}

class Circle extends Shape{
    public static void printCircle(){
        System.out.println("This is circular shape.");
    }
}
class Square extends Rectangle{
    public static void printSquare(){
        System.out.println("Square is a rectangle");
    } 
}

public class P20 {
    public static void main(String[] args) {
        Square s=new Square();
        s.printShape();
        s.printRectangle();
        s.printSquare();
    }
}
