import java.util.Scanner;
public class LK08_Jumlahkelas {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Kelas : ");
        int kelas = input.nextInt();
        System.out.print("Masukkan Jumlah Siswa : ");
        int siswa = input.nextInt();

        System.out.println("Daftar Nama Siswa: ");

        for (int i = 1; i <= kelas; i++){
            System.out.printf("%-1s %s: %n","Kelas ",i);
            for (int j = 1; j <= siswa; j++){
                System.out.printf("%-1s %s: ","Masukkan nilai siswa ke-",j);
                int nilai = input.nextInt();

                System.out.printf("%-1s1: %s %n","Nilai siswa ke-",nilai);
            }
        }
        input.close();
    }
    
}
