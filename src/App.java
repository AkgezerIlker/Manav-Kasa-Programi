import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican, toplam;

        System.out.print("Kaç Kilo Armut Aldınız? ");
        armut = input.nextDouble();
        
        System.out.print("Kaç Kilo Elma Aldınız? ");
        elma = input.nextDouble();

        System.out.print("Kaç Kilo Domates Aldınız? ");
        domates = input.nextDouble();

        System.out.print("Kaç Kilo Muz Aldınız? ");
        muz = input.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldınız? ");
        patlican = input.nextDouble();

        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);

        System.out.println(
         " " +  armut + " KG Armut\n " + 
            elma + " KG Elma\n " +
            domates + " KG Domates\n " + 
            muz + " KG Muz\n " +
            patlican + " KG Patlıcan "
        );

        System.out.println("Toplam Alışveriş Tutarınız: " + toplam + " TL");
    }
}
