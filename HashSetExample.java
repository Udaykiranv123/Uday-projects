package dsa;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> studentList = new HashSet<>();

        studentList.add("ram");
        studentList.add("jam");
        studentList.add("kon");

        System.out.println("StudentList: " + studentList);
    }
}