import java.util.Scanner;
public class LK11_Kalkulator {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        double hasil = 0;
        boolean kondisi = true;
        double nilai1 = 0;
        int operator;


        while(kondisi){
        System.out.println("Menu Opeasi");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("0. Keluar dari program");
        System.out.print("Operasi yang dipilih : ");
        operator = input.nextInt();
        
            switch(operator){
                case 1:
                    System.out.print("Masukkan nilai 1 : ");
                    double nilaijumlah1 = input.nextDouble();
                    System.out.print("Masukkan nilai 2 : ");
                    double nilaijumlah2 = input.nextDouble();
                    nilai1 = nilaijumlah1 + nilaijumlah2;
                    hasil += nilai1;
                    break;

                case 2:
                    System.out.print("Masukkan nilai 1 : ");
                    double nilaikurang1 = input.nextDouble();
                    System.out.print("Masukkan nilai 2 : ");
                    double nilaikurang2 = input.nextDouble();
                    nilai1 = nilaikurang1 - nilaikurang2;
                    hasil -= nilai1;
                    break;

                case 3:
                    System.out.print("Masukkan nilai 1 : ");
                    double nilaikali1 = input.nextDouble();
                    System.out.print("Masukkan nilai 2 : ");
                    double nilaikali2 = input.nextDouble();
                    nilai1 = nilaikali1 * nilaikali2;
                    hasil *= nilai1;
                    break;

                case 4:
                    System.out.print("Masukkan nilai 1 : ");
                    double nilaibagi1 = input.nextDouble();
                        if (nilaibagi1 != 0){
                            System.out.print("Masukkan nilai 2 : ");
                            double nilaibagi2 = input.nextDouble();
                            nilai1 = nilaibagi1 / nilaibagi2;
                            hasil /= nilai1;
                        } else
                            System.out.println("Tidak dapat dibagi 0");
                            kondisi = false;
                    break;
                case 0:
                    System.out.printf("%10s : %.0f %n","Hasil Akhir",hasil);
                    System.out.println("Kalkulator dimatikan");
                    kondisi = false;
                    break;
                
                default:
                    System.out.println("Opsi tidak ditemukan");
                    kondisi = false;
            }
        } 
    }
}
