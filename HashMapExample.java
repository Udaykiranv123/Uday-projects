package dsa;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> studentList = new HashMap<>();

        studentList.put(1, "dho");
        studentList.put(2, "fho");
        studentList.put(3, "jho");

        System.out.println("Student List: " + studentList);
    }
}