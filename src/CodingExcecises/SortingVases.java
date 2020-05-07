package CodingExcecises;

import java.util.*;

public class SortingVases {
    public static void swap(ArrayList<ArrayList<Integer>> a,int p1,int p2,int c){
        int temp=a.get(c).get(p1);
        a.get(c).set(p1,a.get(c).get(p2));
        a.get(c).set(p2,temp);

    }
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int T=0;
        if(S.hasNextInt())
            T = S.nextInt();


        int [] n = new int[T];
        int [] m = new int[T];
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>> ();
        ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>> ();
        //int [][] x= new int [m[]][2];
        int c=0;

        int t=T;
        int sum=0;
        while (T-- > 0) {

            n[c] = S.nextInt();
            m[c] = S.nextInt();
            a.add(new ArrayList<Integer>(n[c]));
            for (int i = 0; i < n[c]; i++)
                a.get(c).add(S.nextInt());

//            for (int i = 0; i < m[c]; i++) {
//                x[c][0] = S.nextInt();
//                x[c][1] = S.nextInt();
//            }

            for(int i=0;i<m[c];i++)
            {
                x.add(new ArrayList<Integer>(2));
                x.get(sum+i).add(S.nextInt());
                x.get(sum+i).add(S.nextInt());
            }
            sum+=m[c];
            c++;
        }

//            for(int i=0;i<n;i++)
//                System.out.print(a[i]+" ");
//            System.out.println(" ");
           c=0;
            int sum1=0;
            int sum2=0;
            while(t-->0)
            {

                ArrayList<ArrayList<Integer>> q = new ArrayList<ArrayList<Integer>>();
                int count = 0;
                int cnt=0;
            for(int i=0;i<n[c]-1;i++)
            {
                int min=Integer.MAX_VALUE;
                for(int j=i+1;j<n[c];j++)
                {
                    if(a.get(c).get(j)<a.get(c).get(i)&&a.get(c).get(j)<min)
                    min=j;
                }
                if(min!=Integer.MAX_VALUE)
                {
                    swap(a,i,min,c);
                    q.add(new ArrayList<Integer>(2));
                    q.get(cnt).add(i+1);
                    q.get(cnt).add(min+1);
                    cnt++;
                   // System.out.println(i+1+" "+(min+1));

                    count++;
                }
            }
          //  for(int j=0;j<t)
//            for(int i=0;i<q.size();i++)
//            {
//
//                System.out.println(q.get(i));
//            }
                sum2+=m[c];

            for(int i=0;i<q.size();i++)
                for(int j=sum1;j<sum2;j++)
                {
                    // System.out.println(x.get(i));
                    if((q.get(i).get(0)==x.get(j).get(0)&&q.get(i).get(1)==x.get(j).get(1))||(q.get(i).get(0)==x.get(j).get(1)&&q.get(i).get(1)==x.get(j).get(0)))
                        count--;
                }
                sum1=sum2;



//            for(int i=0;i<n;i++)
//                System.out.print(a[i]+" ");
//            System.out.println(" ");
            System.out.println(count);
             c++;

        }

    }
}
