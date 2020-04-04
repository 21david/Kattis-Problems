/*
https://open.kattis.com/contests/wq6ywu/problems/kitten
*/

import java.util.*;
import java.io.*;

/*
Approach:
Create a map that puts each branch as a key, and its parent as a value

Then, starting from the kitten's location, repeatedly visit the parent of whatever branch you're on, until the root is reached
*/

class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        int kittenLocation = scan.nextInt();
        scan.nextLine();

        // key: a branch
        // value: the parent of that branch
        HashMap<Integer, Integer> map = new HashMap<>();

        // iterate through each line
        // fill up the hashmap
        while(scan.hasNextLine())
        {
            String line = scan.nextLine();

            Scanner scanLine = new Scanner(line);

            int parent = scanLine.nextInt();

            while(scanLine.hasNextInt())
                map.put(scanLine.nextInt(), parent);


            if(line.equals("-1"))
                break;
        }

        // use the hashmap to find a path from the kitten to the root
        String path = "" + kittenLocation;

        while(map.containsKey(kittenLocation))
        {
            kittenLocation = map.get(kittenLocation);
            path +=  " " + kittenLocation;
        }

        System.out.println(path);
    }
}
