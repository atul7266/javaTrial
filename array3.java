public class array3 {
    public static void main(String[] args)
    {
       // int nums[]={5,8,2,5};

       // for (int n:nums)
       // {
       //     System.out.println(n);
       // }

        int nums[][]={  {6,9,10,8},{5,8,1,0},{8,9,8,15} };

        for (int a[] :nums)
        {
            for (int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
