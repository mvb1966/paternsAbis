package be.abis.exercice.com;

import java.util.ArrayList;

public class Client {
    public Client(){
        Point origin = new Point(2,8);
        Rectangle rect = new Rectangle(5l,6l,"red");
        System.out.println("my " + rect.getColor() + " rectangele has an area off "+ rect.area());
        Circle circ = new Circle(5l,"green");
        System.out.println("my " + circ.getColor() + " circle has an area off "+ circ.area());
        Shape shape = new Rectangle(12l,12l, "black");
        System.out.println("my " + shape.getColor() + " shape has an area off "+ shape.area());
        ArrayList <Shape> list = new ArrayList<Shape>();
        list.clear();
        list.add(shape);
        list.add(rect);
        list.add(circ);
        for (Shape s : list){
            System.out.println("my " + s.getColor() + " area off " + s.area());
        }
    }



    public static void main (String[] args){
        Client a = new Client();
    }
}
