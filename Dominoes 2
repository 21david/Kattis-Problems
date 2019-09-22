/*
Time limit exceeds
*/

import java.util.*;
import java.io.*;

class Main 
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        
        int cases = scan.nextInt();
        int n, m, l;
        for(int i = 0; i < cases; i++)
        {
            n = scan.nextInt();
            m = scan.nextInt();
            l = scan.nextInt();
            
            int[] array = new int[n];
            Arrays.fill(array, -1);
            

            for(int mI = 0; mI < m; mI++)
            {
                array[scan.nextInt() - 1] = scan.nextInt() - 1;
            }

         //   System.out.println(Arrays.toString(array));

            int totalCount = 0;

            for(int lI = 0; lI < l; lI++)
            {
                int knock = scan.nextInt() - 1;
                int count = 0;

                while(knock != -1)
                {
                    count++;
                    knock = array[knock];
                }

                totalCount += count;
            }

            System.out.println(totalCount);
        }
    }
}
