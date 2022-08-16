import java.io.*;

public class NewMain {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Float principal = new Float(0);
        Float rate = new Float(0);
        int years = 0;
        
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        
        System.out.println("Enter Principal: ");
        System.out.flush();
        tempString = in.readLine();
        principal = Float.valueOf(tempString);
        
        System.out.println("Enter Rate:: ");
        System.out.flush();
        tempString = in.readLine();
        rate = Float.valueOf(tempString);
        
        System.out.println("Enter Years: ");
        System.out.flush();
        tempString = in.readLine();
        years = Integer.parseInt(tempString);
 
        float interestTotal = (principal * rate * years)/100;
        System.out.println("Total Interest = " + interestTotal);
    }
    
}
