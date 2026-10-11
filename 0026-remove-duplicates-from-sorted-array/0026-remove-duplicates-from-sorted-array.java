class Solution {
    public static int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[index++]=nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int length=removeDuplicates(a);
        for(Integer i:a)
        {
            System.out.println(i);
        }
    }
}