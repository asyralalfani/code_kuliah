import java.util.Scanner;

public class telp {
    public static void main(String[] args) {
        String no_hp, rincian = "";
        int len, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan No HP : ");
        no_hp = input.next();

        len = no_hp.length();
        for (int begin = 0; begin < len; begin++) {
            int end = begin + 1; 
            int subsNumber = Integer.parseInt(no_hp.substring(begin, end));

            rincian += " + " + subsNumber;
            total += subsNumber;
        }

        rincian = rincian.substring(2);

        System.out.println("Rincian penjumlahan adalah : " + rincian);
        System.out.print("Total penjumlahan adalah : " + total);
    }
}
