package Recursion;

public class ReverseString {
    public static void Reverse(String str, int count){
        if(count == -1){
            return;
        }
        System.out.print(str.charAt(count));
        Reverse(str, --count);
    }
    public static void main(String[] args) {
        Reverse("abcd","abcd".length()-1);
    }
}
