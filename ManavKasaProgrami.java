import java.util.Scanner;
/**
 * ManavKasaProgrami
 */
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14,a,elma = 3.67,e,domates = 1.11,d,muz = 0.95,m, patlıcan = 5,p,toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        a = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        e = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        d = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        m = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        p = input.nextDouble();
        toplam = armut * a + elma * e + domates * d + muz * m + patlıcan * p;
        System.out.println("Toplam Tutar : "+ toplam +" TL");


    }
}