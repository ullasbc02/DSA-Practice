package DSAApna;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "a race car";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                str += Character.toLowerCase(s.charAt(i)) ;
            }
            if((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122){
                str+=s.charAt(i);
            }
        }
        System.out.println("The string is : "+str);
        int low = 0, high = str.length()-1;
        while(low<=high){
            if(str.charAt(low)!=str.charAt(high)){
                System.out.println(false);
            }
            low++;high--;
        }
    }

}
