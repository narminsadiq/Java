public class ededinHerfiTesviri {
    public static void main(String[] args) {
        int number = 67;
        String ededicevir = cevir(number);
        System.out.println(ededicevir);
    }
    
    public static String cevir(int number) {
        String word;
        switch (number) {
            case 1:
                word = "bir";
                break;
            case 2:
                word = "iki";
                break;
            case 3:
                word = "uc";
                break;
            case 4:
                word = "dord";
                break;
            case 5:
                word = "bes";
                break;
            case 6:
                word = "alti";
                break;
            case 7:
                word = "yeddi";
                break;
            case 8:
                word = "sekkiz";
                break;
            case 9:
                word = "doqquz";
                break;
            case 10:
                word = "On";
                break;
            case 20:
                word = "Iyirmi";
                break;
            case 30:
                word = "Otuz";
                break;
            case 40:
                word = "Qirx";
                break;
            case 50:
                word = "Elli";
                break;
            case 60:
                word = "Altmis";
                break;
            case 70:
                word = "Yetmiş";
                break;
            case 80:
                word = "Seksen";
                break;
            case 90:
                word = "Doxsan";
                break;
            default:
                int teklik= number % 10;
                int onluq = number - teklik;
                word = cevir(onluq) + " " + cevir(teklik);
                break;
        }
        return word;
    }
}