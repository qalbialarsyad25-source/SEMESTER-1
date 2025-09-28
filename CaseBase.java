import java.util.Scanner;

public class CaseBase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean again = true;
        double totalharga = 0;
        String pesanan = "";
        double subtotal = 0;
        String pajak2 = "10%";
        String hari = "";
        double totaljumlah = 0;
        String takeway = "";

        String menu1 = " Nasi Goreng Spesial, ";
        String menu2 = " Ayam Bakar Madu, ";
        String menu3 = " Soto Ayam Lamongan, ";
        String menu4 = " Teh Manis, ";
        String menu5 = " Jeruk, ";

        System.out.println(" 1. Nasi Goreng Spesial   : Rp. 15.000 ");
        System.out.println(" 2. Ayam Bakar Madu       : Rp. 25.000 ");
        System.out.println(" 3. Soto Ayam Lamongan    : Rp. 12.000 ");
        System.out.println(" 4. Teh Manis             : Rp. 5.000  ");
        System.out.println(" 5. Jeruk                 : Rp. 7.000  ");

        while (again){
            System.out.print("Anda ingin memesan apa     : ");
            int menu = input.nextInt(); 
            System.out.print("Berapa banyak pesanan anda : ");
            int jumlah = input.nextInt();
            totaljumlah += jumlah;
            System.out.print("Hari Pemesanan Anda        : ");
            input.nextLine();
            hari = input.nextLine();
            System.out.print("Take Away (yes/no)         : ");
            takeway = input.nextLine();
            
            
            switch (menu){
                case 1:
                    totalharga += 15000;
                    subtotal += 15000;
                    pesanan += menu1;
                    if (takeway.equalsIgnoreCase("yes")){
                        totalharga += 2000;
                        subtotal += 2000;
                    }
                    break;
                case 2:
                    totalharga += 25000;
                    subtotal += 25000;
                    pesanan += menu2;
                    if (takeway.equalsIgnoreCase("yes")){
                        totalharga += 2000;
                        subtotal += 2000;
                    }
                    break;
                case 3:
                    totalharga += 12000;
                    subtotal += 12000;
                    pesanan += menu3;
                    if (takeway.equalsIgnoreCase("yes")){
                        totalharga += 2000;
                        subtotal += 2000;
                    }
                    break;
                case 4:
                    totalharga += 5000;
                    subtotal += 5000;
                    pesanan += menu4;
                    break;
                case 5:
                    totalharga += 7000;  
                    subtotal += 7000; 
                    pesanan += menu5;
                    break;
                default :
                    System.out.println("Maaf menu tidak tersedia");
            }
            
            
            if (hari.equalsIgnoreCase("Jumat") && menu == 2){
                totalharga -= 5000;
            }


            System.out.print("Apakah anda ingin memesan lagi? (yes/no) : ");
            String lagi = input.nextLine();

            if (!lagi.equalsIgnoreCase("yes")){
                again = false;
            }

            totalharga *= jumlah;
            subtotal *= jumlah;
 
        } 

             if (totalharga >= 100000){
                totalharga -=(totalharga * 0.15);
            } else if (totalharga >= 50000){
                totalharga -=(totalharga * 0.10);
            }
                totalharga += (totalharga*0.1);  
            
            System.out.println("========== Nota anda ==========");
            System.out.printf("%-20s:  %s %n","Hari Pembelian",hari);
            System.out.println("-------------------------------");
            System.out.printf("%-20s: %s %n","Pesanan Anda",pesanan);
            System.out.printf("%-20s:  %.0f %n","Jumlah Item",totaljumlah);
            System.out.printf("%-20s:  %s %n","Take Away",takeway);
            System.out.printf("%-20s:  Rp. %.0f,- %n","Subtotal",subtotal);
            System.out.println("-------------------------------");
            System.out.printf("%-20s:  %s %n","Pajak", pajak2);
            System.out.printf("%-20s:  Rp. %.0f,- %n","Total Harga",totalharga);

            input.close();
    }
    
} 