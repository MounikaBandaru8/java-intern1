//Java Program to check whether the given array is Mirror Inverse or not.
public class prog8array
{

    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[arr[i]] != i)
                return false;
        }
 
        return true;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 2,3,5,9};
        if (isMirrorInverse(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
