package com.Anupam;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ans =0;
        while(true){
            System.out.print("Enter operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op =='*' || op == '/' || op =='%'){
                System.out.print("Enter numbers: ");
                Scanner n= new Scanner(System.in);
                int num1=n.nextInt();
                int num2=n.nextInt();
                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }
                if(op=='/'){
                    if(num1 !=0 ){
                        ans=num1/num2;
                    }else{
                        System.out.println("Not possible !!");
                        continue;
                    }
                }
            } else if(op == 'x' || op == 'X') {
                break;
            } else{
                System.out.println("Invalid input");
            }
            System.out.println(ans);
        }
    }
}
