import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double sonuc;
        String durum;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        sonuc = (matematik+fizik+kimya+turkce+tarih+muzik)/6;

        durum = (sonuc>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;

        System.out.println("Ortalama : " + sonuc);
        System.out.println(durum);

    }
}