import java.util.Scanner;

public class tekSayilar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massivin uzunlugunu daxil edin: ");
        int olcu = sc.nextInt();

        int[] massiv = new int[olcu];

        System.out.println("Massiv elementlerini daxil edin: ");
        for (int i = 0; i < olcu; i++) {
           System.out.print((i+1)+".ci elementi daxil edin: ");
            massiv[i] = sc.nextInt();
        }

        System.out.print("Tek elementler: ");
        for (int i = 0; i < olcu; i++) {
            if (massiv[i] % 2 != 0) {
                System.out.print(massiv[i] + " ");
            }
        }

    }
}
