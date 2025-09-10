import java.util.Scanner;

public class LK02_Penjumlahan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan operator pertama : ");
        double pertama = input.nextDouble();
        System.out.print("Masukkan operator kedua   : ");
        double kedua = input.nextDouble();

        input.close();
        
        //Proses
        double penjumlahan = pertama + kedua;
        double pengurangan = pertama - kedua;
        double perkalian = pertama * kedua;
        double pembagian = pertama / kedua;

        System.out.printf("%-19s: %.0f%n","hasil penjumlahan",penjumlahan);
        System.out.printf("%-19s: %.0f%n","hasil pengurangan",pengurangan);
        System.out.printf("%-19s: %.0f%n","hasil perkalian",perkalian);
        System.out.printf("%-19s: %,.1f%n","hasil pembagian",pembagian);



    }

}