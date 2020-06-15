package BinarySearchProblems;

import java.util.Arrays;
import java.util.Scanner;

//Bishu went to fight for Coding Club.
// There were N soldiers with various powers.
// There will be Q rounds to fight and in each round Bishu's power will be varied.
// With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M).
// After each round, All the soldiers who are dead in previous round will reborn.
// Such that in each round there will be N soldiers to fight.
// As Bishu is weak in mathematics, help him to count the number of soldiers that he can kill in each round and total sum of their powers.
//
//        1<=N<=10000
//
//        1<=power of each soldier<=100
//
//        1<=Q<=10000
//
//        1<=power of bishu<=100
public class BishuandSoldiers {

    public static int bound(int arr[],int l,int key){
        int s=0;
        int e=l-1;
        int ans=0;
        while (s<=e)
        {
            int mid=(s+e)/2;
            if(key==arr[mid])
            {
               // System.out.println("mid ="+mid);
                ans = mid;
                s=mid+1;
            }
            else if(key>arr[mid])
            {
                s=mid+1;
                ans=mid;
            }
            else if(key<arr[mid])
            {
                e=mid-1;

            }

        }
        return ans;


    }

    public static int arrSum(int arr[],int l,int key){
        int pos = bound(arr,l,key);
        System.out.print(pos+1+" ");
        int sum=0;
        for(int i=0;i<=pos;i++)sum+=arr[i];
        return sum;

    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=S.nextInt();
        }

        int q=S.nextInt();

        int qr[] = new int[q];

        for (int i=0;i<q;i++)
        {
            qr[i]=S.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<q;i++)
        {

            System.out.println(arrSum(arr,arr.length,qr[i]));

        }

    }
}
