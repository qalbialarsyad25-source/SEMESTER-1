import java.util.*;

public class LK15_Tokobuah {
    static String[] nama = {"Apel","Anggur","Strawberry","Jeruk"};
    static int [] stok = {3, 4, 5, 6};
    static int [] harga = {1000, 2000, 3000, 4000};
    static ArrayList<String> namalist = new ArrayList<>();

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        boolean again = true;

        while(again){
            System.out.println();
            System.out.println("Pilihan menu");
            System.out.println("1. Informasi barang");
            System.out.println("2. Mengelola Stok");
            System.out.println("3. Peringatan Stok");
            System.out.println("4. Keluar program");
            System.out.printf("Pilihan anda : ");
            int menu = input.nextInt();

            switch(menu){
                case 1:
                    hasil();
                    break;
                case 2:
                    nambahstok(input);
                    break;
                case 3:
                    peringatan();
                    break;
                case 4:
                    System.out.println("Keluar program");
                    again = false;
                default:
                    System.out.println("Invalid");
            }  
        }
    }

    public static void hasil (){
        System.out.println();
        System.out.println("Persediaan Toko");
        for (int i = 0; i < nama.length; i++){
            System.out.printf("%-15s %-5s %-10s %n",nama[i],stok[i],harga[i]);
        }
    }

    public static void nambahstok (Scanner input){
        System.out.println();
        System.out.println("Tentukan buah yang ingin diubah");
        for (int i = 0; i < nama.length; i++){
            System.out.printf((i+1)+". %-15s %n",nama[i]);
        }
        System.out.print("Pilihan anda : ");
        int menu = input.nextInt();
        
        switch(menu){
            case 1:
            System.out.println("1. Menambah Stok");
            System.out.println("2. Mengurang Stok");
            System.out.print("Pilihan anda : ");
            int pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah = input.nextInt();
                    stok[menu - 1] += jumlah;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah);
                break;

                case 2:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah1 = input.nextInt();
                    stok[menu - 1] -= jumlah1;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah1);
                break;
            }
            break;

            case 2:
            System.out.println("1. Menambah Stok");
            System.out.println("2. Mengurang Stok");
            System.out.print("Pilihan anda : ");
            int pilihan1 = input.nextInt();

            switch(pilihan1){
                case 1:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah = input.nextInt();
                    stok[menu - 1] += jumlah;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah);
                break;

                case 2:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah1 = input.nextInt();
                    stok[menu - 1] -= jumlah1;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah1);
                break;
            }
            break;

            case 3:
            System.out.println("1. Menambah Stok");
            System.out.println("2. Mengurang Stok");
            System.out.print("Pilihan anda : ");
            int pilihan2 = input.nextInt();

            switch(pilihan2){
                case 1:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah = input.nextInt();
                    stok[menu - 1] += jumlah;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah);
                break;

                case 2:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah1 = input.nextInt();
                    stok[menu - 1] -= jumlah1;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah1);
                break;
            }
            break;

            case 4:
            System.out.println("1. Menambah Stok");
            System.out.println("2. Mengurang Stok");
            System.out.print("Pilihan anda : ");
            int pilihan3 = input.nextInt();

            switch(pilihan3){
                case 1:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah = input.nextInt();
                    stok[menu - 1] += jumlah;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah);
                break;

                case 2:
                    System.out.print("Berapa jumlah stock yang diubah : ");
                    int jumlah1 = input.nextInt();
                    stok[menu - 1] -= jumlah1;
                    System.out.print("Berhasil diubah menjadi : ");
                    System.out.println(jumlah1);
                break;
            }
            break;

            default:
            System.out.println("Invalid");
            break;
        }
    }

    public static void peringatan (){
        int min = stok[0];
        String namamin = nama[0];
        for (int i = 0; i < stok.length; i++){
            if (stok[i] < min){
                min = stok[i];
                namamin = nama[i];
            }
        }
        System.out.print("Peringatan Stok terkecil : ");
        System.out.println(min +" "+ namamin);  
    }
}