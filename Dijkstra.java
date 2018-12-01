public class Dijkstra {
    final static int INF=9999;
    int v=4;
    int min(int d[],boolean b[]){
     int min=INF;
        int index=-1;
        for (int i=0;i<v;i++){
            if (b[i]==false && d[i]<=min){
                min=d[i];
                index=i;
            }
        }
        return  index;
    }
    void dijkstra(int src,int g[][]){
       int d[]=new int[v];
       boolean b[] = new boolean[v];
       for (int i=0;i<v;i++){
           d[i]=INF;
           b[i]=false;
       }
       d[src]=0;
       for (int c=0;c<v;c++){
           int u=min(d,b);
           b[u]=true;
           for (int j=0;j<v;j++){
               if (!b[j] && g[u][j]!=0 && d[u]!=INF && (d[u]+g[u][j]<d[j])){
                   d[j]=d[u]+g[u][j];
               }
           }
       }
       print(d);

    }
    void print(int d[]){
        for (int i=0;i<v;i++){
            System.out.println(d[i]);
        }
    }
    public static void main(String[] args) {
    int g[][]={{0,2,5,0},{0,0,1,0},{0,0,0,3},{0,0,0,0}};
    Dijkstra d= new Dijkstra();
    d.dijkstra(0,g);
    }
}
