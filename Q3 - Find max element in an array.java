import java.io.*; 
import java.util.*;
public class Sample{

    public static void main(String args[]){
 
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int A[] = new int[N];
    int m=0;
    for (int i = 0; i < N; i++) {
         A[i] = in.nextInt(); 
         if(m<A[i]) m=A[i];
    }
        System.out.println(m);
    }
}
