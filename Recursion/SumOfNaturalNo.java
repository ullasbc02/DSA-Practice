package Recursion;



public class SumOfNaturalNo{
    public static void PrintSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println("The sum of natural numbers from 1 to "+n+" is: "+sum);
            return;
        }
        sum+=i;
        PrintSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        PrintSum(0,5,0);
    }
}