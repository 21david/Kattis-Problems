/*
https://open.kattis.com/contests/x8wpj5/problems/quickbrownfox
*/

import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();
        
        for(int i = 0; i < n; i++)
        {
            // get the input string at question
            String pangram = scan.nextLine();
            
            int[] lettersCount = new int[26];
            
            // count occurence of each letter
            for(char c : pangram.toCharArray())
            {
                if(Character.isLetter(c))
                {
                    lettersCount[Character.toLowerCase(c) - 'a']++;
                }
            }
            
            // iterate through lettersCount, if missing some, add to missing arraylist
            ArrayList<Character> missing = new ArrayList<>();
            
            for(int l = 0; l < 26; l++)
            {
                if(lettersCount[l] == 0)
                    missing.add((char) ('a' + l));
            }
            
            // if 'missing' arraylist is nonempty, print the missing letters
            if(!missing.isEmpty())
            {
                System.out.print("missing ");
                
                for(int m = 0; m < missing.size(); m++)
                {
                    System.out.print(missing.get(m));
                }
                System.out.println();
            }
            else // else it is a pangram
                System.out.println("pangram");
        }
    }
}
