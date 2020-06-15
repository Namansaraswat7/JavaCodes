package BinarySearchProblems;

import java.util.Scanner;

public class TheOldMonk {

    public static int binarySearch(int arr[],int brr[],int l,int index){
        int s=index;
        int e=l-1;

        int difference=0;
        while (s<=e)
        {
            int mid = (s+e)/2;

            if(brr[mid]>=arr[index])
            {
                s=mid+1;
                difference=mid-index;

            }
            else if(brr[mid]<arr[index])
            {
                e=mid-1;
            }

        }
        return difference;
    }
    public static int monkiness(int arr[],int brr[],int l,int index){
        return binarySearch(arr,brr,l,index);
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int t=0;
        if(S.hasNextInt())
            t=S.nextInt();
        while (t-->0)
        {
            int n =S.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i=0;i<n;i++)
            {
                a[i]=S.nextInt();
            }
            for (int i=0;i<n;i++)
            {
                b[i]=S.nextInt();
            }
            int num=0;
           int maxnum=0;
            for(int i=0;i<n;i++)
            {
               num= monkiness(a,b,n,i);
               if(num>maxnum)
                   maxnum=num;

            }

            System.out.println(maxnum);
        }
    }
}
