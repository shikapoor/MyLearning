/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        

        Scanner s = new Scanner(System.in);
        int firstNum = s.nextInt();                 // Reading input from STDIN
        int[]  inputArr = new int[firstNum];
        long sum = 0;
        for(int indx =0; indx < firstNum; indx++)
        {
        	inputArr[indx] = s.nextInt();
        	sum = sum + inputArr[indx];
        }
        
        

        
        System.out.println(sum/firstNum + 1);

    }
    
    static int gcd(int a, int b) 
    { 
        if (a == 0)  
            return b; 
          
        return gcd(b%a,a); 
    } 
    // method to calculate all common divisors 
    // of two given numbers 
    // a, b --> input integer numbers 
    static int commDiv(int a,int b) 
    { 
        // find gcd of a,b 
        int n = gcd(a, b); 
       
        // Count divisors of n. 
        int result = 0; 
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            // if 'i' is factor of n 
            if (n%i==0) 
            { 
                // check if divisors are equal 
                if (n/i == i) 
                    result += 1; 
                else
                    result += 2; 
            } 
        } 
        return result; 
    }
}
