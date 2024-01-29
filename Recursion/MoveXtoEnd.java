package Recursion;

public class MoveXtoEnd {
    public static int count = 0;
    public static void MoveEnd(String str,String newstr,int idx){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        if(str.charAt(idx)=='x'){
            count++;
        }else{
            newstr+=str.charAt(idx);
        }
        MoveEnd(str, newstr, idx+1);

    }
    public static void main(String[] args) {
        MoveEnd("axbxxcd","",0);
    }
}
