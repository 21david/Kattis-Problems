/*
https://open.kattis.com/contests/x8wpj5/problems/lastfactorialdigit
*/

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            int fac = 1;
            int inputNum = scan.nextInt();
            
            while(inputNum > 1)
            {
                fac *= inputNum;
                inputNum--;
            }
            
            System.out.println(fac % 10);
        }
        
        
    }
}
