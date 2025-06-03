/*
https://open.kattis.com/contests/yg7mqk/problems/nine
*/

/*
The use of BigInteger.modPow() greatly increased the speed of my algorithm, compared to before
(i was multiplying by 9 up to 10^18 times. modPow() does this almost instantly.)
*/

import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte T = Byte.parseByte(br.readLine());
        
        for(int i = 0; i < T; i++)
        {
            long d = Long.parseLong(br.readLine());

            d--;
        
            BigInteger dMinusOne = new BigInteger("" + d);

            BigInteger mod = new BigInteger("1000000007");  

            BigInteger ans = new BigInteger("9");

            ans = ans.modPow(dMinusOne, mod);

            ans = ans.multiply(new BigInteger("8"));

            ans = ans.mod(mod);

            System.out.println(ans);
        }
        
    }
}
