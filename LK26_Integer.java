import java.util.*;

public class LK26_Integer {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total angka yang akan dimasukkan : ");
        int angka = input.nextInt();
        int [] arr = new int[angka]; 
        System.out.println("Masukkan angka : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        for (int a : arr){
            System.out.print(a + " ");
        }

        input.close();
    }
}
