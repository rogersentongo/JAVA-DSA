/*
 * 
 */
package com.rntongo.iterationtorecursion;

/**
 *
 * @author rogersentongo
 */
public class RecursiveClass {
    
    //Recursive function that calculates the number of digits in a number
    public static int countDigits(int n){
        
        //Base case is when n ==1 we return 1
        if(n<=0)
        {
            return 0;
        } else{
            //We havent reached base case so recursive call
            return 1+countDigits(n/10);
            //Why do we divide by 10, it cuts off the last digits from number
        }
        
    }
    
    
    public static void main(String[] args) {
        
        int input = 22345;
        
        int numDigits = countDigits(input);
        
        System.out.println("The number of digits contained in "+input+" is "+numDigits);
        
    }
    
}
