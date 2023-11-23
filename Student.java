import java.util.Scanner;
public class Student {

     String ad;
    String soyad;
    String universitet;
    int yas;
    int imtahanNeticesi;

    public Student(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        Scanner scanner = new Scanner(System.in); System.out.print("Universiteti daxil edin: ");
        this.universitet = scanner.nextLine();
        System.out.print("Imtahan Neticesini daxil edin: ");
        this.imtahanNeticesi = scanner.nextInt();
    }

    public void display() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yas: " + yas);        
        System.out.println("Universitet: " + universitet);        
        System.out.println("Imtahan Neticesi: " + imtahanNeticesi);
    }
    public void showExamResultWithAlphabet() {
      
        System.out.println(ad + " " + soyad + ", siz imtahandan  " + getGrade(imtahanNeticesi) + " qiymeti almisiniz");
          if(imtahanNeticesi<51)
        {
            System.out.println("Siz, imtahandan kesilmisiniz");
        }
    }
    public char getGrade(int netice) {
        if (netice >90) {
            return 'A';
        } else if (netice>=81 && netice<=90) {
            return 'B';
        } else if (netice>=71 && netice<=80) {
            return 'C';
        } else if  (netice>=61 && netice<=70){
            return 'D';
        } else if (netice >=51 && netice<=60) {
            return 'E';
        }else {
            return 'F';
        }
    }
    public static void main(String[] args) {
       
        Student student = new Student("Nermin", "Sadiqli", 26);
        student.display();
        student.showExamResultWithAlphabet();
    }
}