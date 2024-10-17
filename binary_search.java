import java.util.Scanner;
public class Binary_Search_Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        System.out.println("Enter no.of elements of array:  ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key element to the search:  ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                pos = mid + 1;
                break;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (pos == -1) {
            System.out.println("Search un successful element not found in the array ");
        } else {
            System.out.println("element found at " + pos + " in the array");
        }
    }
}
