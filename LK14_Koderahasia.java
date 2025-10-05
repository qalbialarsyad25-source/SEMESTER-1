import java.util.ArrayList;
import java.util.Scanner;
public class LK14_Koderahasia {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        StringBuilder pesan = new StringBuilder();
        ArrayList<Integer> invalid = new ArrayList<>();

        int id = input.nextInt();
        int n = input.nextInt();
        int[] arr = new int[n];

        int mulai = id;
        int akhir = id+25;
        int spasi = id+26;
        
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for (int a : arr){
            if (a >= mulai && a <= akhir){
                int kode = a - mulai;
                char huruf = (char) ('A' + kode);
                pesan.append(huruf);
            } else if (a == spasi){
                pesan.append(' ');
            } else {
                invalid.add(a);
            }
        }

        System.out.println();
        System.out.printf("%-1s %s %n","Output pesan:",pesan.toString());
        if (invalid.isEmpty()){
            System.out.println("Elemen tidak valid ditemukan: []");
        } else {
            String daftarinvalid = invalid.toString().replace("[","").replace("]","");
            System.out.printf("%-1s %s %n","Elemen tidak valid ditemukan:",daftarinvalid);
        }

        input.close();
    }
}
