package be.abis.exercice.com;

public class Rectangle extends Shape {
    private double height= 0l;
    private double width=0l;
    private String color="";
    Rectangle (double height, double width, String color){
        super(color);
        this.height = height;
        this.width= width;
        this.color = color;

    }

    public double area (){
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return super.getColor() ;
    }
}
