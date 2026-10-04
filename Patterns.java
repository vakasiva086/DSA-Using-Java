
import java.util.*;

class Patterns {
    /*public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            int stars = n;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        int st=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++)
            {
                System.out.print("*");
            }
            st+=1;
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void pattern4(int n){
    for(int i=1;i<=n;i++){
        int spaces=n-i;
        for(int k=1;k<=spaces;k++)
        {
            System.out.print(" ");
        }
        int stars=i;
        for(int j=1;j<=stars;j++)
        {
            System.out.print("*");
        }
        System.out.println();  
    }
    }*/
   public static void pattern5(int n){
    int st=1;
    int rval=1;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=st;j++)
        {
            System.out.print(rval+" ");
        }
    st++;
    rval++;
    System.out.println();
}
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern5(n);
        sc.close();
    }
}