package be.abis.exercice.com;

public class Circle extends Shape{
    private double radius;
    private String color = "";
    Circle (double radius, String color ){
        super(color);
        this.radius = radius;
        this.color = color;
    }
    public double area (){
        double area = Math.PI * 2 * radius * 2 * radius / 4;
        return area;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
