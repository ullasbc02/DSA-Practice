public class CountingSort {
    public static void main(String[] args) {
        int []arr = {1,0,3,1,3,1};
        int m[] = new int[4];
        int arr2[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){ //counting and creating the array with the range
            m[arr[i]]++;
        }
        for(int i=1;i<m.length;i++){ //adding previous values in array
            m[i] = m[i-1]+m[i];
        }
        
        for(int i=m.length-1;i>0;i--){ //right shift the array
            m[i]=m[i-1];
        }
        m[0]= 0;
        for(int i=0;i<arr.length;i++){
            arr2[m[arr[i]]] = arr[i];
            m[arr[i]]++;
        }
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
