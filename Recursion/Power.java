package Recursion;

public class Power {
    public static int Pow(int a,int n){
        if(n==0){
            return 1;
        }
        int res = a*Pow(a, n-1);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Pow(2,4));
    }
}
