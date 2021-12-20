import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai anda : ");
        int nilai = input.nextInt();
        String status = nilai > 75 ? "Lulus" : "Gagal";
        System.out.print(status);
        
        input.close();
    }
}
