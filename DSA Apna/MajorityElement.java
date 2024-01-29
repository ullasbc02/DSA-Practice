import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
       int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
       Map<Integer, Integer> count = new HashMap<>();
       for (int i = 0; i < arr.length; i++){
        if(count.containsKey(arr[i]))
            count.put(arr[i],count.get(arr[i])+1);
        else    
            count.put(arr[i],1);
       }
       for(Map.Entry<Integer,Integer> entry : count.entrySet()){
        if(entry.getValue()>arr.length/2){
            System.out.println("Key: " + entry.getKey() +"Value: " +entry.getValue());
        }
       }
    }
}
