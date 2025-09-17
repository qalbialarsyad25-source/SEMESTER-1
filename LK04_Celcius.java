import java.util.Scanner;
public class LK04_Celcius{
    public static void main(String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai celcius : ");
        double C = input.nextDouble();
        double F = (1.8*C)+32;
        System.out.println("Maka hasil dari Celcius ke Fahrenheit adalah : "+F+" °F");
        
        input.close();
    }
}