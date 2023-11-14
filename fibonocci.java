import java.util.Scanner;
public class fibonocci {
    public static void main(String[] args) {
        System.out.print("Fibonacci sayisini daxil et ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int birinciEded = 0; 
        int ikinciEded = 1;
        int novbeti;
        int i = 0;
        while (i < N) {
            novbeti = birinciEded + ikinciEded;
            birinciEded = ikinciEded;
            ikinciEded = novbeti;
            i++;
             System.out.println(ikinciEded);

        }
     sc.close();
    }
    
}