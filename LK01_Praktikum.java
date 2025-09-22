import java.util.Scanner;

public class LK01_Praktikum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int tanggalBeli = input.nextInt();
        int bulanBeli = input.nextInt();
        int tahunBeli = input.nextInt();
        input.nextLine();
        String belanjaBarang = input.nextLine();
        int jumlahBarang = input.nextInt();
        double hargaBarang = input.nextDouble();
        float diskon = input.nextFloat();
        boolean jenisPembayaran = input.nextBoolean();

        input.close();
        double totalHarga = jumlahBarang*hargaBarang;
        double jumlahPembayaran = totalHarga-(totalHarga*(diskon/100));

        System.out.println("=========== List Barang ===========");
        System.out.printf("%-20s: %d-%d-%d%n","Tanggal",tanggalBeli,bulanBeli,tahunBeli);
        System.out.printf("%-20s: %s%n","Barang belanja", belanjaBarang);
        System.out.printf("%-20s: %d%n","Jumlah barang",jumlahBarang);
        System.out.printf("%-20s: %,.2f%n","Harga barang",hargaBarang);
        System.out.printf("%-20s: %.1f %% %n","Diskon",diskon);
        System.out.println("-----------------------------------");
        System.out.printf("%-20s: Rp%,.2f%n","Total harga",totalHarga);
        System.out.printf("%-20s: Rp%,.2f%n","Pembayaran",jumlahPembayaran);
        System.out.printf("%-20s: %s%n","Pembayaran tunai",jenisPembayaran);


        input.close();
    }
    
}
