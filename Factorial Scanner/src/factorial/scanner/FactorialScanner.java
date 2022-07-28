/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.scanner;
import java.util.Scanner;
 
/**
 *
 * @author manoj
 */
public class FactorialScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner value = new Scanner(System.in);
        System.out.println
                ("Enter number for factorial value");
        short num = value.nextShort();
        double a = 1;
        while (num>=1)
        {a=num*a;
        num--;}
        System.out.println("The factorial value =" + a);
        }
        }
        
        
    
   
    