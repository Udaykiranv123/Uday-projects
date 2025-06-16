
package xyz;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] str = {"Sak","Pra","Vam","Shak","Vish"};

        System.out.println("Original Array : "+ Arrays.toString(str));

        //using bubble sort
        bubble_sort(str);
        System.out.println("Sorted using Bubble sort : "+Arrays.toString(str));

        sort(str);
        System.out.println("Sorted using Arrays.sort() "+ Arrays.toString(str));
    }
    public static void bubble_sort(String[] arr){
        int n = arr.length;;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    public static void sort(String[] arr){
        Arrays.sort(arr);
    }
}
