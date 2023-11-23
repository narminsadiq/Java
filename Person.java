public class Person {

     String ad;
     String soyad;
     String universitet;
     int yas;
    public Person(String ad, String soyad, String universitet, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.universitet = universitet;
        this.yas = yas;
    }
    public void display() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Universitet: " + universitet);
        System.out.println("Yash: " + yas);
    }

    public static void main(String[] args) {
        Person narmin = new Person("Nermin", "Sadiqli", "BDU", 26);
        narmin.display();
    }
}