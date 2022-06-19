
import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvOran2 = 0.08;
        Scanner intput = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = intput.nextDouble();

        double hesapkdv = (tutar * kdvOran);
        double hesapkdv2 = (tutar * kdvOran2);

        boolean kdvdusuk = tutar < 1000;

        double str = kdvdusuk ? (hesapkdv) : (hesapkdv2);
        double str2 = kdvdusuk ? (kdvOran) : (kdvOran2);

        double kdvliSonuc = ( str + tutar);

        System.out.println("KDV'siz Tutar: "+ tutar);
        System.out.println("KDV Oranı: "+ str2);
        System.out.println("Eklenecek KDV: "+ str);
        System.out.println("KDV'li Tutar: "+ kdvliSonuc);

    }
}
