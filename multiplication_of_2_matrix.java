import java.io.*;
import java.util.*;
public class Multiplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row and colums");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the row and colums of matrix 2");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if(c1!=r2){
            System.out.println("Multiplication is not possible");
            System.exit(0);
        }
        else{
            int a[][]=new int[r1][c1];
            int b[][]=new int[r2][c2];
            int c[][]=new int[r1][c2];
            System.out.println("Enter"+(r1*c1)+"element into matrix a");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter"+(r2*c2)+"element into matrix b");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    c[i][j]=0;
                    for(int k=0;k<c1;k++){
                        c[i][j]=c[i][j]+(a[i][j]+b[i][j]);
                    }
                }
            }
            System.out.println("The Resultant matrix is: ");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}
