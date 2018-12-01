package com.company.Algorithm;


import java.util.Scanner;

public class Student{
    String USN;
    String Name;
    String branch;
    int phone;


    void display(){
        System.out.println(USN+" "+Name+" "+branch+" "+phone );
    }

    void insert(String reg, String nm, String brnch, int ph)
    {
        USN=reg;
        Name=nm;
        branch=brnch;
        phone=ph;
    }



    public static void main(String args[])
    {
        int n;
        Student array[]=new Student[100];

        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Student: ");
        n=sc.nextInt();

        for(int i=0;i<n;i++)
            array[i]=new Student();

        for(int j=0;j<n;j++)
        {
            System.out.println("Enter user name: ");
            String usn=sc.next();
            System.out.println("Enter Name: ");
            String name=sc.next();
            System.out.println("Enter branch name: ");
            String branch=sc.next();
            System.out.println("Enter Phone number: ");
            int phone=sc.nextInt();

            array[j].insert(usn,name,branch,phone);
        }

        for(int k=0;k<n;k++)
        {
            array[k].display();
        }
    }
}
