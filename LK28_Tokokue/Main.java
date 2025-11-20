package LK28_Tokokue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String namaP = in.nextLine();
        boolean member = in.nextBoolean();
        int kode = in.nextInt();
        int jumlah = in.nextInt(); 
        
        Kue cake = new Kue(kode);
        Pelanggan cust = new Pelanggan(namaP, member);

        String members = "";
        if (member == true){
            String a = "Member kue";
            members += a;
        } else {
            String a = "Bukan member";
            members += a;
        }
        
        double total = cake.getHarga() *jumlah;
        if (cust.getMember()){
            total = total * 0.85;
        }
        
        System.out.println("===>> DETAIL TRANSAKSI");
        System.out.printf("%-16s: %s %n","Jenis Kue",cake.getNama());
        System.out.printf("%-16s: Rp%,.2f %n","Harga Satuan",cake.getHarga());
        System.out.printf("%-16s: %s %n","Nama Pelanggan",cust.getNama());
        System.out.printf("%-16s: %s %n","Status Member",members);
        System.out.printf("%-16s: %s %n","Jumlah Kue",jumlah);
        System.out.printf("%-16s: Rp%,.2f %n","Total Pembayaran",total);
        
    }
}