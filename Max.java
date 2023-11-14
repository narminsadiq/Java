public class Max {
     public static void main(String[] args) {
         int a = 5;
         int b = 8;
         int c = 3; 
         int max = a; 
         if (b > max) {
             max = b; 
         }
         if (c > max) {
             max = c; 
         }
         System.out.println("Maksimum eded: " + max);
     }
 }