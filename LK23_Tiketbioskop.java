import java.util.*;

public class LK23_Tiketbioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int baris = input.nextInt();
        int kolom = input.nextInt();
        boolean [][] kursi = new boolean [baris][kolom];
        
        for (int i = 0; i < baris; i++){
            for (int j = 0; j < kolom; j++){
                kursi [i][j] = input.nextBoolean();
            }
        }
        
        int perintah = input.nextInt();
        int harga = 0;
        
        
        for (int i = 0; i <= perintah; i++){
            String operasi = input.next();
            
            if (operasi.equals("CEK_KURSI")){
                for (int k = 0; k < baris; k++){
                    for (int j = 0; j < kolom; j++){
                        System.out.println((kursi[k][j] ? "X" : "O"));
                        if (j < kolom - 1) System.out.print(" ");
                    }
                    System.out.println();
                }
                
            } else if (operasi.equals("HITUNG_PENDAPATAN")){
                if (harga == 0){
                    System.out.println("Harga kursi belum ditetapkan!");
                } else {
                    int jumlahTerisi = 0;
                    for (int k = 0; k < baris; k++){
                        for (int j = 0; j < kolom; j++){
                            if (kursi[k][j]) jumlahTerisi++;
                        }
                    }
                    System.out.println("Pendapatan: "+(jumlahTerisi * harga));
                }
                
            } else if (operasi.equals("SETHARGA")){
                harga = input.nextInt();
                System.out.println("Harga kursi diubah menjadi "+harga+".");
                
            } else if (operasi.equals("PESAN")){
                int BARIS = input.nextInt() - 1;
                int KOLOM = input.nextInt() - 1;
                if (kursi[BARIS][KOLOM]){
                    System.out.println("Kursi baris "+(BARIS+1)+" kolom "+(KOLOM+1)+" sudah dipesan sebelumnya!");
                } else {
                    kursi[BARIS][KOLOM] = true;
                    System.out.println("Kursi baris "+(BARIS+1)+" kolom "+(KOLOM+1)+" berhasil dipesan.");
                }
                
            }else if (operasi.equals("KOSONGKAN")){
                for (int k = 0; k < baris; k++){
                    for (int j = 0; j < kolom; j++){
                        kursi[k][j] = false;
                    }
                }
                System.out.println("Semua kursi telah dikosongkan.");
            }
        }

        input.close();
    }
}
    