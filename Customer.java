import java.util.Scanner;
import java.util.StringTokenizer;

public class Customer {
    String Name,date;
    void read(){
        Scanner sc=new Scanner(System.in);
         Name=sc.next();
       date=sc.next();
    }
    void display(){
        System.out.println(Name+ " , ");
        String s="/";
        StringTokenizer st=new StringTokenizer(date,s);
       while (st.hasMoreElements()){
            if (st.countTokens()==1){
                System.out.print(st.nextElement()+"");
                break;
            }
           System.out.print(st.nextElement()+",");
       }
       System.out.println();
    }
    public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Customer: ");
        n=sc.nextInt();
      Customer[] customer=new Customer[50];
    for (int i=0;i<n;i++){
            customer[i]=new Customer();
            customer[i].read();
        }
        for (int i=0;i<n;i++){
            customer[i].display();
        }
    }
}