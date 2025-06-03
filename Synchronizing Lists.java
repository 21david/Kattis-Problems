/*
https://open.kattis.com/contests/wq6ywu/problems/synchronizinglists
*/

import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        int size = 0;

        // each iteration is one test case
        while(scan.hasNextInt())
        {
            size = scan.nextInt();

            if(size == 0)
                break;

            int[] array1 = new int[size];
            int[] array2 = new int[size];

            // iterate through first list
            for(int i = 0; i < size; i++)
                array1[i] = scan.nextInt();

            // iterate through second list
            for(int i = 0; i < size; i++)
                array2[i] = scan.nextInt();

            /*
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
            */

            // before sorting, we need the order of the original array1
            int[] original = array1.clone();

            
            Arrays.sort(array1);
            Arrays.sort(array2);

            /*
            System.out.println(Arrays.toString(original));
            System.out.println("sorted: " + Arrays.toString(array1));
            System.out.println("sorted: " + Arrays.toString(array2));
            */

            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < array1.length; i++)
            {
                map.put(array1[i], array2[i]);
            }

           // System.out.println(map);

            // using original order, print out the corresponsing values
            for(int i = 0; i < size; i++)
            {
                System.out.println(map.get(original[i]));
            }

            System.out.println();
        }

    }
}
