/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author Hesham Mostafa
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("the sum of even nubemer in fib = "+new Problem2().Fib());
    }
    public String Fib()
    {
     int x=1;
     int y=2;
     int sum=0;
     while(x<=4000000)
     {
     
         if(x%2==0){
         sum+=x;
         }
         
         
        int  z=x+y;
         x=y;
         y=z;
         
     
     } 
        
        
        
        
        return Integer.toString(sum);
    
    
    
    }
}
