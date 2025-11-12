import java.util.*;

public class LK22_Inisialnama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int jumlahNama = input.nextInt();
        String [] namaFinal = new String[jumlahNama];
        
        input.nextLine();

        System.out.println("Masukkan "+jumlahNama+" nama lengkap:");
        for (int i = 0; i < jumlahNama; i++){
             System.out.print("Nama ke-"+(i+1)+": ");
             namaFinal[i] = input.nextLine();
        }
        
        System.out.println();
        System.out.println("Inisial dari setiap nama:");
        for (int i = 0; i < namaFinal.length ; i++){
            String [] namaProper = namaFinal[i].split(" ");
            String inisial = "";
            
            for (String a : namaProper){
                if (!a.isEmpty()){
                    inisial += Character.toUpperCase(a.charAt(0)) + ".";
                }
            }
            System.out.println(namaFinal[i] + " -> " + inisial);
        }
        

        String cari = input.nextLine().trim().toUpperCase();
        boolean ditemukan = false;
        for (int i = 0; i < jumlahNama; i++){
            if (namaFinal[i].trim().toUpperCase().startsWith(cari)){
                namaFinal[i] = namaFinal[i].trim().toLowerCase();
                String [] namaProper = namaFinal[i].split(" ");
                StringBuilder proper = new StringBuilder();
                for (String w : namaProper){
                    if (w.isEmpty()) continue;
                    proper.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1))
                    .append(" ");
                    
                }
                
                System.out.println();
                System.out.println("Nama yang berawalan huruf '"+cari+"': ");
                System.out.println(proper.toString().trim());
                ditemukan = true;
                break;
            } 
        }

        if (!ditemukan){
            System.out.println("Tidak ada nama yang berawalan '"+cari+"'");
        }

        int totalhuruf = 0;
        for (String nama : namaFinal){
            totalhuruf += nama.trim().replace(" ","").length();
        }
        System.out.println();
        System.out.println("Total huruf (tanpa spasi): "+totalhuruf);

        input.close();
        
        
    }
}
    