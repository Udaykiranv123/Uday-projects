package app;
import java.util.TreeSet;

public class LibraryBookIDs_Task {
    public static void main(String[] args) {
        TreeSet<Integer> lib = new TreeSet<>();
        lib.add(5002);
        lib.add(4998);
        lib.add(5005);
        lib.add(4999);
        lib.add(5001);

        System.out.println("First book Id in library: "+lib.first());
        System.out.println("Last book Id in library: "+lib.last());
        System.out.println("the ID just higher than 4999 is : "+lib.higher(4999));
        System.out.println("the ID just lower than 5005 is : "+lib.lower(5005));
    }
}