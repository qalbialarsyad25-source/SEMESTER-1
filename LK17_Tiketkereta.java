import java.util.*;
public class LK17_Tiketkereta {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        ArrayList<String> datalist = new ArrayList<>();
        String [] nama = {"Ekonomi","Bisnis","Eksekutif","Pariwisata"};
        String [][] hargadiskon = {
        {"50000", "100000", "200000", "300000"},
        {"2 %","5 %","7 %","10 %"}
        };
        String [] ac = {"Tidak ada","Ada","Ada","Ada"};
        String [] colokan ={"Tidak ada","Tidak ada","Tidak ada","Ada"};

        String jumlah = "";
        boolean again = true;

        while(again){
            System.out.println();
            System.out.println("1. Melihat daftar kereta api");
            System.out.println("2. Melihat daftar kereta api yang ada AC");
            System.out.println("3. Melihat daftar kereta api yang ada colokan");
            System.out.println("4. Memesan tiket kereta api");
            System.out.println("5. Melihat pesanan tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            int menu = input.nextInt();

            switch(menu){
                case 1:
                    System.out.println();
                    System.out.println("Daftar tiket kereta Api");
                    System.out.printf("%-12s %-10s %-10s %n","Jenis","Harga","Diskon");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < nama.length; i++){
                        System.out.printf("%-12s %-10s %-10s %n",nama[i],hargadiskon[0][i],hargadiskon[1][i]);
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Daftar Kereta api yang ada AC");
                    for (int i = 0; i < ac.length; i++){
                        System.out.printf("%-13s : %-1s %n",nama[i],ac[i]);
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Daftar Kereta api yang ada Colokan");
                    for (int i = 0; i < colokan.length; i++){
                        System.out.printf("%-13s : %-1s %n",nama[i],colokan[i]);
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Daftar tiket kereta Api");
                    System.out.printf("%-12s %-10s %-10s %n","Jenis","Harga","Diskon");
                    System.out.println("--------------------------------");
                    for (int i = 0; i < nama.length; i++){
                        System.out.printf("%-12s %-10s %-10s %n",nama[i],hargadiskon[0][i],hargadiskon[1][i]);
                    }
                    System.out.print("Ingin memesan tiket apa : ");
                    int pesan = input.nextInt();
                    input.nextLine();
                    jumlah = nama[pesan - 1];
                    datalist.add(jumlah);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Pesanan anda : Kereta Api Jenis ");
                    System.out.println(datalist);
                    break;
                case 0:
                    System.out.println("Keluar dari pesanan tiket kereta api");
                    again = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
 