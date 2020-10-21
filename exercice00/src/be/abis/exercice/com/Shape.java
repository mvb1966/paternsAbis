package be.abis.exercice.com;

public abstract class Shape {
    private String color;
    public abstract double area();
    Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
