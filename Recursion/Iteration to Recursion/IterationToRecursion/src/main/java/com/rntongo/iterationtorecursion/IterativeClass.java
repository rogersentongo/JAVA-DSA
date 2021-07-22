/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rntongo.iterationtorecursion;

/**
 *
 * @author rogersentongo
 */
public class IterativeClass {
    
    //Iterative function that calculates the number of digits in a number
    public static int countDigits(int n){
        
        int count=0;
        
        //Use a while loop until n=0;
        while(n!=0)
        {
            n= n/10;
            count++;
        }
        
        return count;
       
    }
    
    
    public static void main(String[] args) {
        
        int input = 12345;
        
        int numDigits = countDigits(input);
        
        System.out.println("The number of digits contained in "+input+" is "+numDigits);
        
    }

    
    
    
    
}
