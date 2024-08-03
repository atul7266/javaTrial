
class java{
    public int add(int nums[])
    {
        int result=0;
        for (int n:nums)
        {
            result=result+n;
        }
        return result;
    }
}

public class array6 {
    public static void main(String[] args)
    {
         java obj=new java();
        //int nums[]={1,15,20,90};
         int result= obj.add(new int[]{2,4,6,8,10,12,14,16,18,20});
        System.out.println(result);
    }
}
