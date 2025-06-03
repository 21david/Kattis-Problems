/*
https://open.kattis.com/contests/neskij/problems/moneymatters
*/
/*
Each test case gives a graph. This graph is either entirely connected or divided into two or more disjoint graphs.
A test case is possible if the net sum of every disjoint graph is 0. If it is != 0 for any graph, it becomes impossible.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        
        int n =  scan.nextInt();
        int m = scan.nextInt();
        
        // iterate through debts and put them in debts array
        int[] debts = new int[n];
        for(int i = 0; i < n; i++)
        {
            debts[i] = scan.nextInt();
        }
//        System.out.println(Arrays.toString(debts));

        // iterate through friendships and form an adjacency list
        ArrayList[] adjList = new ArrayList[n];
        
        for(int i = 0; i < n; i++)
        {
            adjList[i] = new ArrayList<>();
        }
        
        int a, b;
        for(int i = 0; i < m; i++)
        {
            a = scan.nextInt();
            b = scan.nextInt();
            
            adjList[a].add(b);
            adjList[b].add(a);
        }
        
    //    System.out.println(Arrays.deepToString(adjList));

        // dfs on each node, marking them as visited.
        // as a node is dfs'd, it keeps a sum of the debts
        // if it nets out at anything other than 0, solution is impossible
        
        boolean[] visited = new boolean[n];
        int sum = 0;
        
        boolean solutionImpossible = false;
        
        // dfs on each node
        for(int i = 0; i < n; i++)
        {
            // begin dfs
            Stack<Integer> stack = new Stack<>();
            
            if(!visited[i])
            {
                stack.push(i);
            }
            else
                continue;
            
            while(!stack.isEmpty())
            {
            
                int node = stack.pop();
                
                if(visited[node])
                    continue;
                
                sum += debts[node];
                
                visited[node] = true;
                
                for(Object nd : adjList[node])
                {
                    if(!visited[(int) nd])
                    {
                        stack.push((int) nd);
                    }
                }
            }
            
       //     System.out.println(sum);

            if(sum != 0)
            {
                solutionImpossible = true;
                break;
            }
            
        }
        
        // after dfs on each node, it should know if its possible or not
        System.out.println(solutionImpossible? "IMPOSSIBLE" : "POSSIBLE");
        
        
    }
}
