import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double alan ;
        double cevre ;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yari çapi giriniz");
        r = inp.nextInt();

        alan = (pi*r*r) ;
        System.out.println("Daire Alanı :" + alan);

        cevre = 2*pi*r ;
        System.out.println("Daire Çevresi :" + cevre);
    }
}