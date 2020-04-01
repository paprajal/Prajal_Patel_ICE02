/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import java.util.Scanner;

/**
 *
 * @author patel
 */
public class Ice4 {
    
 public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner(System.in); 
        String str = "testandbanana"; 
        int greatestVal = 0;
        char asChar = (char)greatestVal;
        System.out.println("The character with the highest ASCII (encoding) number was " + asChar + " (with ASCII (encoding) " + greatestVal + ")");
 
      String name = "Just for Testing";
        System.out.println("Max occurring character is " + 
                            getMaxOccuringChar(str)); 
        
        
    } 

    
    
    static final int ASCII_SIZE = 256;
  
   
    public static char getMaxOccuringChar(String str) 
    { 
        
        int count[] = new int[ASCII_SIZE]; 
       
        
        int len = str.length(); 
        for (int i=0; i<len; i++) 
            count[str.charAt(i)]++; 
       
        int max = -1;   
        char result = ' ';   
       
         
        for (int i = 0; i < len; i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                result = str.charAt(i); 
            } 
        } 
       
        return result; 
    } 
   
    public static String checkAscii(String name){
    
    int greatestVal = 0;

    for (int i = 0; i < name.length(); i++)
    {
    int curVal = (int)name.charAt(i);
    if(curVal > greatestVal)
        greatestVal = curVal;
    }
     return null;
    }

    private static void checkWord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void checkWord(char ch, Object par1){
        boolean isValid = true;

        if (isValid) {
            System.out.println("it is valid");
        } else {
            System.out.println("it is not valid");
        }
    
    }

     
    
}