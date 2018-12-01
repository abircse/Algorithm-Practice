public class FloydWarshall {
    final  static int INF=99999;
    int v=4;

    void Floyd(int g[][]){
        int d[][]=new int[v][v];
        for (int i=0;i<v;i++)
        {
            for (int j=0;j<v;j++){
                d[i][j]=g[i][j];
            }
        }
        for (int k=0;k<v;k++){
            for (int i=0;i<v;i++){
                for (int j=0;j<v;j++){
                    if ((d[i][k]+d[k][j])<d[i][j]){
                        d[i][j]=d[i][k]+d[k][j];
                    }
                }
            }
        }
        print(d);
    }
    void print(int d[][]){

        for (int i=0;i<v;i++){
            for (int j=0;j<v;j++){

                if (d[i][j]==INF){
                    System.out.print("INF"+" ");
                }else {
                    System.out.print(d[i][j]+" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

//        int g[][]={ {0,5,INF,10},
//                {INF,0,3,INF},
//                {INF,INF,0,1},
//                {INF,INF,INF,0}};
        int g[][]={{0,3,INF,7},
                {8,0,2,INF},
                {5,INF,0,1},
                {2,INF,INF,0}};
        FloydWarshall fw=new FloydWarshall();
        fw.Floyd(g);
    }

}
