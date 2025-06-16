
package xyz;
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String rev = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            rev = rev+name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println(name+" is a palindrome");
        }else{
            System.out.println(name+" is not a palindrome");
        }
        sc.close();
    }
}
