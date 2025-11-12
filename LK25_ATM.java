import java.util.*;

public class LK25_ATM{
        static Scanner input = new Scanner (System.in);
        static int saldo = 0;
        static ArrayList<String> riwayat = new ArrayList<>();
        
        public static void main (String [] args){
        boolean again = true;
        while (again){
            tampilkanMenu();
            System.out.println("Pilih menu: ");
            int menu = input.nextInt();
        
            switch(menu){
                case 1:
                    cekSaldo();
                    break;
                
                case 2:
                    setorUang();
                    break;
                
                case 3:
                    tarikUang();
                    break;
                
                case 4:
                    riwayattransaksi();
                    break;
                
                case 5:
                    keluar();
                    again = false;
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
    public static void keluar(){
        System.out.println("Terima kasih telah menggunakan ATM ini.");
    }

    public static void riwayattransaksi(){
        System.out.println("=== Riwayat Transaksi ===");
        if (riwayat.isEmpty()){
            System.out.println("Belum ada transaksi.");
        } else {
            for (int i = 0; i < riwayat.size(); i++){
                System.out.println((i + 1) + ". "+ riwayat.get(i));
            }
        }
        System.out.println();
    }

    public static void tarikUang(){
        System.out.println("Masukkan jumlah penarikan: ");
        int penarikan = input.nextInt();
        if (penarikan <= 0){
            System.out.println("Jumlah tidak valid!");
        } else if (penarikan > saldo){
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= penarikan;
            System.out.println("Penarikan berhasil! Saldo sekarang: Rp" + saldo);
            if (riwayat.size() == 10) {
                riwayat.remove(0);
            }
            riwayat.add("Tarik - Rp" + penarikan);
        }
        System.out.println();
    }

    public static void setorUang(){
        System.out.println("Masukkan jumlah setoran: ");
        int setoran = input.nextInt();
        if (setoran >= 0 && saldo + setoran <= 1_000_000_000){
            saldo += setoran;
            System.out.println("Setoran berhasil! Saldo sekarang: Rp"+saldo);
            if (riwayat.size() == 10) riwayat.remove(0);
                riwayat.add("Setor - Rp"+ setoran);
            } else {
                System.out.println("Jumlah setoran tidak valid!");
            }
        System.out.println();
    }

    public static void cekSaldo(){
        System.out.println("Saldo Anda saat ini: Rp"+saldo);
        System.out.println();
    }

    public static void tampilkanMenu(){
        System.out.println("Menu:");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Setor Uang");
        System.out.println("3. Tarik Uang");
        System.out.println("4. Lihat Riwayat Transaksi");
        System.out.println("5. Keluar");
    }
}

