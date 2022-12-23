import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üslü sayının tabanını giriniz :");
        double taban = scanner.nextDouble();
        double result = 1;
        System.out.print("Üslü sayının üssünü giriniz :");
        double us = scanner.nextDouble();
        for (int i = 1; i <= us; i++) {
            result *= taban;
        }
        System.out.print("Üslü sonuc :" + (int) result);
        System.out.println();

        //şöyle de olabilirdi=============================
        double result2=Math.pow(taban,us);
        System.out.print("Mat.pow ile hesaplanan değer :"+(int)result2);


    }
}