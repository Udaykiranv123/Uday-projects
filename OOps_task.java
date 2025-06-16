
package xyz;
import java.util.Scanner;
public class OOps_task{
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no : ");
        int roll = sc.nextInt();
        s1.setRoll_no(roll);
        sc.nextLine();
        System.out.print("Enter name of student : ");
        String name = sc.nextLine();
        s1.setName(name);

        System.out.print("Enter marks no : ");
        int marks = sc.nextInt();
        s1.setMarks(marks);

        s1.display_info();
    }
}
class Student{
    private String name;
    private int roll_no,marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
       return marks;
    }
    public String results(int marks){
        if(getMarks() > 40){
            return "Pass";
        }else{
            return "Fail";
        }
        
    }

    void display_info(){
        System.out.println("Roll no: "+roll_no);
        System.out.println("Name: "+name);
        System.out.println("Marks : "+marks);
        System.out.println("Result :"+results(marks));
        

    }
    
}
