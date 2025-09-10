import java.util.Scanner;

public class LK03_PLNJAVA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Program penghitung pemakaian listrik sederhana");
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Kelurahan     : ");
        String kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter  : ");
        int kwh = input.nextInt();
        System.out.print("Masukkan posisi akhir khw Meter : ");
        int khw = input.nextInt();
        System.out.print("Masukkan beban biaya saat ini   : ");
        int biaya = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)     : ");
        float PPJ = input.nextFloat();

        input.close();

        int pemakaian = khw-kwh;
        double tariflistrik = biaya*pemakaian;
        double diskon = (tariflistrik*(PPJ/100));
        double totalBayar = tariflistrik+diskon;

    
        System.out.println("=====================PLN Java=====================");
        System.out.printf("%-21s: %s%n","Nama",nama);
        System.out.printf("%-21s: %s%n","Kelurahan",kelurahan);
        System.out.printf("%-21s: %d Kwh meter%n","Pemakaian bulan ini",pemakaian);
        System.out.printf("%-21s: Rp %.0f,-%n","Tarif listrik",tariflistrik);
        System.out.printf("%-21s: Rp %.0f,-%n","PPJ 10%",diskon);
        System.out.printf("%-21s: Rp %.0f,-%n","Total bayar",totalBayar);
        System.out.println("==================================================");






    }


}


