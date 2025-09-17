import java.util.Scanner;

//Nama : Muhammad Qalbi Al Arsyad
//NIM  : 255150701111028
public class LK07_Jamkerja {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.printf("%-15s: ","Jam kerja");
        int jamKerja = input.nextInt();

        if (jamKerja <= 50){
            int upahNormal = jamKerja*5000;
            int upahLembur = (jamKerja-jamKerja)*6000;
            int Denda = (50-jamKerja)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("----------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        } else if (jamKerja >= 60){
            int upahNormal = 60*5000;
            int upahLembur = (jamKerja-60)*6000;
            int Denda = (jamKerja-jamKerja)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("----------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        } else if (jamKerja <= 60){
            int upahNormal = jamKerja*5000;
            int upahLembur = (jamKerja-jamKerja)*6000;
            int Denda = (jamKerja-jamKerja)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("-------------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        }

        System.out.println();
        System.out.printf("%-15s: ","Jam kerja");
        int jamKerja1 = input.nextInt();
        if (jamKerja1 <= 50){
            int upahNormal = jamKerja1*5000;
            int upahLembur = (jamKerja1-jamKerja1)*6000;
            int Denda = (50-jamKerja1)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("----------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        } else if (jamKerja1 >= 60){
            int upahNormal = 60*5000;
            int upahLembur = (jamKerja1-60)*6000;
            int Denda = (jamKerja1-jamKerja1)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("----------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        } else if (jamKerja1 <= 60){
            int upahNormal = jamKerja1*5000;
            int upahLembur = (jamKerja1-jamKerja1)*6000;
            int Denda = (jamKerja1-jamKerja1)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("-------------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        }

        System.out.println();
        System.out.printf("%-15s: ","Jam kerja");
        int jamKerja2 = input.nextInt();
        if (jamKerja2 <= 50){
            int upahNormal = jamKerja2*5000;
            int upahLembur = (jamKerja2-jamKerja2)*6000;
            int Denda = (50-jamKerja2)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("----------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        } else if (jamKerja2 >= 60){
            int upahNormal = 60*5000;
            int upahLembur = (jamKerja2-60)*6000;
            int Denda = (jamKerja2-jamKerja2)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("----------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        } else if (jamKerja2 <= 60){
            int upahNormal = jamKerja2*5000;
            int upahLembur = (jamKerja2-jamKerja2)*6000;
            int Denda = (jamKerja2-jamKerja2)*1000;
            int total = upahNormal+upahLembur-Denda;
            System.out.printf("%-8s= Rp. %s %n","Upah",upahNormal);
            System.out.printf("%-8s= Rp. %s %n","Lembur",upahLembur);
            System.out.printf("%-8s= Rp. %s %n","Denda",Denda);
            System.out.println("-------------------------");
            System.out.printf("%-8s= Rp. %s %n","Total",total);
        }
            input.close();
    }
    
}
