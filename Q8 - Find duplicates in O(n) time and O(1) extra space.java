// class Main
// { 
//     void checkRepeat(int arr[], int size) 
//     { 
//         int i;   
//         System.out.println("Repeating Elements are : "); 
     
//         for (i = 0; i < size; i++) 
//         { 
//             if (arr[ Math.abs(arr[i])] >= 0) 
//                 arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
//             else
//                 System.out.print(Math.abs(arr[i]) + " "); 
//         }          
//     }  
  
//     public static void main(String[] args)  
//     { 
//         Main main = new Main(); 
//         int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
//         int arr_size = arr.length; 
  
//         main.checkRepeat(arr, arr_size); 
//     } 
// } 
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.print("Repeating Elements are : "); 
    HashSet<Integer> numbers = new HashSet<Integer>();
    Scanner scan=new Scanner(System.in);
    int size = scan.nextInt();
    for(int i = 1; i <= size; i++) {
      int current=scan.nextInt();
      if(numbers.contains(current)) {
        System.out.print(current + " ");
      } else {
        numbers.add(current);
      }
    }
  }
}
