import java.util.Scanner;

/**
 * index
 */
public class count_kwh {
    public static void main(String[] args) {
        // deklarasi variable
        Scanner input = new Scanner(System.in);
        int no_pelanggan, total_kwh, biaya_per_kwh, biaya_per_sisa_kwh, biaya_total_kwh, biaya_sisa_kwh, kwh_pertama,sisa_kwh;
        String nama_pelanggan;

        //set variable
        kwh_pertama = 100;
        biaya_per_kwh = 1500;
        biaya_per_sisa_kwh = 1200;
        biaya_total_kwh = 0;
        biaya_sisa_kwh = 0;
        sisa_kwh = 0;

        System.out.println("=============== Data Pelanggan ===============");
        
        System.out.println("Masukkan Nomor Pelanggan : ");
        no_pelanggan = input.nextInt();

        System.out.print("Masukkan Nama : ");
        nama_pelanggan = input.next();

        System.out.print("Masukkan Total kWh : ");
        total_kwh = input.nextInt();

        if (total_kwh <= kwh_pertama) {
            biaya_total_kwh = total_kwh * biaya_per_kwh;
        } else if (total_kwh > kwh_pertama) {
            biaya_total_kwh = kwh_pertama * biaya_per_kwh;
            sisa_kwh = total_kwh - kwh_pertama;

            biaya_sisa_kwh = sisa_kwh * biaya_per_sisa_kwh;
            biaya_total_kwh += biaya_sisa_kwh;
        }
        
        System.out.println("\n\n=============== Rincian Biaya =================");

        System.out.println("Pelanggan atas nama " + nama_pelanggan + " dengan nomor pelanggan " + no_pelanggan + " dengan rincian sebagai berikut : ");

        kwh_pertama = (sisa_kwh != 0) ? kwh_pertama : total_kwh;

        System.out.println("Total kWh : " + total_kwh + " kWh");
        System.out.println("kWh Pertama: " + kwh_pertama + " kWh");
        System.out.println("kWh Sisa: " + sisa_kwh + " kWh");
        System.out.println("Total kWh Pertama: Rp. " + kwh_pertama * biaya_per_kwh);
        System.out.println("Total kWh Sisa: Rp. " + biaya_sisa_kwh);
        System.out.println("Total Biaya : Rp. " + biaya_total_kwh);

        input.close();
        
    }
}