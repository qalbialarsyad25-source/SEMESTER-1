import java.util.*;

public class LK32_Kodebarang {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        String[] arr = {"A12","B45","C20","A35","D78"}; 

        System.out.print("Masukkan kode barang yang dicari : ");
        String kode = input.nextLine();
        boolean found = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equalsIgnoreCase(kode)){
                System.out.println("Barang dengan kode " + kode + " ditemukan pada indeks ke-" + i);
                found = false;
                break;
            } else {
                System.out.println("Data tidak ditemukan");
                break;
            }
        }
    }
}
