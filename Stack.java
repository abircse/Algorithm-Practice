package com.company.Algorithm;
import java.util.Scanner;

public class Stack {
    final int max=10;
    int s[]=new int[max];
    int top =-1;
    void push(int element){
        if (top>=max-1)
            System.out.println("Stack Overflow");
        else
            s[++top]=element;
    }

    int pop(){
        int z=0;
    if (top == -1)
        System.out.println("Underflow");
    else
        z=s[top--];
    return z;
    }
    void display(){
        if (top==-1)
            System.out.println("Stack is empty");
        else {
            for (int i=top;i>=0;i--)
                System.out.println("Stack is --> " + s[i]);
        }
    }



    public static void main(String[] args) {
        Stack stack=new Stack();
        Scanner sc=new Scanner(System.in);
        int a=1;
        while (a!=0)
        {
            System.out.println("Enter 1 for push,2 for Pop,3 for Display, 4 for Exist");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter the element to be inserted-->");
                    int e=sc.nextInt();
                    stack.push(e);
                    break;
                case 2:
                     int p=stack.pop();
                    System.out.println("Element poped out --->"+p);
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    a=0;
                    break;
            }
        }
    }
}
