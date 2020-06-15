package BinarySearchProblems;

import java.util.Scanner;

public class KthSmallestNumberAgain {
    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int T = S.nextInt();

        while(T-->0)
        {
         int n= S.nextInt();
         int q= S.nextInt();

         long arr[][] = new long[n][2];

         for(int i=0;i<n;i++) {
             arr[i][0]= S.nextLong();
             arr[i][1]= S.nextLong();
         }
         long qrr[] = new long[q];

         for(int i=0;i<q;i++)
             qrr[i]= S.nextLong();


        }


    }
}
