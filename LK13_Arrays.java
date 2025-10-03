import java.util.ArrayList;
import java.util.Scanner;
public class LK13_Arrays {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        ArrayList<Double> datalist = new ArrayList<>();
        boolean again = true;
        System.out.println("1. Input data");
        System.out.println("2. Lihat data");
        System.out.println("3. Average");
        System.out.println("4. Sum");
        System.out.println("5. Max");
        System.out.println("6. Min");
        System.out.println("7. Keluar");
        
        while(again){
            System.out.printf("%-20s : ","Masukkan nilai");
            int menu = input.nextInt();
            switch(menu){
                case 1:
                    System.out.printf("%-20s : ","Input data");
                    double angka = input.nextDouble();
                    datalist.add(angka);
                    break;
                case 2:
                    System.out.printf("%-20s = %s %n","Data anda",datalist);
                    break;
                case 3:
                    double total = 0;
                    for (double rata : datalist){
                        total += rata;
                    }
                    double ratarata = total/datalist.size();
                    System.out.printf("%-20s = %,.1f %n","Rata Ratanya adalah",ratarata);
                    break;
                case 4:
                    double sum = 0;
                    for (double totalsum : datalist){
                        sum += totalsum;
                    }
                    System.out.printf("%-20s = %,.1f %n","Nilai Sum adalah",sum);
                    break;
                case 5:
                    double max = datalist.get(0);
                    for (double nilaimax : datalist){
                        if ( nilaimax > max){
                            max = nilaimax;
                        }
                    }
                    System.out.printf("%-20s = %,.1f %n","Nilai Max adalah",max);
                    break;
                case 6:
                    double min = datalist.get(0);
                    for (double nilaimin : datalist){
                        if (nilaimin < min){
                            min = nilaimin;
                        }
                    }
                    System.out.printf("%-20s = %,.1f %n","Nilai Min adalah",min);
                    break;
                case 7:
                    System.out.println("Program dihentikan");
                    again = false;
                    break;
                default:
                    System.out.println("Opsi tidak ditemukan");
                    break;
            }
        }
        input.close();
    }
}
