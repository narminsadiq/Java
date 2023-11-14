import java.util.Scanner;
public class kvadrat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Bir tam ədəd daxil edin: ");
        int N = sc.nextInt();
        int i = 0;
        while (i< N) {
            System.out.print(i * i + " ");
            i++;
        }
    }
}