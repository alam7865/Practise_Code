public class checkArray_Sorted {

    public static boolean Check_Sorted(int arr[],int idx,int n)
    {
        if(idx==n)
        {
            return true;
        }

        if(arr[idx]<arr[idx-1])
        {
            return false;
        }

        return Check_Sorted(arr, idx+1, n);
    }
    public static void main(String[] args) {
        // System.out.println("Hello");

        int arr[]={1,2,4,5};

        boolean ans=Check_Sorted(arr,1,arr.length);
        System.out.println("Result: " + ans );
    }
}
