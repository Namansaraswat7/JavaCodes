package BinarySearchProblems;

public class BinarySearchRecursion {
    int binarySearch(int arr[],int l,int r,int x){
        if(r>=l){
            //int mid=(l+r)/2;
            int mid = l + (r-1)/2;
            System.out.println(mid);

            if(arr[mid]==x)
                return mid;

            if(arr[mid]>x)
            {
                return binarySearch(arr,l,mid-1,x);
            }

            return binarySearch(arr,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String[] args) {

        BinarySearchRecursion b = new BinarySearchRecursion();
        int arr[]={2,3,4,10,40};
        int n= arr.length;
        int x=1;
        int result = b.binarySearch(arr,0,n-1,x);
        if(result==-1)
        {
            System.out.println("Element is not present ");
        }
        else System.out.println("Element is present at index "+result);
    }
}
