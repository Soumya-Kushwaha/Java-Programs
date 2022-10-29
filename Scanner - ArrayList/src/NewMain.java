import java.util.*;

public class NewMain {
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        float avg =0;
        
        ArrayList l = new ArrayList();
        System.out.println("Enter numeric input; alphabet to end! ");
        Scanner input = new Scanner (System.in);
        
        while(input.hasNextInt()){
            l.add(input.nextInt());
        }
        
         for (int i=0; i<l.size(); i++){
            sum = sum + (int) l.get(i);    
        }
         
         avg = sum/(l.size());
         System.out.println("Average: " + avg);
     }
    
       
}
