import java.util.*;
public class LK33_Ngurutin {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan total arraynya : ");
        int total = input.nextInt();
        int [] arr = new int[total];
        ArrayList<Integer> rar = new ArrayList<>();
        ArrayList<Integer> ror = new ArrayList<>();
        ArrayList<Integer> rer = new ArrayList<>();

        for(int i = 0; i < total; i++){
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < total; i++){
            int hasil = Angkaprima(arr[i]);
            if (hasil != 0){
                rar.add(hasil);
            }
        }

        for(int i =0; i < total; i++){
            int genap = Angkagenap(arr[i]);
            if (genap != 0){
                ror.add(genap);
            }    
        }

        for(int i =0; i < total; i++){
            int ganjil = Angkaganjil(arr[i]);
            if (ganjil != 0){
                rer.add(ganjil);
            }
        }

        System.out.println("Angka prima adalah : " + rar);
        System.out.println("Angka genap adalah : " + ror);
        System.out.println("Angka ganjil adalah : " + rer);
    }

    public static int Angkaprima(int prima){
        if (prima <= 1){
            return 0;
        }

        for(int i = 2; i <= Math.sqrt(prima); i++){
            if (prima % i == 0){
            return 0;
            }
        }
        return prima;
    }

    public static int Angkagenap(int genap){
        if (genap % 2 == 0){
            return genap;
        } 
        return 0;
    }

    public static int Angkaganjil(int ganjil){
        if (ganjil % 2 != 0){
            return ganjil;
        }
        return 0;
    }
}
