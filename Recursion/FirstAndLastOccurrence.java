package Recursion;

public class FirstAndLastOccurrence {
    static int first = -1;
    static int last = -1;
    public static void Occurrence(String str, int idx,char ch){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(idx)==ch){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        Occurrence(str, idx+1, ch);
    }
    public static void main(String[] args) {
        Occurrence("abacdaef",0,'a');
    }
}
