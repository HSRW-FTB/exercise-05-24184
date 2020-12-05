
public class Rectangle extends GeometricObject{

    double width  = 1;
    double height = 1;
    
    private Rectangle(){
    
    }
    
    public Rectangle(double width, double height){
      this.width =  width;
      this.height = height;
    
    }
    
    public double getArea(){
    return width*height;
    }
  
    public double getPerimeter(){
    return (width+height)*2;
    
    }

    public void changeColor(String color){

        super.setColor(color);

    }
  
  
  }
