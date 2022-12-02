package com.o15Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import static com.o15Graph.raj01.DfsOfGraph;

public class raj01 {

    public static void main(String[] args) {

        // For a weighted graph put weight in place of 1
        int node=5,edge=6;
        int[][] adj=new int[node+1][node+1]; // for 1 indexed
        matrix(adj,1,2);
        matrix(adj,1,3);
        matrix(adj,3,4);
        matrix(adj,2,4);
        matrix(adj,2,5);
        matrix(adj,4,5);
        printGraph(adj);
        System.out.println(BFS(adj,node));
        System.out.println(DFS(adj,node));
    }

    //Graph representation using matrix
   static public void matrix(int[][] adj,int u,int v){

//        edge u--v
        adj[u][v]=1;
        adj[v][u]=1; // for directed remove this one


/*        edge u--v
*       adj[u][v]=1;
*       adj[v][u]=1;
*/
    }

   static public void printGraph(int[][] adj){

        for(int i=0;i<adj.length;i++){
            for(int j=0;j<adj[i].length;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static List<Integer> BFS(int[][] adj,int v){

        List<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[v+1]; // Here v denotes nu,ber of vertices

        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);  // as I already know about the source data
        visited[1]=true;

        while (!q.isEmpty()){

            Integer vis=q.poll();
            bfs.add(vis);

            for(int i=0;i<=v;i++){
                if(adj[vis][i]==1 && (!visited[i])){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        return bfs;
    }

    public static List<Integer> DFS(int[][] adj,int vertex){
        List<Integer> lis=new ArrayList<>();
        boolean[] vis=new boolean[vertex+1];
        vis[0]=true;

        DfsOfGraph(lis,1,vis,adj);

        return lis;
    }

    public static void   DfsOfGraph(List<Integer> lis,int start,boolean[] vis,int[][] adj){

        lis.add(start);
        vis[start]=true;

        for (int i=0;i<adj[start].length;i++){
            if(adj[start][i]==1 && (!vis[i])){
                DfsOfGraph(lis,i,vis,adj);
            }
        }
    }
}
