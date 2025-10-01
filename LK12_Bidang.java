import java.util.Scanner;
public class LK12_Bidang {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        boolean again = true;
        while (again){
            System.out.println("MENU");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.println();
            System.out.print("MASUKKAN PILIHAN ANDA : ");
            int menu = input.nextInt();

            switch (menu){
                case 1:
                    System.out.print("Masukkan nilai panjang : ");
                    double panjangbalok = input.nextDouble();
                    System.out.print("Masukkan nilai lebar   : ");
                    double lebarbalok = input.nextDouble();
                    System.out.print("Masukkan nilai tinggi  : ");
                    double tinggibalok = input.nextDouble();
                    double volumebalok = panjangbalok*lebarbalok*tinggibalok;
                    System.out.printf("%-20s : %,.1f %n ","Maka volume balok adalah",volumebalok);
                    break;
                case 2:
                    System.out.print("Masukkan nilai jari jari : ");
                    double jaribola = input.nextDouble();
                    double volumebola = (4.0/3.0)*Math.PI*Math.pow(jaribola,3);
                    System.out.printf("%-20s : %,.1f %n ","Maka volume bola adalah",volumebola);
                    break;
                case 3:
                    System.out.print("Masukkan nilai jari jari : ");
                    double jarikerucut = input.nextDouble();
                    System.out.print("Mauskkan nilai tinggi    : ");
                    double tinggikerucut = input.nextDouble();
                    double volumekerucut = (1.0/3.0)*Math.PI*Math.pow(jarikerucut, 2)*tinggikerucut;
                    System.out.printf("%-20s : %,.1f %n ","Maka volume kerucut adalah",volumekerucut);
                    break;
                case 4:
                    System.out.print("Masukkan nilai jari jari : ");
                    double jarisilinder = input.nextDouble();
                    System.out.print("Mauskkan nilai tinggi    : ");
                    double tinggisilinder = input.nextDouble();
                    double volumesilinder = Math.PI*Math.pow(jarisilinder, 2)*tinggisilinder;
                    System.out.printf("%-20s : %,.1f %n ","Maka volume silinder adalah",volumesilinder);
                    break;
                case 5:
                    System.out.print("Masukkan nilai alas segitiga   : ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan nilai tinggi segitiga : ");
                    double tinggisegitiga = input.nextDouble();
                    System.out.print("Masukkan nilai tinggi limas    : ");
                    double tinggilimas = input.nextDouble();
                    double luaslimas = (1.0/2.0)*alas*tinggisegitiga;
                    double volumelimas = (1.0/3.0)*luaslimas*tinggilimas;
                    System.out.printf("%-25s : %,.1f %n ","Maka volume limas segitiga adalah",volumelimas);
                    break;
                case 0:
                    System.out.println("Keluar dari program");
                    again = false;
                    break;
                default:
                    System.out.println("Opsi tidak ditemukan");
                    again = false;
                    break;
            }
            System.out.println();
        } 
        input.close();
    }
}
