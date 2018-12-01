public class InsertionSort {
    void insertionSort(int arr[]){
        int i,j,key,n;
        n=arr.length;
        for (j=1;j<n;j++){
            key=arr[j];
            i=j-1;
            while (i>=0&& arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }
    }
    void display(int arr[]) {
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,78,1,23,98,20,800};
       // long startTime=System.nanoTime();
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        //long endTime=System.nanoTime();
        is.display(arr);
        //long elapsedTime = endTime - startTime;
        //System.out.println("Time Taken to Sort "+elapsedTime +" nano Second");
    }
}
