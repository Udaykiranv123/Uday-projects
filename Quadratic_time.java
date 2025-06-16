
package app;
public class Quadratic_time {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,3};
        boolean has_duplicate = false;


        //O(n2) = nested loops
        for (int i = 0; i < arr.length; i++) {
            for (int  j = i+1;  j < arr.length;  j++) {
                if(arr[i] == arr[j]){
                    has_duplicate = true;
                    System.out.println("Duplicate found : "+ arr[i]);
                }
            }
        }
        if(!has_duplicate){
            System.out.println("No duplicated found");
        }
    }
}
