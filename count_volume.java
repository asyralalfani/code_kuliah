import java.util.Scanner;

public class count_volume {
    static String [] question = {"tabung", "balok", "bola"};
    static Scanner input = new Scanner(System.in);

    static void global_count (int choose) {
        
        String [][] ques = { {"jari-jari", "1,3"}, {"panjang", "2"}, {"lebar", "2"}, {"tinggi", "1,2"} };
        String param = "";
        double volume = 0, luas = 0, phi = 3.14;

        for (int i = 0; i < ques.length; i++) {
            if (ques[i][1].indexOf(",") == -1 && choose == Integer.parseInt(ques[i][1])) {
                System.out.print("Masukkan " + ques[i][0] + " " + question[choose-1]  + " : ");
                double number = input.nextDouble();
                param += "," + String.valueOf(number); 
            } else {
                String [] display = ques[i][1].split(",");
                for (int j = 0; j < display.length; j++) {
                    if (choose == Integer.parseInt(display[j])) {
                        System.out.print("Masukkan " + ques[i][0] + " " + question[choose-1]  + " : ");
                        double number = input.nextDouble();
                        param += "," + String.valueOf(number); 
                    }
                }  
            }
        }

        param = param.substring(1);
        String [] param_split = param.split(",");
        if (choose == 1) {
            double jari = Double.parseDouble(param_split[0]);
            double tinggi = Double.parseDouble(param_split[1]);
            volume = 2 * jari * jari * tinggi; 
            luas =  2 * phi * jari * (jari + tinggi); 
        } else if (choose == 2) {
            double panjang = Double.parseDouble(param_split[0]);
            double lebar = Double.parseDouble(param_split[1]);
            double tinggi = Double.parseDouble(param_split[2]);
            volume = panjang * lebar * tinggi; 
            luas =  (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi); 
        } else {
            double jari = Double.parseDouble(param_split[0]);
            volume = 4/3 * phi * jari * jari * jari; 
            luas =  4 * phi * jari * jari; 
        }
        
        System.out.println("================== HASIL ===================");
        System.out.println("Volume " + question[choose-1] + " : " + volume);
        System.out.println("Luas permukaan " + question[choose-1] + " : " + luas);
    }

    public static void main(String[] args) {
        String loop = "y";

        while (loop.equals("y")) {
            System.out.println("\n***************** MENU *********************");
            for (int i = 0; i < question.length; i++) {
                int j = i + 1;
                System.out.println(j + ". Hitung luas permukaan dan volume " + question[i]);
            }
            System.out.println("4. Keluar");
            System.out.println("============================================");
            System.out.print("Pilihan [1/2/3/4] = ");
            int choose = input.nextInt();
            System.out.println("============================================");
            
            if (choose == 1 ||  choose == 2 || choose == 3) {
                global_count(choose);
            } else {
                System.out.println("Anda berhasil keluar program");
                System.exit(0);
            }

            System.out.println("============================================");
            System.out.print("Apakah anda ingin mengulang (y/t)? ");
            loop = input.next();
        }

        input.close();
    }
}