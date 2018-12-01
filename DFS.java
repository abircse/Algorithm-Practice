import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    int V;
    LinkedList<Integer> adj[];
    DFS(int v){
        V=v;
        adj=new LinkedList[v];
        for (int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }
    void addEdge(int v,int w){
        adj[v].add(w);
    }

    void Dfs(int src){
        boolean visited[] = new boolean[V];
        dfsUtil(src,visited);
    }
    void dfsUtil(int src,boolean visited[]){
        visited[src] = true;
        System.out.println(src);
        Iterator<Integer> it = adj[src].listIterator();
        while (it.hasNext()){
            int n=it.next();
            if (!visited[n]){
                dfsUtil(n,visited);
            }
        }
    }


    public static void main(String[] args) {

        DFS d =new DFS(100);

        /*d.addEdge(0,1);
        d.addEdge(0,2);
        d.addEdge(1,2);
        d.addEdge(2,0);
        d.addEdge(2,3);
        d.addEdge(3,3);*/
        d.addEdge(40,10);
        d.addEdge(40,20);
        d.addEdge(10,30);
        d.addEdge(30,60);
        d.addEdge(60,70);
        d.addEdge(20,10);
        d.addEdge(20,60);
        d.addEdge(20,50);
        d.addEdge(50,70);


        d.Dfs(40);

    }
}
