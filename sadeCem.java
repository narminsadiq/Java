import java.util.Scanner;
public class sadeCem 
{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Massiv uzunlugunu daxil edin: ");
        int n = scanner.nextInt();  
        System.out.println(n + " eded daxil edin: ");
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
          System.out.print((i+1)+".ci elementi daxil edin: ");
          massiv[i] = scanner.nextInt();
        }
        int cem = 0;
        for (int i = 0; i < n; i++) {
          if (sademi(massiv[i])) {
            cem += massiv[i];
        }
    }
    System.out.println("sade ededlerin cemi: " + cem);
}
         public static boolean sademi(int eded) {
              if (eded < 2) {
                  return false;
              }
              for (int j = 2; j < eded; j++) {
                  if (eded % j == 0) {
                      return false;
                  }
              }
              return true;
          }
} 
      