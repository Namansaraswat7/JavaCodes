package CodingExcecises;

import java.util.Scanner;

public class ChefAndHisCharacters {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int t =0;

        if(S.hasNextInt())
            t=S.nextInt();

        while(t-->0)
        {
            String str = S.next();
            int count=0;

            for(int i=0;i<str.length()-3;i++)
            {
                String substr=str.substring(i,i+4);
                if(substr.contains("c")&&substr.contains("h")&&substr.contains("e")&&substr.contains("f"))
                    count++;
            }
            if(count==0)
                System.out.println("normal");
            else
            {
                System.out.println("lovely"+ " "+count);
            }



        }
    }
}
