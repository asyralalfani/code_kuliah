import java.util.Scanner;

public class count_grade {
    //method to count percentation 
    static int countPercentation(int nilai, String type) {
        int percent = 0;
        if (type == "personal") {
            percent = 15;
        } else if (type == "kelompok" || type == "kuis") {
            percent = 10;
        } else {
            percent = 30;
        }
        nilai = (percent * nilai) / 100;
        return nilai;
    }
    //method to set grade 
    static String setGrade(int nilai) {
        String grade;
        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 75 && nilai <= 84){
            grade = "B";
        } else if (nilai >= 65 && nilai <= 74){
            grade = "C";
        } else if (nilai >= 50 && nilai <= 64){
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    public static void main(String[] args) {
        // initial for input scanner
        Scanner input = new Scanner(System.in);

        //inital variable for input
        int tp1, tp2, tk1, tk2, kuis1, kuis2, uas, total_nilai;
        String grade;
        
        System.out.println("========== Masukkan Nilai ==========");
        System.out.print("Nilai Tugas Personal 1 : ");
        tp1 = input.nextInt();
        System.out.print("Nilai Tugas Personal 2 : ");
        tp2 = input.nextInt();
        System.out.print("Nilai Tugas Kelompok 1 : ");
        tk1 = input.nextInt();
        System.out.print("Nilai Tugas Kelompok 2 : ");
        tk2 = input.nextInt();
        System.out.print("Nilai Kuis 1 : ");
        kuis1 = input.nextInt();
        System.out.print("Nilai Kuis 2 : ");
        kuis2 = input.nextInt();
        System.out.print("Nilai Ujian Akhir Semester : ");
        uas = input.nextInt();

        //count every value from input
        tp1 = countPercentation(tp1, "personal");
        tp2 = countPercentation(tp2, "personal");
        tk1 = countPercentation(tk1, "kelompok");
        tk2 = countPercentation(tk2, "kelompok");
        kuis1 = countPercentation(kuis1, "kuis");
        kuis2 = countPercentation(kuis2, "kuis");
        uas = countPercentation(uas, "uas");

        total_nilai = tp1 + tp2 + tk1 + tk2 + kuis1 + kuis2 + uas;
        grade = setGrade(total_nilai);

        System.out.println("========== Hasil Perhitungan Nilai ==========");
        System.out.println("Nilai Total : " + total_nilai);
        System.out.print("Grade : " + grade);
    }
}
