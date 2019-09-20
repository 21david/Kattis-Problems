/*
https://open.kattis.com/contests/x8wpj5/problems/batterup
*/

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int denom = 0;
        int total = 0;
        int number = 0;
        
        for(int i = 0; i < n; i++)
        {
            number = scan.nextInt();
            
            if(number >= 0)
            {
                total += number;
                denom++;
            }
        }
        
        double answer = (double) total / denom;
        
        System.out.println(answer);
    }
}
