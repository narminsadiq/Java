public class Min {
     public static void main(String[] args) {
         int a = 5;
         int b = 8;
         int c = 3; 
         int min = a; 
         if (b < min) {
             min = b; 
         }
         if (c < min) {
             min = c; 
         }
         System.out.println("Minimum eded: " + min);
     }
 }