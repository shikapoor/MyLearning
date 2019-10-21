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

class TestClass2 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
       

        */

        Scanner s = new Scanner(System.in);
        int firstNum = s.nextInt();                 // Reading input from STDIN
        int secondNum = s.nextInt(); 
//        int limit = 1;
//        if(firstNum > secondNum)
//          limit = secondNum / 2;
//        else
//          limit = firstNum / 2;
//          
//        int count = 1;
//        for(int indx = 2; indx <= limit; indx++)
//        {
//            if((firstNum % indx == 0) && (secondNum % indx == 0))
//            {
//                count++;
//            }
//        }
        
        System.out.println(commDiv(firstNum, secondNum));

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
