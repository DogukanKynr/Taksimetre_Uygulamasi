import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int km;
        double kmFiyat = 2.20;
        double fiyat;
        double sonFiyat;
        double acilis = 10;

        System.out.println("Açışlış ücreti 10 liradır.");
        System.out.print("Kaç kilometre yol aldınız ? : ");
        km = input.nextInt();
        fiyat = km*kmFiyat;

        sonFiyat = (fiyat<20) ? 20 : fiyat;

        System.out.print("Fiyat : " + (sonFiyat+acilis));

    }
}