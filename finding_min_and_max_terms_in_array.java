import java.io.*;
import java.util.*;
public class Min_Max {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of elements:  ");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter"+n+"values into the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);
    }
}
