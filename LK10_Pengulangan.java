import java.util.Scanner;
public class LK10_Pengulangan {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai n : ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++){
            String bintang = "";
            for (int j = 1; j <= i; j++){
                bintang += "* ";
            }
                System.out.printf("%" + (angka*2) + "s%n",bintang);
        }
        input.close();
    }
}

