import java.util.*;

public class LK26_Integer {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total angka yang akan dimasukkan : ");
        int angka = input.nextInt();

        if (angka <= 0){
            System.out.println("Input tidak valid.");
            return;
        }

        int [] arr = new int[angka]; 
        for (int i = 0; i < arr.length; i++){
            System.out.print("Masukkan angka ke-"+ (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("===== Hasil urutan dari kecil ke besar =====");
        for (int a : arr){
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("\n===== Hasil urutan dari besar ke kecil =====");
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
