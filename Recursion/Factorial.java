package Recursion;

public class Factorial {
    public static int Fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factn = n*Fact(n-1);
        return factn;
    }
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
}
