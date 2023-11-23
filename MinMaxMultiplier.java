import java.util.Scanner;
public class MinMaxMultiplier {
     public static void multiplyMaxMin(short a, short b, short c) {
         short max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
         short min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
         int result = max * min;
         System.out.println("Netice: " + result);
     }
     public static void multiplyMaxMin(int a, int b, int c) {
         int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
         int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
         int result = max * min;
         System.out.println("Netice: " + result);
     }
     public static void multiplyMaxMin(float a, float b, float c) {
         float max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
         float min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
         float result = max * min;
         System.out.println("Netice: " + result);
     }
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Birinci eded: ");
         int num1 = scanner.nextInt();
         System.out.print("Ikinci eded: ");
         int num2 = scanner.nextInt();
         System.out.print("Ucuncu eded: ");
         int num3 = scanner.nextInt();
         multiplyMaxMin(num1, num2, num3);
     }  
}
