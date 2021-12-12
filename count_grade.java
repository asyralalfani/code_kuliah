import java.util.Scanner;

public class count_grade {
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
        Scanner input = new Scanner(System.in);
        int total_nilai = 0;
        String grade;
        String [][] answer = {
            {"Nilai Tugas Personal 1 : ", "personal"},
            {"Nilai Tugas Personal 2 : ", "personal"},
            {"Nilai Tugas Kelompok 1 : ", "kelompok"},
            {"Nilai Tugas Kelompok 2 : ", "kelompok"},
            {"Nilai Kuis 1 : ", "kuis"},
            {"Nilai Kuis 2 : ", "kuis"},
            {"Nilai Ujian Akhir Semester : ", "uas"},
        };
        System.out.println("========== Masukkan Nilai ==========");
        for (int i = 0; i < answer.length; i++) {
            int value = 0;
            System.out.print(answer[i][0]);    
            value = input.nextInt();
            value = countPercentation(value, answer[i][1]);    
            total_nilai += value;    
        }
        grade = setGrade(total_nilai);
        System.out.println("========== Hasil Perhitungan Nilai ==========");
        System.out.println("Nilai Total : " + total_nilai);
        System.out.print("Grade : " + grade);

        input.close();
    }
}
