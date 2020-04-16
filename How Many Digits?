/*
https://open.kattis.com/problems/howmanydigits
*/

import java.util.*;
import java.io.*;
import java.math.BigInteger;

/*
Approach:
Calculate the number of digits in N! by using a formula and an array

The number of digits in a factorial creates a series (  oeis.org/A034886/list  )
and the nth number can be computed by working up to that number in a loop fashion
instead of calculating the actual factorial (which works but is much slower).
*/

class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        double[] digits = new double[1000000 + 1];
        digits[0] = 1;
        int maxI = 1;

        int cur;
        String line = "";
        while((line = br.readLine()) != null)
        {
            cur = Integer.parseInt(line);

            if(digits[cur] == 0)
            {
                int i = maxI;
                while(i < cur + 1)
                {
                    digits[i] = digits[i - 1] + Math.log10(i);
                    i++;
                }
                maxI = i;
            }

            System.out.println((int) Math.floor(digits[cur]));
        }
    }
}
