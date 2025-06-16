package xyz;

import java.util.*;

public class ToDoList_UrgentTask {
    public static void main(String[] args) {
        Queue<String> taskQueue = new java.util.PriorityQueue<>();
        taskQueue.add("Eat 🍕");
        taskQueue.add("Sleep 😴");
        taskQueue.add("Code 🧑🏻‍💻");

        System.out.println("Urgent Task :");
        System.out.println(taskQueue.poll());
    }
}