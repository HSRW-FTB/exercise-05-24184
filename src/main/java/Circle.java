
public class Circle {
    double radius = 1;

    Circle(){}

    public double getArea(){

        return (Math.PI * (radius * radius));

    }


    public double getPerimeter(){

        return (Math.PI * radius * 2);

    }


    public void setRadius(double radius){

        this.radius = radius;

    }


    public void printCircle(){

        System.out.println("The circle is created with the radius: " + radius);

    }


    public String toString(){

        return "Circle: radius = " +radius;
    }
}
