import java.util.Scanner;

public class make_rectangle_triangle {
    public static void main(String[] args) {
        int sisi;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah sisi : ");
        sisi = input.nextInt();

        System.out.println("1. Persegi");
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < sisi; j++) {
                System.out.print(" ");
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("2. Segitiga");
        for (int i = 1; i <= sisi; i++) {
            for (int j = sisi; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print("x");
            }
            System.out.println();
        }
        
        input.close();
    }
}
