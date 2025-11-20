package LK29_PabrikPC;

import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int gagalQCC = 0;
        double totalPendapatan = 0;
        
        System.out.println("===>> DATA PC DIPRODUKSI");
        for (int i = 1; i <= a; i++){
            
            input.nextLine();
            String CPU = input.nextLine().trim().replaceAll("\\s+"," ");
            int RAM = input.nextInt();
            int STORAGE = input.nextInt();
            
            PC pc = new PC (CPU, RAM, STORAGE);
            double harga = PriceCalculator.hitung(pc);
            boolean lulus = QCChecker.cek(pc);
                
            if (!lulus){
                gagalQCC++;
            } else {
                totalPendapatan += harga;
            }
            
            System.out.printf("PC %d: %s, %dGB, %dGB, %s, Harga Final: Rp%,.2f%n",
                i,
                pc.getCPU(),
                pc.getRAM(),
                pc.getSTORAGE(),
                lulus ? "QC Lulus" : "QC Gagal",
                harga);
            
        }
        
        System.out.println();
        System.out.println("Jumlah PC gagal QC: " + gagalQCC);
        System.out.printf("Total pendapatan hari ini: Rp%,.2f%n",totalPendapatan);
    }
}