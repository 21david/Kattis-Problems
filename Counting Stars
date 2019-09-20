/*
https://open.kattis.com/contests/x8wpj5/problems/countingstars
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        int caseCounter = 1;
        boolean[][] matrix;
        boolean[][] visited;
        
        while(scan.hasNextLine())
        {
            // obtain rows and cols of test case
            int rows = scan.nextInt();
            int cols = scan.nextInt();
            scan.nextLine();
            
            // set up the matrix
            matrix = new boolean[rows][cols];
            String row;
            
            for(int i = 0; i < rows; i++)
            {
                row = scan.nextLine();
                for(int j = 0; j < row.length(); j++)
                {
                    if(row.charAt(j) == '-')
                        matrix[i][j] = true;
                }
            }
            
            // find number of stars using union find
            
            visited = new boolean[rows][cols];
            int stars = 0;
            
            for(int r = 0; r < rows; r++)
            {
                for(int c = 0; c < cols; c++)
                {
                    if(matrix[r][c] == true && !visited[r][c])
                    {
                        stars++;
                        fill(matrix, visited, r, c);
                    }
                }
            }
            
            System.out.println("Case " + caseCounter + ": "  + stars);
            caseCounter++;
            
        }
    }
    
    public static void fill(boolean[][] matrix, boolean[][] visited, int r, int c)
    {
        if(outOfBounds(matrix, r, c))
            return;
            
        if(visited[r][c])
            return;
        
        if(matrix[r][c] == true)
        {
            visited[r][c] = true;
            
            fill(matrix, visited, r - 1, c);
            fill(matrix, visited, r + 1, c);
            fill(matrix, visited, r, c - 1);
            fill(matrix, visited, r, c + 1);
        }
    }
    
    public static boolean outOfBounds(boolean[][] matrix, int r, int c)
    {
        if(r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length)
            return true;
        else
            return false;
    }
}
