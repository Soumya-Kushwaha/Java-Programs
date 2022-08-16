class Circle{
    double x, y, r;
    
    double Circumference(){
        return 2*3.14159*r;
    }
    
    double area(){
        return (22/7)*r*r;
    }
    
   Circle(double a, double b, double c)
    {
        x = a;
        y = b;
        r = c;
    }
}

public class NewMain {
    public static void main(String[] args) {
            Circle c1 = new Circle(3.0, 4.0, 5.0);
            Circle c2 = new Circle(4.0, 0.0, 10.0);
            
            System.out.println("Circumference of circle 1 = "+c1.Circumference());
            System.out.println("Area of circle 1 = "+c1.area());
            System.out.println("Circumference of circle 2 = "+c2.Circumference());
            System.out.println("Area of circle 2 = "+c2.area());
        // TODO code application logic here
    }
    
}
