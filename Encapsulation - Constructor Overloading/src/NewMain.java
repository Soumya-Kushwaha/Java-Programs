class Circle{
    double x, y, r;
    
    Circle(double x, double y, double r){
       this.x = x; this.y = y; this.r = r;
    }
    
    Circle(double r){
        x=0; y=0; this.r = r;
    }
    
     Circle(Circle c){
        x=c.x;  y=c.y; r=c.r;
    }
     
     Circle(){
         x=0.0; y=0.0; r=1.0;
     }
     
     double Circumference(){
        return 2*3.14159*r;
    }
    
    double area(){
        return (22/7)*r*r;
    }
}
    
public class NewMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, 4.0, 5.0);
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(c1);
        Circle c4 = new Circle();
        
        System.out.println("Circumference of circle 1 = "+c1.Circumference());
        System.out.println("Area of circle 1 = "+c1.area());
        
        System.out.println("Circumference of circle 2 = "+c2.Circumference());
        System.out.println("Area of circle 2 = "+c2.area());
        
        System.out.println("Circumference of circle 3 = "+c3.Circumference());
        System.out.println("Area of circle 3 = "+c3.area());
        
        System.out.println("Circumference of circle 4 = "+c4.Circumference());
        System.out.println("Area of circle 4 = "+c4.area());
        // TODO code application logic here
    }
    
}
