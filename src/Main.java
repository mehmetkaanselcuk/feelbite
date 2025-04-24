import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        n1 = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nSeciminizi yapiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama: " + (n1 + n2));
                break;
            case 2:
                System.out.print("Cikarma: " + (n1 - n2));
                break;
            case 3:
                System.out.print("Carpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print("Bolme: " + (n1 / n2));
                } else {
                    System.out.print("Bir sayi sifira bolunemez.");
                }
                break;
            default:
                System.out.print("Gecersiz secim.");
        }
    }
}
