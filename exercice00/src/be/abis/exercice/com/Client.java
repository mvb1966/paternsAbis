package be.abis.exercice.com;

public class Client {
    public Client(){
        Rectangle rect = new Rectangle(5l,6l,"red");
        System.out.println("my " + rect.getColor() + " rectangele has an area off "+ rect.area());
        Circle circ = new Circle(5l,"green");
        System.out.println("my " + circ.getColor() + " circle has an area off "+ circ.area());

    }



    public static void main (String[] args){
        Client a = new Client();
    }
}
