public class SadeEded {
    public static boolean sademi(int eded) {
        if (eded < 2) {
            return false;
        }
        for (int i = 2; i < eded; i++) {
            if (eded % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int baslangic = 10;
        int son = 35;

        System.out.print("Verilmis diapazona dusen sade ededler: ");
        for (int eded = baslangic; eded <= son; eded++) {
            if (sademi(eded)) {
                System.out.print(eded + " ");
            }
        }
    }

    
}
