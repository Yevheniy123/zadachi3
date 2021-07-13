package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double a,b,c,D,P,x,y=0;
        a=Math.random()*10;
        b=Math.random()*10;
        c=Math.random()*10;
        System.out.println(a+" "+b+" "+c);
        D=b*b-(4*a*c);
        System.out.println("D="+D);
        if (D>0)
        {
            System.out.println("x1="+((-b+(Math.sqrt(D)))/2*a));
            System.out.println("x2="+((-b-(Math.sqrt(D))/2*a)));
        }
        else if (D==0) {System.out.println("x="+(-b/(2*a)));}
        else System.out.println("Нет корней");
        System.out.println("_________________");

        a=Math.random()*10;
        b=Math.random()*10;
        System.out.println("P="+(2*(a+b)));
        System.out.println("S="+(a*b));
        System.out.println("_________________");
        P=Math.random()*100;
        if(P>0)
        {
            System.out.println("a="+(P/4));
        }
        else System.out.println("Периметр меньше нуля ;(");
        System.out.println("_________________");
        // 1 task
        a=Math.random()*10;
        b=Math.random()*10;
        c=Math.random()*10;
        if (((2*a)!=0) && (Math.sqrt(b*b+(4*a*c))!=0))
        {
            System.out.println(((b+ Math.sqrt(b*b+(4*a*c)))/2*a)+Math.pow(b,3)*c+(b*(-b)));
        }
        System.out.println("_________________");
        // 2 task
        x=Math.random()*10;
        System.out.println(x-(Math.pow(x,3)/3)+(Math.pow(x,5)/5));
        System.out.println("_________________");
        // 3 task
        x=Math.random()*10;
        y=Math.random()*10;
        if(y!=1 && x!=34)
        {
            System.out.println(((x+y)/(y+1))-((x*y-12)/(34+x)));
        }
        else System.out.println("Error");
        System.out.println("_________________");
        // 4 task
        x=Math.random()*10;
        if(x!=1 && x!=-1)
        {
            System.out.println(Math.sin(Math.sqrt(x+1)-Math.sqrt(x-1)));
        }
        else System.out.println("Error");
        System.out.println("_________________");
        // 5 task
        x=Math.random()*10;
        y=Math.random()*10;
        System.out.println((Math.pow((1-Math.tan(x)),(Math.cos(x)/Math.sin(x))))+Math.cos(x-y));
        System.out.println("_________________");
        // 6 task
        x=Math.random()*10;
        y=Math.random()*10;
        System.out.println(Math.log(Math.abs(y-Math.sqrt(Math.abs(x)))*(x-(y/(x+((x*x)/4))))));
    }
}
