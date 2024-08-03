public class array2
{
    public static void main(String[] args)
    {
       int nums[][]  =  new int[3][];
       nums[0]= new int[4];
        nums[1]= new int[8];
        nums[2]= new int[2];
      // nums [0][0]=5;
      // nums [0][1]=6;
      // nums [1][ 0]=8;
      // nums [1][1]=10;
      // nums [2][0]=2;
      // nums [2][1]=1;

     // int nums[][]={
     //                 {5,6,3,4},
     //                 {10,9},
     //                 {8,2,20}
     //               };


        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
