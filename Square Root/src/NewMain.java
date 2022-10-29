import java.lang.*;

class Calculator{
    double i;
    double x;


    void calc(){
        x = Math.sqrt(i);
        System.out.println("Square root of " + i + " is " + x);
    }
}
public class NewMain {
    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        c.i = 36;
        c.calc();
    }
    
}
