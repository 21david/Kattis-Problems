/*
https://open.kattis.com/contests/x8wpj5/problems/nodup
*/

import java.util.Scanner;
import java.util.HashSet;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        
        HashSet<String> set = new HashSet<>();
        
        for(String w : words)
            if(set.contains(w))
            {
                System.out.println("no");
                return;
            }
            else
                set.add(w);
            
        System.out.println("yes");
            
    }
}
