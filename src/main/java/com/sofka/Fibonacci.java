package com.sofka;

public class Fibonacci {
    public static void main(String[] args) {
        // Serie fiibonacci 1,1,2,3,5,8,11,...
        int x = 1;
        int anterior = 0;
        int temp;
        while(true)
        {
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;

            if( x > 30)
            {break;}
        }
    }
}
