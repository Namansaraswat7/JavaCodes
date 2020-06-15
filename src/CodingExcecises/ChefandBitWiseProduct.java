package CodingExcecises;

import java.util.ArrayList;
import java.util.Scanner;

//Chef got interested in bits and wanted to learn about them, so his friend Pintu gave him a special function F(X,Y,Z)=(X∧Z)⋅(Y∧Z),
// where ∧ is the bitwise AND operator and X,Y,Z are non-negative integers.
//
//        Pintu wants Chef to maximise the function F(X,Y,Z) for given X and Y by choosing an appropriate Z.
//        However, to make it interesting, Pintu also gave Chef limits L and R for Z. In other words,
//        he wants Chef to find a non-negative integer Z (L≤Z≤R) such that F(X,Y,Z)=maxL≤k≤R(F(X,Y,k)).
//        If there is more than one such value of Z, he should find the smallest one in the range [L,R].
//
//        Since Chef is busy cooking in the kitchen, he needs you to help him solve this problem.
//
//        Note: X, Y, L and R are chosen in such a way that maxL≤k≤R(F(X,Y,k)) never exceeds 262.




public class ChefandBitWiseProduct {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        int T = 0;
        if(S.hasNextInt())
            T=S.nextInt();

        while (T-->0)
        {
            long x=S.nextLong();
            long y=S.nextLong();
            int q=0;
            int s=1;

            long l=S.nextLong();
            long r=S.nextLong();
            long max=0;
            long sum=0;
            long value=-1;
            long processValue=(x|y);
            System.out.println(processValue);
            long var=processValue;
            ArrayList<Long> arr= new ArrayList<Long>();
            ArrayList<Long> actarr= new ArrayList<Long>();

            while(var>0)
            {
                arr.add(var%2);
               // System.out.print(" "+var%2);
                var/=2;
            }
            int cnt=0;
            for(int i=arr.size()-1;i>=0;i--)
            {
                if(arr.get(i)==1)cnt++;
                actarr.add(arr.get(i));
            }
            System.out.println(actarr);
            System.out.println(" ");
            int counter=0;
           while (counter<=cnt+1)
            {
                int c=0;
//                for(int k=0;k<i;k++)
//                {
//                    System.out.print("0"+" ");
//                }
                for(int j=0;j<actarr.size();j++)
                {
                    if(c<counter&&actarr.get(j)==1)
                        System.out.print("1"+ " ");
                    else
                    {
                        System.out.print("0"+ " ");
                    }
                    c++;
                }
                System.out.println(" ");
                counter++;
            }
            for(long i=l;i<=r;i++)
            {
                sum=(x&i)*(y&i);
                //System.out.println(sum);
                if(sum>max){
                    max=sum;
                    value=i;
                }
                sum=0;

            }
            System.out.println(value);
//            for(int i=0;i<=5;i++)
//                System.out.println(i<<i);
        }
    }
}
