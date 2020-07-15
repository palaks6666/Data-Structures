import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner in = new Scanner(System.in); 
        int N = in.nextInt(); 
        int d = in.nextInt(); 
        
        int A[] = new int[N]; 
        int shift = N-d; 
        for (int i = shift; i < N; i++) { 
            A[i] = in.nextInt(); 
        }
        for (int i = 0; i < shift; i++) { 
            A[i] = in.nextInt(); 
        }
        
        for (int i = 0; i < N; i++) { 
            System.out.print(A[i] + " "); 
        }
    }
}
