package takingAn;

import java.util.*;

public class takingarray {

    public static void printArray(int arr[]){

        for (int i = 0; i<arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }

    public static void main (String args[]){
       
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        System.out.println();

        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;

            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]=current;

        }

        printArray(arr);

    }
    
}
