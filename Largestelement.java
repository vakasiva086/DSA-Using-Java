import java.util.*;
class Largestelement{
   public static int large(int [] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            {
                max=a[i];
            }
        }
       return max;
    }
    static int binarysearch(int a[],int target){
        int low=0,high=a.length-1;
        int mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==target)
             return mid;
            else if(a[mid]<target)
                low=mid+1;
            else if(a[mid]>target)
                high=mid-1;
        }
        return -1;
    }
    public static int reverse(int a[])
    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
       System.out.println(large(a));
        System.out.println(binarysearch(a,target));
        reverse(a);
        for(int i=0;i<a.length;i++)
        {

            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
