/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Hesham Mostafa
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println(new Problem1().p1());
    }
    
    public String p1()
    {
    int sum=0;
    for(int i=0;i<1000000000;i++)
    {
    if(i%3==0||i%5==0)
    {
    sum+=i;
    }
    }
        return Integer.toString(sum);
        
   }
   
}

