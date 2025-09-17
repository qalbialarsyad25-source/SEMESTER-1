import java.util.Scanner;
public class LK05_Tukangparkir {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double biayamobil = 5000;
        double biayamotor = 5000;
        double mobildanmotor = 3000;
        double biayatambahan;
        double biayaakhir;
        
        double menitParkir = input.nextDouble();
        input.nextLine();
        if (menitParkir<0){
            System.out.println("Misiiii input gak valid nihh!");
            return;
        }
        String kendaraan = input.nextLine();
        input.close();

        double jam = menitParkir/60;

        if (kendaraan.equalsIgnoreCase("mobil")){
            if (menitParkir <= 5){
                System.out.printf("%-1s %s %s Rp %,.2f %s %s %s%n","Biaya parkir",kendaraan,"hanya",mobildanmotor,"karena hanya",menitParkir,"menit");
            }else if (jam <= 2){
                System.out.printf("%-1s %s %s %.0f %s Rp %,.2f%n","Biaya parkir",kendaraan,"selama",jam,"Jam adalah",biayamobil);
            }else if (jam >= 2){
                double lebih = menitParkir - 120;
                double kelipatan = lebih /10;
                biayatambahan = kelipatan*2000;
                biayaakhir = biayatambahan+biayamobil;
                System.out.printf("%-1s %s %s %.0f %s Rp %,.2f%n","Biaya parkir",kendaraan,"selama",jam,"Jam adalah",biayaakhir);
            }
        } else if(kendaraan.equalsIgnoreCase("motor")){
            if (menitParkir <= 5){
                System.out.printf("%-1s %s %s Rp %,.2f %s %s %s%n","Biaya parkir",kendaraan,"hanya",mobildanmotor,"karena hanya",menitParkir,"menit");
            }else if (jam <= 2){
                System.out.printf("%-1s %s %s %.0f %s Rp %,.2f%n","Biaya parkir",kendaraan,"selama",jam,"Jam adalah",biayamotor);
            }else if (jam >= 2){
                double lebih = menitParkir - 120;
                double kelipatan = lebih/10;
                biayatambahan = kelipatan*2000;
                biayaakhir = biayatambahan+biayamotor;
                System.out.printf("%-1s %s %s %.0f %s Rp %,.2f%n","Biaya parkir",kendaraan,"selama",jam,"Jam adalah",biayaakhir);
            }
        } else if(kendaraan.equals(kendaraan)){
            System.out.printf("%-1s %n","Jalan kaki tidak perlu bayar parkir");
        } 
        
    } 
}
         


        
    

