import static sun.swing.MenuItemLayoutHelper.max;

public class Knapsack {

   void knapsack(int W,int n,int wt[],int val[]){
       int i,j;
       int V[][] = new int[n+1][W+1];
       for ( i=0;i<W;i++){
           V[0][i]=0;
       }
       for (j=0;j<n;j++){
           V[j][0] =0;
       }
       for (i=1;i<n;i++){
           for (j=1;j<=W;j++){
               if (wt[i]<j){
                   V[i][j] = max(V[i-1][W],val[i]+V[i-1][j- wt[i]]);
               }
               else {
                   V[i][j] = V[i-1][j];
               }
           }
       }

       System.out.println("Max Profit "+ V[n][W]);

   }

    public static void main(String[] args) {

       int n = 4,W=8;
       int val[]={-1,1,2,5,6};
       int wt[] ={-1,2,3,4,5};
       Knapsack k =new Knapsack();
       k.knapsack(W,n,wt,val);



    }
}
