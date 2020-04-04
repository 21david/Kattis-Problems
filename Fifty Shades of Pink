/*
https://open.kattis.com/problems/fiftyshades
*/

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();

        scan.nextLine();
        
        String word = "";
        
        int countOfButtons = 0;
        
        for(int i = 0; i < N; i++)
        {
            word = scan.nextLine().toLowerCase();

            if(word.indexOf("rose") >= 0 || word.indexOf("pink") >= 0)
                countOfButtons++;
        }
        
        if(countOfButtons == 0)
            System.out.println("I must watch Star Wars with my daughter");
        else
            System.out.println(countOfButtons);
    }
}
