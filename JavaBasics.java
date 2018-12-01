import java.util.Scanner;

public class JavaBasics {
    String USN;
    String Name;
    String Branch;
    int Phone;
     void insert(String usn,String name,String branch,int phone){
        USN=usn;
        Name=name;
        Branch=branch;
        Phone=phone;
    }
    void display(){
         System.out.println(Branch+" "+Name+" "+Branch+" "+Phone);
    }
    public static void main(String[] args) {
        int n;

        JavaBasics array[]=new JavaBasics[100];
        JavaBasics s=new JavaBasics();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for (int i=0;i<n;i++)
            array[i]=new JavaBasics();
        for (int j=0;j<n;j++){
            System.out.println("Enter UserName");
            String usn=sc.next();
            System.out.println("Enter Name");
            String name=sc.next();
            System.out.println("Enter Branch");
            String branch=sc.next();
            System.out.println("Enter Phone");
            int phone=sc.nextInt();
            array[j].insert(usn,name,branch,phone);
        }
        for (int k=0;k<n;k++){
            array[k].display();
        }

    }
}
