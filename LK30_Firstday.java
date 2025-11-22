import java.util.*;

public class LK30_Firstday {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        String [] namabulan = {"January","February","March","April","Mei","June","July","August","September","October","November","Desember"};
        int [] haribulan= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String [] namahari = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.print("Masukkan tahun : ");
        int tahun = input.nextInt();

        System.out.print("Masukkan hari pertama setiap tahun : (0 = Sunday ... 6 = Saturday) ");
        int hari = input.nextInt();

        boolean isLeap = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        if(isLeap){
            haribulan [1] = 29;
        }

        for (int bulan = 0; bulan < 12; bulan++){
            System.out.println(namabulan[bulan] + " 1, " + tahun + " is " + namahari[hari]);

            hari = (hari + haribulan[bulan]) % 7;
        }

        input.close();
    }
}
