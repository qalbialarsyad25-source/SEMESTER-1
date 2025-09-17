import java.util.Scanner;

//Nama : Muhammad Qalbi Al Arsyad
//NIM  : 255150701111028
public class LK06_Bangundatar {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int luas;
        int keliling;
        double luasLingkaran;
        double kelilingLingkaran;
        double luasSegitiga;
        double kelilingSegitiga;
        System.out.println("Menu");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda: ");
        int menu = input.nextInt();
        switch (menu){
            case 1:
                System.out.print("Masukkan a: ");
                int aP = input.nextInt();
                System.out.print("Masukkan b: ");
                int bP = input.nextInt();

                luas = aP*bP;
                keliling = 2*(aP+bP);
                System.out.printf("%-25s: %s %s %n","Keliling persegi panjang",keliling,"cm");
                System.out.printf("%-25s: %s %s %n","Luas persegi panjang",luas,"cm2");
                break;
            case 2:
                System.out.print("Masukkan r: ");
                double r = input.nextDouble();
                if (r % 7 != 0){
                    luasLingkaran = 3.14*(r*r);
                    kelilingLingkaran = 2*3.14*r;
                    System.out.printf("%-20s: %.2f %s %n","Keliling lingkaran",kelilingLingkaran,"cm");
                    System.out.printf("%-20s: %.2f %s %n","Luas lingkaran",luasLingkaran,"cm2");
                } else if (r % 7 == 0){
                    luasLingkaran = 22.0/7.0*r*r;
                    kelilingLingkaran = 2.0*22.0/7.0*r;
                    System.out.printf("%-20s: %.0f %s %n","Keliling lingkaran",kelilingLingkaran,"cm");
                    System.out.printf("%-20s: %.0f %s %n","Luas lingkaran",luasLingkaran,"cm2");
                }
                break;
            case 3:
                System.out.print("Masukkan a: ");
                double aS = input.nextInt();
                System.out.print("Masukkan b: ");
                double bS = input.nextInt();
                System.out.print("Masukkan r: ");
                double rS = input.nextInt();
                luasSegitiga = 1.0/2.0*aS*bS;
                kelilingSegitiga = aS+bS+rS;
                System.out.printf("%-20s: %.0f %s %n","Keliling segitiga",kelilingSegitiga,"cm");
                System.out.printf("%-20s: %.0f %s %n","Luas segitiga",luasSegitiga,"cm2");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
                break;
        }
        input.close();
    }
}
