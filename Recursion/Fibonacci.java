package Recursion;

public class Fibonacci {
    public static void Fibbo(int a,int b,int n,int i){
        if(i==n){
            return;
        }
        int c=a+b;
        a=b;
        b=c;
        System.out.println(c);
        Fibbo(a, b, n, i+1);
    }
    public static void main(String[] args) {
        Fibbo(0, 1, 6, 0);
    }
}
