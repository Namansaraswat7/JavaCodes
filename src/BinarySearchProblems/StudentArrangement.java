package BinarySearchProblems;

import java.util.Scanner;

public class StudentArrangement {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int m = S.nextInt();
        int k = S.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= S.nextInt();
        }
        int preferencearr[] = new int[100000+1];
        for(int i=0;i<n;i++)
        {
            preferencearr[arr[i]]++;
        }
        int ans=0;
        int remaining=0;
        for(int i=1;i<=m;i++){
            if(preferencearr[i]-remaining>k)
                ans+=preferencearr[i]-k-remaining;
               remaining=preferencearr[i]-remaining-k;
        }
        System.out.println(ans);
    }
}
