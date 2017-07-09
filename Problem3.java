/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

/**
 *
 * @author Hesham Mostafa
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("the large prime factor = " + new Problem3().Run());
        
    }

public String Run()
{
   long n = 24L;
		while (true) {
			long p = SmallestFactor(n);
			if (p < n)
				n /= p;
			else
				return Long.toString(n);
		}
	}

    


    private long SmallestFactor(long n) {
       
        if(n<=1)throw new IllegalArgumentException();
        {
        
        for(long i=2,end=(long)Math.sqrt(n);i<=end;i++)
        {
        if(n%i==0)
        {
        return i;
        }
        }
        }        
        return n;
        
    }


}
    
    
    


