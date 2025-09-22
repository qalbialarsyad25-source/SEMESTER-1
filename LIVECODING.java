
import java.util.Scanner;
public class LIVECODING {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        String again;
        System.out.println("======== SELAMAT DATANG DI VANDING MACHINE SIMULATOR ========");

        System.out.println("Daftar barang:");
        System.out.println("1. Apel       Rp. 5000");
        System.out.println("2. Jeruk      Rp. 6000");
        System.out.println("3. Anggur     Rp. 4000");
        System.out.println("4. Strawberry Rp. 2500");
        System.out.print("Pilih nomor barang : ");
        int buah = input.nextInt();
        double uang;
        String buah1 = "Apel";
        String buah2 = "Jeruk";
        String buah3 = "Anggur";
        String buah4 = "Strawberry";


        int apel = 5000;
        int jeruk = 6000;
        int anggur = 4000;
        int berry = 2500;
        do{
        switch(buah){
            case 1:
            System.out.print("Masukkan uang      : ");
            uang = input.nextDouble();
            if (uang < 5000){
                System.out.println("Maaf uang anda tidak cukup");
            } else if (uang == 5000){
                System.out.printf("%-19s: %s %n","Anda memilih",buah1);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",apel);
                System.out.printf("%-19s: Rp. %.0f,- %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-apel;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            } else if (uang > 5000) {
                System.out.printf("%-19s: %s %n","Anda memilih",buah1);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",apel);
                System.out.printf("%-19s: Rp. %.0f,-  %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s: %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-apel;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            }
            break;
            case 2:
            System.out.print("Masukkan uang      : ");
            uang = input.nextDouble();
            if (uang < 5000){
                System.out.println("Maaf uang anda tidak cukup");
            } else if (uang == 5000){
                System.out.printf("%-19s: %s %n","Anda memilih",buah2);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",jeruk);
                System.out.printf("%-19s: Rp. %.0f,- %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-jeruk;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            } else if (uang > 5000) {
                System.out.printf("%-19s: %s %n","Anda memilih",buah2);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",jeruk);
                System.out.printf("%-19s: Rp. %.0f,-  %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s: %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-jeruk;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            }
            break;
            case 3:
            System.out.print("Masukkan uang      : ");
            uang = input.nextDouble();
            if (uang < 5000){
                System.out.println("Maaf uang anda tidak cukup");
            } else if (uang == 5000){
                System.out.printf("%-19s: %s %n","Anda memilih",buah3);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",anggur);
                System.out.printf("%-19s: Rp. %.0f,- %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-anggur;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            } else if (uang > 5000) {
                System.out.printf("%-19s: %s %n","Anda memilih",buah3);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",anggur);
                System.out.printf("%-19s: Rp. %.0f,-  %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s: %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-anggur;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            }
            break;
            case 4:
            System.out.print("Masukkan uang      : ");
            uang = input.nextDouble();
            if (uang < 5000){
                System.out.println("Maaf uang anda tidak cukup");
            } else if (uang == 5000){
                System.out.printf("%-19s: %s %n","Anda memilih",buah4);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",berry);
                System.out.printf("%-19s: Rp. %.0f,- %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-berry;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            } else if (uang > 5000) {
                System.out.printf("%-19s: %s %n","Anda memilih",buah4);
                System.out.printf("%-19s: Rp. %s,- %n","Total biaya",apel);
                System.out.printf("%-19s: Rp. %.0f,-  %n","Total Uang anda",uang);
                System.out.println("----Transaksi berhasil----");
                System.out.printf("%-19s: %n","Terima kasih, Silahkan ambil barang anda");
                double kembalian = uang-apel;
                System.out.printf("%-19s: Rp. %.0f,- %n","Kembalian anda",kembalian);
                System.out.println("Terimah kasih telah menggunakan vanding machine");
            }
        }  
        System.out.println("Mau Beli Sekali Lagi (Yes/No)?");
        input.nextLine();
        again = input.nextLine();
        } while ((again.charAt(0) =='Y') || (again.charAt(0) =='y'));
        System.out.println("Terima kasih telah menggunakan vanding machine");
        input.close();
    }
}