
import java.util.Scanner;

public class max2 {

    public static void main(String[] args) {
        float max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ededi daxil et: ");
        float eded1 = scanner.nextFloat();
        System.out.print("Ikinci ededi daxil et: ");
        float eded2 = scanner.nextFloat();
        System.out.print("Uchuncu ededi daxil et: ");
        float eded3 = scanner.nextFloat();
        if (eded1 >= eded2 && eded1 >= eded3) {
            max = eded1;
        } else if (eded2 >= eded1 && eded2 >= eded3) {
            max = eded2;
        } else {
            max = eded3;
        }
        System.out.print("Maximum eded: " + max);
    }
}
