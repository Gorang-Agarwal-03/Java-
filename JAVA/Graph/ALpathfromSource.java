import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ALpathfromSource {
    
    public static class Edge{
           int scr;
           int dest;
           
           public Edge(int s,int d){
            this.scr = s;
            this.dest = d;
        }
    }

    public static void creatgraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
        
    }
    
    public static void printallpath(ArrayList<Edge> graph[],boolean vis[], int curr , String path  , int tar ){
        if(curr == tar){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]= true;
                printallpath(graph, vis, e.dest, path+e.dest, tar);
                vis[curr] = false;
            }

        }
    }


        public static void main(String[] args) {
            int V = 7;

            ArrayList<Edge> graph[] = new ArrayList[V]; 
            
            creatgraph(graph);
            boolean vis[] = new boolean[V];

            int scr=0, tar = 5;
            printallpath(graph, new boolean[V], scr, "0", tar);
            }
        
    }

