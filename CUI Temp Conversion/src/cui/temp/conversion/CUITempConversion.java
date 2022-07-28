
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cui.temp.conversion;
import java.util.Scanner;

/**
 *
 * @author manoj
 */
public class CUITempConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double con_val = 0, fah, cel;
        Scanner sc = new Scanner(System.in);
        System.out.println("To convert Fahrenheit: Press 1"
                + "\n" + "OR"
                + "\n" + "To convert Celsius temperature: Press 2");
        double temp =sc.nextDouble();
       
        
        if (temp==1)
        {System.out.println("Please enter Fahrenheit value :");
        con_val = sc.nextDouble();
        cel = (con_val - 32) * 5/9;
        System.out.println("The Celsius conversion of entered value is :" + cel);}

        else 
        {System.out.println("Please enter Celsius value ;");
        con_val = sc.nextDouble();
        fah = (con_val * 9/5) + 32;
        System.out.println("The Fahrenheit conversion of entered value is :" + fah);}
        
        }
    }
                
    
    

