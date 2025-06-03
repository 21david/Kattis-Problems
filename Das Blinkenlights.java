/*
https://open.kattis.com/contests/x8wpj5/problems/dasblinkenlights
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args)
    {
        // find the least common multiple of p and q. If that number is <= seconds,
        // they will blink at the same time before the seconds run out, else, they won't.
    
        Scanner scan = new Scanner(System.in);
        int p, q, s;
        p = scan.nextInt();
        q = scan.nextInt();
        s = scan.nextInt();
        
        if(lcm(p, q) <= s)
            System.out.println("yes");
        else
            System.out.println("no");
        
        
    }
    
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0)
            return 0;

        return (a * b) / gcd(a, b);
    }
    
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        
        return gcd(b, a % b);
    }
}
