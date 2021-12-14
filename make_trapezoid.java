import java.util.Scanner;

public class make_trapezoid {
    public static void main(String[] args) {
        int alas, tinggi;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas : ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();
        
        for (int i = 0; i < tinggi; i++) {
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= alas - i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        
        input.close();
    }    
}
