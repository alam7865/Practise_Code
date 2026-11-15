public class cal_Pow {

    // public static int Cal(int x,int n)
    // {
    //     if(n<=1)
    //     {
    //         return x;
    //     }

    //     int half=Cal(x, n/2);

    //     if(n%2!=0)
    //     {
    //         return half*half*x;
    //     }

    //     return half*half;
    // }

    public static String solve(String str,int arr[],int x,StringBuilder sb)
    {
        if(x==str.length())
        {
            return sb.toString();
        }

        char ch=str.charAt(x);

        if(arr[ch-'a']==0)
        {
            sb.append(ch);
            arr[ch-'a']++;
        }

        return solve(str, arr, x+1, sb);
    }
    public static void main(String[] args) {
        // System.out.println("Hello Bhai. ");

        // int ans=Cal(2,6);
        // System.out.println("Result: " + ans);



        // remove dublicate from a string

        String str="programming";
        int arr[]=new int[26];
        StringBuilder sb=new StringBuilder();
        String ans=solve(str,arr,0,sb);

        System.out.println(ans);
    }
}
