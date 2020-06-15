package BinarySearchProblems;

public class SearchINaRotatedSortedArray {
    private static int searchInRotatedarray(int arr[],int length,int key){
        int pos = findPivot(arr);
        int ans=-1;
        if(pos==-1)
        {
            return binarySearch(arr,length,key);
        }
        else {
            if(key==arr[pos])
                return pos;
            else if(key>arr[pos])
            {
                System.out.println("2");
                int newarr[]= new int[arr.length-pos];
                for (int i=0;i<newarr.length;i++)
                {
                    newarr[i]=arr[pos+i];
                }
                ans =binarySearch(newarr,newarr.length-1,key);
                if(ans==-1){
                    int newarrr[]= new int[pos];
                    for (int i=0;i<newarrr.length;i++)
                    {
                        newarrr[i]=arr[i];
                    }
                    ans =binarySearch(newarrr,newarrr.length-1,key);
                }
                else{
                    ans+=pos;
                }

            }
            else {

                System.out.println("3");
                int newarr[]= new int[pos];
                for (int i=0;i<newarr.length;i++)
                {
                    newarr[i]=arr[i];
                }
                ans =binarySearch(newarr,newarr.length-1,key);


            }
        }

        return ans;
    }

    private static int findPivot(int arr[]){
        int value = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(value>arr[i])
            {
                return i;
            }
            else
            {
                value =arr[i];
            }

        }
        return -1;
    }

    private static int binarySearch(int arr[],int length,int key){
    int s=0;
    int e=length;
    int ans=-1;
    while(s<=e)
    {
        int mid=(s+e)/2;
        if(arr[mid]==key) {
            ans=mid;
            s=e+1;
            //return mid;
        }
        if(arr[mid]<key)
        {
            s=mid+1;
        }
        else
        {
            e=mid-1;
        }

    }
    return ans;


    }
    public static void main(String[] args) {

        int arr[]= {60,70,10,20,30};
        System.out.println(searchInRotatedarray(arr,arr.length-1,50 ));
    }
}
