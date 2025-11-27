import java.util.*;

public class LK33_Datanilai {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int [] arr = {78, 90, 65, 88, 72, 60, 95};
        for (int i = 0; i < arr.length - 1; i++){
            for(int j  = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }

        System.out.println("Data nilai setelah diurutkan : ");
        for (int nilai : arr){
            System.out.println(nilai + " ");
        }
        input.close();
    }
}
