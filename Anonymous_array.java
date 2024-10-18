import java.io.*;
import java.util.*;

public class Anonymous_Array {
    public static void main(String args[]) {
        printArray(new int[]{10, 20, 30, 40});
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
