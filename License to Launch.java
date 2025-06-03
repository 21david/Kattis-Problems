/*
https://open.kattis.com/contests/wq6ywu/problems/licensetolaunch
*/

import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        
        int days = scan.nextInt();
        
        // obtain first values to compare with the rest
        int minIndex = 0;
        int min = scan.nextInt();
        
        // iterate through the days, finding the one with minimum space junk
        // store both the index of the minimum and the minimum space junk value itself
        for(int i = 1; i < days; i++)
        {
            int junk = scan.nextInt();
            
            if(junk < min)
            {
                minIndex = i;
                min = junk;
            }
        }
        
        // print out the index of the minimum day
        System.out.println(minIndex);
    }
}
